package org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application.interpreters.PrologAdapter;
import org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application.interpreters.impl.EclipsePrologAdapter;
import org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application.interpreters.impl.JIPrologAdapter;
import org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application.interpreters.impl.SWIPrologAdapter;
import org.palladiosimulator.pcm.dataprocessing.prolog.evaluation.performance.application.performance.AveragePerformanceMeasurement;

public class HeadlessPerformanceApplication implements IApplication {
	
	interface PerformanceMeasurementConfiguration {
		PrologAdapter getInterpreter();
		int getNumberOfRepetitions();
		int getScaleFactor();
	}
	
	private final Map<String, Function<String, PrologAdapter>> factories = Collections.unmodifiableMap(createFactories());
	
	@Override
	public Object start(IApplicationContext context) throws Exception {
		Map<?, ?> contextArgs = context.getArguments();
		String[] appArgs = (String[]) contextArgs.get("application.args");
		PerformanceMeasurementConfiguration config = getMeasurementConfiguration(appArgs);
		
		new AveragePerformanceMeasurement(config.getInterpreter(), config.getNumberOfRepetitions(), config.getScaleFactor()).performMeasurements();
		
		return IApplication.EXIT_OK;
	}
	

	@Override
	public void stop() {
		// nothing to do
	}

	protected PerformanceMeasurementConfiguration getMeasurementConfiguration(String[] appArgs) throws ParseException {
		DefaultParser parser = new DefaultParser();
		
		Option interpreterOption = Option.builder("interpreter").desc("The Prolog interpreter to be used.").hasArg().required().build();
		Option pathOption = Option.builder("path").desc("The path of the interpreter").hasArg().build();
		Option numberOfRepetitionsOption = Option.builder("repetitions").desc("Specify the number of measurements taken for the same scenario.").hasArg().build();
		Option scalingFactorOption = Option.builder("scaling").desc("Specify factor for scaling the scaling factors.").hasArg().build();
		Options options = new Options();
		options.addOption(interpreterOption).addOption(pathOption).addOption(numberOfRepetitionsOption).addOption(scalingFactorOption);
		
		CommandLine commandLine = parser.parse(options, appArgs);
		
		String interpreterName = commandLine.getOptionValue(interpreterOption.getOpt());
		String pathName = commandLine.getOptionValue(pathOption.getOpt());
		int numberOfRepetitions = Integer.parseInt(commandLine.getOptionValue(numberOfRepetitionsOption.getOpt(), "10"));
		int scalingFactor = Integer.parseInt(commandLine.getOptionValue(scalingFactorOption.getOpt(), "1"));
		
		PrologAdapter interpreter = Optional.ofNullable(factories.get(interpreterName)).map(factory -> factory.apply(pathName)).orElseThrow(() -> new IllegalArgumentException("The given interpreter is not available."));
		
		return new PerformanceMeasurementConfiguration() {
			
			@Override
			public int getScaleFactor() {
				return scalingFactor;
			}
			
			@Override
			public PrologAdapter getInterpreter() {
				return interpreter;
			}

			@Override
			public int getNumberOfRepetitions() {
				return numberOfRepetitions;
			}
		};
	}

	protected Map<String, Function<String, PrologAdapter>> createFactories() {
		Map<String, Function<String, PrologAdapter>> factories = new HashMap<>();
		factories.put("swiprolog", path -> createPrologAdapter(SWIPrologAdapter.class, path));
		factories.put("jiprolog", path -> createPrologAdapter(JIPrologAdapter.class, path));
		factories.put("eclipse", path -> createPrologAdapter(EclipsePrologAdapter.class, path));
		return factories;
	}
	
	protected PrologAdapter createPrologAdapter(Class<? extends PrologAdapter> interpreterClass, String path) {
		try {
			PrologAdapter instance = interpreterClass.getDeclaredConstructor().newInstance();
			instance.setPath(path);
			if (!instance.isValid()) {
				throw new IllegalStateException("The requested interpreter has returned a wrong validation result.");
			}
			return instance;
		} catch (Exception e) {
			throw new IllegalStateException("The requested interpreter is not useable.", e);
		}
	}

}
