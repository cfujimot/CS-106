import java.io.*;
import java.util.*;

/**
 * 
 */

/**
 * @author maddierook
 *
 */
public class TarotDeck {

	public int number;
	public String name;
	public String mtgName;
	public String uprightFlavor;
	public String uprightMeaning;
	public String reversedName;
	public String reversedFlavor;
	public String reversedMeaning;
	
	/**
	 * 
	 * @throws FileNotFoundException
	 */
	public void load() throws FileNotFoundException { 
		
		Scanner fileReader = new Scanner (new File("src/mtg major arcana.txt"));

		//Option 1: line counter object, array into a deck of MajorArcana
			//LineCounter lines = new LineCounter(); ...TODO: create a line counter method
			//MajorArcana[] cards = new MajorArcana[lines.lineCoutner()-1]; ...creates an empty array
		
		//Option 2: populate the set, with each card is its own Major Arcana object
			//MajorArcana fool = new MajorArcana(fileReader.nextLine); ...where number = fileReader.nextInt(); name = fileReader.next()...
			//Then place these MajorArcana objects (all 22 of them) into a HashSet called deck
		HashSet<MajorArcana> cards = new HashSet<MajorArcana>();
		
		fileReader.nextLine(); //skips the first line of identifiers in the text file
		
		//read in each property of MajorArcana, for each card (line in the file)
		int index = 0;
		while (fileReader.hasNextLine()) {
			
			number = fileReader.nextInt();
				
			name = fileReader.next();
			if (name.equalsIgnoreCase("The")) {
				name = name + " " + fileReader.next();
			}
			if (name.equalsIgnoreCase("The Hanged")) {
				name = name + " " + fileReader.next();
			}
			
			while (!fileReader.next().equals("F:")) {
				mtgName = fileReader.next();
			}
				
			while (!fileReader.next().equals("M:")) { 
				uprightFlavor = fileReader.next();
			}
				
			while (!fileReader.next().equals(".")) {
				uprightMeaning = fileReader.next();
			}
				
			while (!fileReader.next().equals("F:")) {
				reversedName = fileReader.next();
			}
			
			while (!fileReader.next().equals("M:")) { 
				reversedFlavor = fileReader.next();
			}
				
			while (!fileReader.next().equals(".")) {
				reversedMeaning = fileReader.next();
			}
				
			cards.add(new MajorArcana(number, name, mtgName, uprightFlavor, uprightMeaning, reversedName, reversedFlavor, reversedMeaning));
		
			index ++;		
		}
		fileReader.close();
		
		//check: did the set populate?
		for (MajorArcana c : cards) {
			System.out.println(c); 
		}
		
	}
	
	/**
	 * A method to perform a single-card reading
	 */
	public void single() {
		HashSet<MajorArcana> hand = new HashSet<MajorArcana>();
		
		double next = Math.random();
		int n = (int)next;
		
		//TODO remove one card from the HashSet as the hand
		//TODO print ascii of the card
	}
	
	/**
	 * A method to perform a past, present, future reading
	 */
	public void triple() {
		//TODO remove three cards in order from the HashSet
		//TODO preint ascii of the spread
	}
	
	/**
	 * A method to perform a pentagram reading
	 */
	public void pentagram() {
		//TODO remove five cards in order from the HashSet
		//TODO print ascii of the spread **this will be difficult
	}
	
	/**
	 * A method to perform a days-of-the-week reading
	 */
	public void week() {
		//TODO remove seven cards in order from the HashSet
		//TODO print ascii of the spread **this will be very difficult
		
	}
	
}
