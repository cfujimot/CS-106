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
	public String flavor;
	public String meaning;
	public ArrayList<MajorArcana> cards1;
	public ArrayList<MajorArcana> cards2;
	
	/**
	 * 
	 * @throws FileNotFoundException
	 */
	public void load() throws FileNotFoundException { 
		
		Scanner fileReader1 = new Scanner (new File("src/mtg upright major arcana.txt"));
		cards1 = new ArrayList<MajorArcana>();
		fileReader1.nextLine(); //skips the first line of identifiers in the text file

		//read in each property of MajorArcana, for each card (line in the file)
		while (fileReader1.hasNextLine()) {
			
			number = fileReader1.nextInt();
			
			while (!fileReader1.next().equals("N:")) {
				name = fileReader1.next();
			}
			
			while (!fileReader1.next().equals("F:")) {
				mtgName = fileReader1.next();
			}
				
			while (!fileReader1.next().equals("Meaning:")) { 
				flavor = fileReader1.next();
			}
				
			meaning = fileReader1.nextLine();
				
			cards1.add(new MajorArcana(number, name, mtgName, flavor, meaning));
		}
		
		Scanner fileReader2 = new Scanner (new File("src/mtg reversed major arcana.txt"));
		cards2 = new ArrayList<MajorArcana>();
		fileReader2.nextLine(); //skips the first line of identifiers in the text file
		
		while (fileReader2.hasNextLine()) {
			
			number = fileReader2.nextInt();
			
			while (!fileReader2.next().equals("N:")) {
				name = fileReader2.next();
			}
			
			while (!fileReader2.next().equals("F:")) {
				mtgName = fileReader2.next();
			}
				
			while (!fileReader2.next().equals("Meaning:")) { 
				flavor = fileReader2.next();
			}
				
			meaning = fileReader2.nextLine();
				
			cards2.add(new MajorArcana(number, name, mtgName, flavor, meaning));
		}
		fileReader2.close();
	
	}
	
	/**
	 * A method to perform a single-card reading
	 */
	public void single() {
		ArrayList<MajorArcana> hand = new ArrayList<MajorArcana>();
		
		//pick the upright or reversed deck
		boolean alignment = true;
		
		if (alignment = true) {
			Collections.shuffle(cards1);	
			hand.add(cards1<0>);
			cards1.remove(cards1<0>);
			cards2.remove(cards<0>);
		} else if (alignment = false) {
			Collections.shuffle(cards2);
		}
	
		System.out.println(hand.toString()); //TODO how to print as a string?
					
	}
		
		//TODO remove one card from the HashSet as the hand
		//TODO print ascii of the card
	
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
