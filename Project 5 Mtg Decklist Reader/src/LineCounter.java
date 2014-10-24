import java.io.*;
import java.util.*;

/**
 * 
 */

/**
 * @author maddierook
 *
 */
public class LineCounter {

	public int numberOfLines;
	
	//method to count number of lines in the input file
	public int lineCounter() throws FileNotFoundException{
		Scanner lineCounter = new Scanner (new File("src/mtg decklist.txt"));
		numberOfLines = 0;
		
		while (lineCounter.hasNextLine()) {
			numberOfLines ++;
			lineCounter.nextLine();
		}
		lineCounter.close();
		
		return numberOfLines;
	}

}
