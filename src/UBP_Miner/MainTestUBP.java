package UBP_Miner;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;


/**
 * Example of how to use the FHM algorithm 
 * from the source code.
 * @author Philippe Fournier-Viger, 2014
 */
public class MainTestUBP {

	public static void main(String [] arg) throws IOException{
		
		String input = "DB//testDB.txt";
		String output = ".//output.txt";

		int min_utility = 1;  // 
		
		// Applying the HUIMiner algorithm
		AlgoUBP fhm = new AlgoUBP();
		fhm.runAlgorithm(input, output, min_utility);
		fhm.printStats();

	}

	public static String fileToPath(String filename) throws UnsupportedEncodingException{
		URL url = MainTestUBP.class.getResource(filename);
		 return java.net.URLDecoder.decode(url.getPath(),"UTF-8");
	}
}
