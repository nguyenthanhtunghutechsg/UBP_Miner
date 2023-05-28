package FHM;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;


/**
 * Example of how to use the FHM algorithm 
 * from the source code.
 * @author Philippe Fournier-Viger, 2014
 */
public class MainTestFHM {

	public static void main(String [] arg) throws IOException{
		
		String input = "DB//testDB.txt";
		String output = ".//output.txt";

		int min_utility = 1;  // 
		
		// Applying the HUIMiner algorithm
		AlgoFHM fhm = new AlgoFHM();
		fhm.runAlgorithm(input, output, min_utility);
		fhm.printStats();

	}

	public static String fileToPath(String filename) throws UnsupportedEncodingException{
		URL url = MainTestFHM.class.getResource(filename);
		 return java.net.URLDecoder.decode(url.getPath(),"UTF-8");
	}
}
