import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import itertools


optimizationsMap = { "optLnot" : "Negation","optIndexing" : "Indexing","optAssi" : "Cut-Assignment"}
optimizations = list(optimizationsMap.keys())
metrics = { "translateMS" : "Translation Time [ms]","loadMS" : "Load Time [ms]","analyzeMS" : "Analysis Time [ms]", "totalMS" : "Total Time [ms]"}

metricsOrdered = ["translateMS", "loadMS", "analyzeMS", "totalMS"]


metricsDescription = { "translateMS" : "Translation time","loadMS" : "Load time","analyzeMS" : "Analysis time", "totalMS" : "Total time"}

files = [
	"operations",
	"callgraph",
	"parameters",
	"values",
	"properties",
	"indexing-perftest",
	"negation-perftest"]

experimentNames = {
	"operations" : "measured for the scaling with the number of operations (\\textbf{\\ref{rq:operations}}).",
	"callgraph" : "measured for the scaling with the complexity of the call graph (\\textbf{\\ref{rq:callgraph}}).",
	"parameters" : "measured for the scaling with the number of parameters and return values (\\textbf{\\ref{rq:parameters}}).",
	"values" : "measured for the scaling with the number of attribute-value combinations (\\textbf{\\ref{rq:attributes}}).",
	"properties" : "measured for the scaling with the number of properties (\\textbf{\\ref{rq:attributes}}).",
	"indexing-perftest" : "measured for the first argument indexing optimization performance experiment (\\textbf{\\ref{rq:indexing}}).",
	"negation-perftest" : "measured for the negation optimization experiment (\\textbf{\\ref{rq:negation}})."
}

experimentAxis = {
	"operations" : "Number of Operations",
	"callgraph" : "Number of Operations",
	"parameters" : "Total number of Parameters and Return Values",
	"values" : "Total number of Attribute-Value combinations",
	"properties" : "Total number of Property-Value combinations",
	"indexing-perftest" : "Number of Operations",
	"negation-perftest" : "Number of Operations"
}
	
def genLatexIncludes(interpreters):
	file = open("latex.txt", "w")
	for exp in files:
		translationMsPlotted = False
		for metric in metricsOrdered:
			for interpreter in interpreters:
				prefix = metricsDescription[metric] +" "
				if metric == "translateMS":
					label = f"fig:evaluation:{exp}_{metric}"
					plotfile=f"img/evaluation/measurements/{exp}-{metric}.pdf"
					if translationMsPlotted:
						continue
					else:
						translationMsPlotted=True
				else: 
					label = f"fig:evaluation:{exp}_{metric}_{interpreter}"
					plotfile = f"img/evaluation/measurements/{exp}-{interpreter}-{metric}.pdf"
					prefix += f"of {interpreter} "
				caption = prefix + experimentNames[exp]
				
				file.write(f'''
\\begin{{figure}} \\centering
\\includegraphics[width=0.79\\textwidth]{{{plotfile}}}
\\caption{{{caption}}}
\\label{{{label}}}
\\end{{figure}}
				''')
			file.write("\\clearpage \n")
	file.close()						
				
		


def getLabel(opts):
	activeOpts = []
	for i in range(0,len(optimizations)):
		if opts[i]:
			activeOpts.append(optimizationsMap[optimizations[i]])
	cnt = len(activeOpts)
	if cnt == 0:
		return "No optimizations"
	elif cnt == 1:
		return f"{activeOpts[0]} optimization"
	elif cnt == 2:
		return f"{activeOpts[0]} and {activeOpts[1]} optimizations"
	elif cnt == 3:
		return f"{activeOpts[0]}, {activeOpts[1]} and {activeOpts[2]} optimizations"
		


for file in files:
	df = pd.read_csv(f"../measurements/final/{file}.csv")
	df['totalMS'] = df["translateMS"] + df["loadMS"] + df["analyzeMS"]
	g = df.groupby(["interpreter"])
	translationMsPlotted = False
	interpreters = list(g.groups)
	interpreters.sort()
	genLatexIncludes(interpreters)
	for interpreter in interpreters:
		data = g.get_group(interpreter)
		groupedByOpts = data.groupby(optimizations)
		for metric in metrics.keys():
			if metric == "translateMS":
				outfile=f"img/evaluation/measurements/{file}-{metric}.pdf"
				if translationMsPlotted:
					continue
				else:
					translationMsPlotted=True
			else: 
				outfile = f"img/evaluation/measurements/{file}-{interpreter}-{metric}.pdf"
			markers = itertools.cycle(('x', 'o', '^', '+', 'v')) 
			for opts in groupedByOpts.groups:
				optData = groupedByOpts.get_group(opts)
				meanVals = optData.groupby("n")[metric].agg(np.mean)
				meanVals.name = getLabel(opts)
				stdVals = optData.groupby("n")[metric].agg(np.std)
				ax = meanVals.plot(yerr=stdVals, marker=next(markers), linewidth =1)
				ax.set_ylabel(metrics[metric])
				ax.set_xlabel(experimentAxis[file])
			plt.legend(loc='upper left')
			fig = plt.gcf()
			fig.set_size_inches(8*1.2, 3.7 *1.2)
			plt.savefig(outfile, bbox_inches='tight')
			plt.clf()
	
