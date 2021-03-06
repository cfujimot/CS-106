import java.io.*; //imports file not found
import java.util.*; //imports scanner

/**
 * @author maddierook
 *
 * A class to process card objects as a deck and calculate stats based on intrinsic properties of each card.
 *
 * @cards
 * @cardName
 * @convertedManaCost
 * @cardType
 * @power
 * @toughness
 * @color
 * @copyNumber
 * @set
 *
 */
public class Deck {

	//declare class-level variables, including the array of card object
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
	 * A method to array the card objects into a deck object.
	 * 
	 * @throws FileNotFoundException
	 */
	public void load () throws FileNotFoundException { 
	
		//creates a Scanner with which to parse the file
			//TODO allow the user to input the filepath 
			//Scanner console = new Scanner(System.in);
			//System.out.println("What is the file path you wish to use?");
		Scanner fileReader = new Scanner (new File("src/mtg decklist.txt"));
		
		//creates an instance of the LineCounter object and an array of Cards of that size
		LineCounter lines = new LineCounter();
		this.cards = new Card [lines.lineCounter()-1];

		fileReader.nextLine();
		
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
	
	
	/**
	 * A method to tally certain card stats and output them to the screen.
	 * 
	 * Ratio converter adapted from Kevin Fodness, <https://github.com/kevinfodness>
	 * 
	 * @deckSize
	 * @land
	 * @spell
	 * @landRatio
	 * @creature
	 * @nonCreature
	 * @spellRatio
	 * @nonLand
	 * @totalCMC
	 * @meanCMC
	 * @standardLegality
	 */
	public void analyze() {
		
		//calculates deck size
		int deckSize = 0;	
		for (Card c : cards) { //for each card "c" in the cards array
			deckSize += c.copyNumber;
		}
		System.out.println("The size of your deck is " + deckSize + " cards.");

		//calculates land:spell ratio
		double land = 0;
		double spell = 0;
		for (Card c : cards) {
			if (c.cardType.equalsIgnoreCase("land")){
				land += c.copyNumber;
			} else {
				spell +=c.copyNumber;
			}
		}
		double landRatio= land/spell;
		
		//convert to ratio x:x...start at 1:1, then adjust until it matches. @author Kevin Fodness.
		double land1 = 1; 
		double spell1 = 1;
		while (land1 / spell1 != landRatio) { 
			if (land1 / spell1 < landRatio) {
				land1++;
			} else {
				spell1++;
			}
		}
		System.out.println("Your land:spell ratio is " + (int)land1 + ":" + (int)spell1 + "."); 
		
		//calculates creature:noncreature ratio
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
		
		//convert to ratio x:x...start at 1:1, then adjust until it matches. @author Kevin Fodness.
		double creature1 = 1; 
		double noncreature1 = 1;
		while (creature1 / noncreature1 != spellRatio) { 
			if (creature1 / noncreature1 < spellRatio) {
				creature1++;
			} else {
				noncreature1++;
			}
		}
		System.out.println("Your creature-spell:non-creature-spell ratio is " + (int)creature1 + ":" + (int)noncreature1 + "."); 

		//calculates mean converted mana cost
		double nonLand = 0;
		double totalCMC = 0;
		double meanCMC = 0;
		for (Card c : cards) {
			if (!c.cardType.equalsIgnoreCase("land")) {
				nonLand += c.copyNumber;
				totalCMC = totalCMC + c.copyNumber*c.convertedManaCost;
				meanCMC = totalCMC/nonLand;
			}
		}
		System.out.println("The average converted mana cost of spells in your deck is " + meanCMC + " mana."); 
		
		//determines legality
		String standardLegality = "";
		for (Card c : cards) {
			if (!(c.set.equalsIgnoreCase("Return to Ravnica") || c.set.equalsIgnoreCase("Gatecrash") || c.set.equalsIgnoreCase("Dragon's Maze") || c.set.equalsIgnoreCase("M14") || c.set.equalsIgnoreCase("Theros") ||c.set.equalsIgnoreCase("Born of the Gods") || c.set.equalsIgnoreCase("Journey Into Nyx") || c.set.equalsIgnoreCase("M15"))) {
				standardLegality = "not Standard";
			} else {
				standardLegality = "Standard";
			}
		}
		System.out.println("Your deck is " + standardLegality + " legal."); 
		
		//outputs game information
		System.out.println("----------------------------------------------------");
		System.out.println();
		System.out.println("The minimum deck size for constructed is 60 cards.");
		System.out.println();
		System.out.println("Standard currently includes all cards in the sets: Return to Ravnica, Gatecrash, Dragon's Maze, Magic 2014, Theros, Born of the Gods, Journey Into Nyx, and Magic 2015.");
		System.out.println();
		System.out.println("Modern currently includes all cards in the 'new' card frame (since 8th Edition), with a banned list.");
		System.out.println();
		System.out.println("The following cards are banned from Modern tournaments: Ancestral Vision, Ancient Den, Blazing Shoal, Bloodbraid Elf, ");
		System.out.println("	Chrome Mox, Cloudpost, Dark Depths, Deathrite Shaman, Dread Return, Glimpse of Nature, Golgari Grave-Troll, Great Furnace, Green Sun's Zenith, ");
		System.out.println("	Hypergenesis, Jace the Mind Sculptor, Mental Misstep, Ponder, Preordain, Punishing Fire, Rite of Flame, Seat of the Synod, Second Sunrise, ");
		System.out.println("	Seething Song, Sensei's Divining Top, Stoneforge Mystic, Skullclamp, Sword of the Meek, Tree of Tales, Umezawa's Jitte, and Vault of Whispers.");
	}
}
