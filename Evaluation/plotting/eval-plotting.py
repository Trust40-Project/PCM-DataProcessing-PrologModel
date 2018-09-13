import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import itertools


optimizationsMap = { "optLnot" : "Negation","optIndexing" : "Indexing","optAssi" : "Cut-Assignment"}
optimizations = list(optimizationsMap.keys())
metrics = { "translateMS" : "translation time","loadMS" : "load time","analyzeMS" : "analysis time"}
files = [
	"operations",
	"callgraph",
	"parameters",
	"values",
	"properties",
	"indexing-perftest",
	"negation-perftest",
	"assignments-perftest"]


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
	g = df.groupby(["interpreter"])
	for interpreter in g.groups:
		data = g.get_group(interpreter)
		groupedByOpts = data.groupby(optimizations)
		for metric in metrics.keys():
			markers = itertools.cycle(('x', 'o', '^', '+', 'v')) 
			for opts in groupedByOpts.groups:
				optData = groupedByOpts.get_group(opts)
				meanVals = optData.groupby("n")[metric].agg(np.mean)
				meanVals.name = getLabel(opts)
				stdVals = optData.groupby("n")[metric].agg(np.std)
				meanVals.plot(yerr=stdVals, marker=next(markers), linewidth =1)
			plt.legend(loc='upper left')
			plt.xscale('logit')
			plt.yscale('logit')			
			fig = plt.gcf()
			fig.set_size_inches(10, 6)
			plt.savefig(f"{file}_{interpreter}_{metric}.pdf", bbox_inches='tight')
			plt.clf()
	
