import java.io.*; //imports file not found
import java.util.*; //imports scanner


/**
 * @author maddierook
 * 
 * The first class to process the file, called by the Deck class to populate an array of the appropriate size.
 * 
 */
public class LineCounter {

	public int numberOfLines;
	
	/**
	 * A method to count the lines in the input file.
	 * 
	 * @return int Returns the number of lines in the file, as an integer.
	 * @throws FileNotFoundException
	 */
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
