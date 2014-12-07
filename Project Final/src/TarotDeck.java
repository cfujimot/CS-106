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

	public String number;
	public String name;
	public String mtgName;
	public String flavor;
	public String meaning;
	private ArrayList<MajorArcana> cards1;
	private ArrayList<MajorArcana> cards2;
	private boolean alignment;

	/**
	 * 
	 * @throws FileNotFoundException
	 */
	public void load() throws FileNotFoundException { 
		//begins building 1st deck from upright file
		Scanner fileReader1 = new Scanner (new File("src/mtg upright major arcana.txt"));
		cards1 = new ArrayList<MajorArcana>();
		fileReader1.nextLine(); //skips the first line of identifiers in the text file

		//reads in MajorArcana properties and builds the upright deck
		while (fileReader1.hasNextLine()) {
			
			//reads in each line as an array, splitting tokens based on tabs
			String line[] = fileReader1.nextLine().split("\\t");
			
			//assigns each token to the appropriate variable
			number = line[0];
			name = line[1];
			mtgName = line[2];
			flavor = line[3];
			meaning = line[4];
			
			//constructs the upright deck from MajorArcana objects
			cards1.add(new MajorArcana(number, name, mtgName, flavor, meaning));
		}
		fileReader1.close();
		
		//begins building 2nd deck from reversed file
		Scanner fileReader2 = new Scanner (new File("src/mtg reversed major arcana.txt"));
		cards2 = new ArrayList<MajorArcana>();
		fileReader2.nextLine(); //skips the first line of identifiers in the text file
		
		//reads in MajorArcana properties and builds the reversed deck
		while (fileReader2.hasNextLine()) {
			
			//reads in each line as an array, splitting tokens based on tabs
			String line[] = fileReader2.nextLine().split("\\t");
				
			//assigns each token to the appropriate variable
			number = line[0];
			name = line[1];
			mtgName = line[2];
			flavor = line[3];
			meaning = line[4];
						
			//constructs the reversed deck from MajorArcana objects
			cards2.add(new MajorArcana(number, name, mtgName, flavor, meaning));
		}
		fileReader2.close();
	
		//shuffles both decks
		Collections.shuffle(cards1);
		Collections.shuffle(cards2);

	}

	/**
	 * A method to perform a single card reading
	 */
	public void single() {
		
		//TODO build the decks as ArrayLists
		//TODO use the Comparable interface to delete cards from both decks that overlap with the hand
		//TODO possible to use a Set for the hand and still keep cards in the same order they were drawn?
		
		//prints ascii of the spread
		System.out.println();
		System.out.println("  _______");
		System.out.println(" |       |");
		System.out.println(" |       |");
		System.out.println(" |   1   |");
		System.out.println(" |       |");
		System.out.println(" |       |");
		System.out.println("  -------");
		System.out.println("Significator");
		System.out.println();
		
		//creates the hand
		Queue<MajorArcana> hand = new LinkedList<MajorArcana>();

		//picks the upright or reversed deck
		if (Math.random() < 0.5) {
			alignment = true;
		} else {
			alignment = false;
		}
		
		//builds the hand; if alignment is true, pulls from the upright deck; if false, pulls from reversed
		if (alignment = true) {
			hand.add(cards1.get(0));
			//TODO use Comparable to do the equivalent: cards2.pop();			
		} else if (alignment = false) {
			hand.add(cards2.get(0));
			//TODO use Comparable to do the equivalent: cards1.pop();
		}
		
		//calls a method to print the reading
		print(hand);
	}

	
	/**
	 * A method to perform a past, present, future reading
	 */
	public void triple() {
		//prints ascii of the spread
		System.out.println();
		System.out.println(" _______    _______    _______");
		System.out.println("|       |  |       |  |       |");
		System.out.println("|       |  |       |  |       |");
		System.out.println("|   1   |  |   2   |  |   3   |");
		System.out.println("|       |  |       |  |       |");
		System.out.println("|       |  |       |  |       |");
		System.out.println(" -------    -------    -------");
		System.out.println("   Past     Present    Future");
		System.out.println();
				
		//builds the hand out to 3 cards
		Queue<MajorArcana> hand = new LinkedList<MajorArcana>();
		while (hand.size() < 3) {
			//picks the upright or reversed deck
			if (Math.random() < 0.5) {
				alignment = true;
			} else {
				alignment = false;
			}
			//if alignment is true, pulls from the upright deck; if false, pulls from reversed
			if (alignment = true) {
				hand.add(cards1.get(0));
				//cards2.pop();			
			} else if (alignment = false) {
				hand.add(cards2.get(0));
				//cards1.pop();
			}
		}
		
		//calls a method to print the reading
		print(hand);
	}
	
	/**
	 * A method to perform a pentagram reading
	 */
	public void pentagram() {
		
		//prints ascii of the spread
		System.out.println(); 
		System.out.println("             _______");
		System.out.println("             |       |");
		System.out.println("             |       |");
		System.out.println("             |   2   |");
		System.out.println("             |       |");
		System.out.println("             |       |");
		System.out.println("  _______     -------     _______");
		System.out.println(" |       |    What you   |       |");
		System.out.println(" |       |   can't see   |       |");
		System.out.println(" |   4   |               |   5   |");
		System.out.println(" |       |               |       |");
		System.out.println(" |       |               |       |");
		System.out.println(" -------                  -------");
		System.out.println("  What you                What you");
		System.out.println("can't change             can expect");
		System.out.println("       _______      _______");
		System.out.println("      |       |    |       |");
		System.out.println("      |       |    |       |");
		System.out.println("      |   1   |    |   3   |");
		System.out.println("      |       |    |       |");
		System.out.println("      |       |    |       |");
		System.out.println("       -------      -------");
		System.out.println("       What you     What you");
		System.out.println("       can see     can change");
		System.out.println();
		
		//builds the hand out to 5 cards
		Queue<MajorArcana> hand = new LinkedList<MajorArcana>();
		while (hand.size() < 5) {
			//picks the upright or reversed deck
			if (Math.random() < 0.5) {
				alignment = true;
			} else {
				alignment = false;
			}
			//if alignment is true, pulls from the upright deck; if false, pulls from reversed
			if (alignment = true) {
				hand.add(cards1.get(0));
				//cards2.pop();			
			} else if (alignment = false) {
				hand.add(cards2.get(0));
				//cards1.pop();
			}
		}
				
		//calls a method to print the reading
		print(hand);
	}
	
	/**
	 * A method to perform a days-of-the-week reading
	 */
	public void week() {

		//builds the hand out to 7 cards
		Queue<MajorArcana> hand = new LinkedList<MajorArcana>();
		while (hand.size() < 7) {
			//picks the upright or reversed deck
			if (Math.random() < 0.5) {
				alignment = true;
			} else {
				alignment = false;
			}
			//if alignment is true, pulls from the upright deck; if false, pulls from reversed
			if (alignment = true) {
				hand.add(cards1.get(0));
				//cards2.pop();			
			} else if (alignment = false) {
				hand.add(cards2.get(0));
				//cards1.pop();
			}
		}
				
		//calls a method to print the reading
		print (hand);
	}
	
	/**
	 * 
	 * @param hand
	 */
	private void print(Queue<MajorArcana> hand) {
		//for each MajorArcana object in the hand, print out a formatted reading
		int i = 1;
		for (MajorArcana c : hand) {
			System.out.println(i + ". " + number + ": " + name);
			System.out.println(mtgName);
			System.out.println(flavor);
			System.out.println(meaning);
			System.out.println();
			i++;
		}	
	}

}
