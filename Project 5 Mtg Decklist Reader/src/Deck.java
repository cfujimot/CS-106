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
	public String cardName;
	public int convertedManaCost;
	public String cardType; 
	public String power; 
	public String toughness;
	public String color; 
	public int copyNumber;
	public String set; 
		
	/**
	 * Class to array the card objects into a deck
	 * 
	 * @return Returns an array of card constructor objects
	 * @throws FileNotFoundException
	 */
	public void load () throws FileNotFoundException { 
	
		//creates a Scanner with which to parse the file
		Scanner fileReader = new Scanner (new File("src/mtg decklist.txt"));
		
		//creates an instance of the LineCounter object and an array of Cards of that size
		LineCounter lines = new LineCounter();
		this.cards = new Card [lines.lineCounter()];

		//creates an index variable to keep track of the line/index
		int index = 0;
		while (fileReader.hasNextLine()) {
			cardName = fileReader.next(); 
			
			//read in the name as long as the next token is not an integer
			while (!fileReader.hasNextInt()) {
				cardName = cardName + " " + fileReader.next();
			}
			
			//read in CMC as an integer value
			int convertedManaCost = fileReader.nextInt();
			
			//read in card type, and tack on power and toughness as long as it's a creature
			String cardType = fileReader.next();
			
			if (cardType.equals("creature")) {
				power = fileReader.next();
				toughness = fileReader.next();
			} 
			
			//read in color or guild
			color = fileReader.next();
			
			//read in how many copies of the card are being played
			copyNumber = fileReader.nextInt();
			
			//as long as there are tokens, read in the set until the end of the line
			set = fileReader.nextLine();
			
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
		
		for (Card c : cards) { //for each card "c" in the cards array
			deckSize += c.copyNumber;
		}
		
		return deckSize;	
	}
		
	//land to spell ratio
	public double landRatio() {
		double land = 0;
		double spell = 0;
		
		for (Card c : cards) {
			if (c.cardType.equalsIgnoreCase("land")){
				land += c.copyNumber;
			} else {
				spell +=c.copyNumber;
			}
		}
		
		double landRatio= spell/land; //how to cast this as a String and return?
		
		return landRatio;
	}
	
	//method to calculate creature spell to noncreature spell ratio
	public double spellRatio() {
		double creature = 0;
		double noncreature = 0;
		
		for (Card c : cards) {
			if (c.cardType.equalsIgnoreCase("creature")) {
				creature += c.copyNumber;
			} else if (!c.cardType.equalsIgnoreCase("creature") && !c.cardType.equalsIgnoreCase("land")) {
				noncreature += c.copyNumber;
			}
		}
		
		double spellRatio = creature/noncreature;
		return spellRatio;
	}
	
	//method to calculate mean converted mana cost
	public double meanCMC() {
		double nonLand = 0;
		double meanCMC = 0;
		for (Card c : cards) {
			if (!c.cardType.equalsIgnoreCase("land")) {
				nonLand += c.copyNumber;
				meanCMC = c.copyNumber*c.convertedManaCost/nonLand;
			}
		}
		return meanCMC;
	}
		
	//standard legal?
	public String standardLegality() {
		String standardLegality = "";
		for (Card c : cards) {
			if (!(c.set.equalsIgnoreCase("Return to Ravnica") || c.set.equalsIgnoreCase("Gatecrash") || c.set.equalsIgnoreCase("Dragon's Maze") || c.set.equalsIgnoreCase("M14") || c.set.equalsIgnoreCase("Theros") ||c.set.equalsIgnoreCase("Born of the Gods") || c.set.equalsIgnoreCase("Journey Into Nyx") || c.set.equalsIgnoreCase("M15"))) {
				standardLegality = "not Standard";
			} else {
				standardLegality = "Standard";
			}
		}
		return standardLegality;
	}	

}
