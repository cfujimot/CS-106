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

	/**
	 * 
	 * @return Returns an array of card constructor objects
	 * @throws FileNotFoundException
	 */
	public CardConstructor[] cardParser () throws FileNotFoundException {
	
		//creates an instance of the line counter object
		LineCounter lines = new LineCounter();
	
		//creates an array based on the method lineCounter in the lines instance of the LineCounter object
		CardConstructor [] cards = new CardConstructor [lines.lineCounter()];
		
		
		//reads in each line to populate the cards array
		Scanner fileReader = new Scanner (new File("src/mtg decklist.txt"));
		int index = 0;
		while (fileReader.hasNextLine()) {
			String cardName = fileReader.next(); //TODO how do I make this the same class-level variable defined in CardInfo?
			
			//read in the name as long as the next token is not an integer
			while (!fileReader.hasNextInt()) {
				cardName = cardName + " " + fileReader.next();
			}
			
			//read in CMC as an integer value
			int convertedManaCost = fileReader.nextInt();
			
			//read in card type, and tack on power and toughness as long as it's a creature
			String cardType = fileReader.next();
			if (cardType.equals("creature")) {
				String power = fileReader.next();
				String toughness = fileReader.next();
			} 
			
			//read in color or guild
			String color = fileReader.next();
			
			//read in how many copies of the card are being played
			int copyNumber = fileReader.nextInt();
			
			//as long as there are tokens, read in the set until the end of the line
			//TODO how do I know it won't just skip to the next line and keep reading in tokens incorrectly?
			while (fileReader.hasNext()){
				String set = fileReader.next();
			}
		//populates the array after each pass through the while loop
		cards [index] = new CardConstructor(cardName, convertedManaCost, cardType, power, toughness, color, copyNumber, set);
		
		//increments the counter after each line
		index ++;
		}
		
		//closes the file reader once the array is populated
		fileReader.close();
		
	}
}