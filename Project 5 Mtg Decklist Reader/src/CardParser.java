/**
 * 
 */
import java.io.*;
import java.util.*;
/**
 * @author maddierook
 *
 */
public class CardParser {

	
	public void cardParser () throws FileNotFoundException {
	
		//creates an instance of the line counter object
		LineCounter lines = new LineCounter();
	
		//creates an array based on the method lineCounter in the lines instance of the LineCounter object
		CardInfo [] cardData = new CardInfo [lines.lineCounter()];
	
		//TODO figure out how to read this in based on spaces
		Scanner fileReader = new Scanner (new File("src/mtg decklist.txt"));
		while (fileReader.hasNextLine()) {
			String cardName = fileReader.next();
		}
		
	}
}
