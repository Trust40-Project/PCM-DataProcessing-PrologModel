package performance;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;

import edu.kit.ipd.sdq.dataflow.systemmodel.configuration.Configuration;

public class CSVWriter implements Closeable {
	
	BufferedWriter fileWriter;

	public CSVWriter(String basename) throws IOException{
		Date date = new Date() ;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss") ;
		String filename = "measurements/"+basename+"_" + dateFormat.format(date) +".csv";
		fileWriter = Files.newBufferedWriter(Paths.get(filename), StandardOpenOption.CREATE);
		writeHeaders();
	}

	private void writeHeaders() throws IOException {
		fileWriter.write("n,interpreter,optLnot,optIndexing,optAssi,translateMS,loadMS,analyzeMS");
	}
	
	public void writeRecord(int n, String interpreter, Configuration config, double translateMS, double loadMS, double analyzeMS) throws IOException {
		fileWriter.newLine();
		String rec = n+"," + interpreter+"," + config.isOptimizedNegations()+"," + config.isArgumentAndReturnValueIndexing()+"," + config.isShorterAssignments()+ "," + translateMS +"," +loadMS+"," +analyzeMS;
		fileWriter.write(rec);
		fileWriter.flush();
		System.out.println(rec);
	}

	@Override
	public void close() throws IOException {
		fileWriter.close();
	}
}
