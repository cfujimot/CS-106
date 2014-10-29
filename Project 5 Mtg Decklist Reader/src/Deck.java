/**
 * 
 */
import java.io.*;
import java.util.*;
/**
 * @author maddierook
 *
 */
public class Deck {

	public Card[] cards;
	
	/**
	 * Class to array the card objects into a deck
	 * 
	 * @return Returns an array of card constructor objects
	 * @throws FileNotFoundException
	 */
	public void load () throws FileNotFoundException { 
	
		//reads in each line to populate the cards array -->don't call the variables, read them into the constructor
		Scanner fileReader = new Scanner (new File("src/mtg decklist.txt"));
		
		LineCounter lines = new LineCounter();
		this.cards = new Card [lines.lineCounter()];

		/*
		
		while (fileReader.hasNextLine()){
			cards[index] = (fileReader.next(), fileReader.nextInt(), fileReader.next(), fileReader.next(), fileReader.next(), fileReader.next(), fileReader.nextInt(), fileReader.next());
			index ++;
		}
		*/
		
		//creates an array based on the method lineCounter in the lines instance of the LineCounter object
		//TODO how to populate?
		//Card c = new Card (fileReader.next(), fileReader.nextInt(), fileReader.next(), fileReader.next(), fileReader.next(), fileReader.next(), fileReader.nextInt(), fileReader.next());
		
		int index = 0;
		while (fileReader.hasNextLine()) {
			String cardName = fileReader.next(); //TODO how do I make this the same class-level variable defined in Card?
			
			//read in the name as long as the next token is not an integer
			while (!fileReader.hasNextInt()) {
				cardName = cardName + " " + fileReader.next();
			}
			
			//read in CMC as an integer value
			int convertedManaCost = fileReader.nextInt();
			
			//read in card type, and tack on power and toughness as long as it's a creature
			String cardType = fileReader.next();
			String power = "";
			String toughness = "";
			if (cardType.equals("creature")) {
				power = fileReader.next();
				toughness = fileReader.next();
			} 
			
			//read in color or guild
			String color = fileReader.next();
			
			//read in how many copies of the card are being played
			int copyNumber = fileReader.nextInt();
			
			//as long as there are tokens, read in the set until the end of the line
			String set = fileReader.nextLine();
			
		//populates the array after each pass through the while loop
		cards [index] = new Card(cardName, convertedManaCost, cardType, power, toughness, color, copyNumber, set);
		
		//increments the counter after each line
		index ++;
		}
		
		//closes the file reader once the array is populated
		fileReader.close();	
	}
	
	
	//calculate the deck size
	public int deckSize() {
		int deckSize = 0;		
		return deckSize;	
	}
		
	//land to spell ratio
	public int landRatio() {
		int landRatio = 0;
		return landRatio;
	}
	
	//creature spell to noncreature spell ratio
	public int spellRatio() {
		int spellRatio = 0;
		return spellRatio;
	}
	
	//mean converted mana cost
	public int meanCMC() {
		int meanCMC = 0;
		return meanCMC;
	}
		
	//standard legal?
	public boolean standardLegality() {
		boolean standardLegality = false;
		return standardLegality;
	}	

	//modern legal?
	public boolean modernLegality() {
		boolean modernLegality = false;
		return modernLegality;
	}	
}
