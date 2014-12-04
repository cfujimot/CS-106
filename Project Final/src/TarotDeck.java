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
	private Stack<MajorArcana> cards1;
	private Stack<MajorArcana> cards2;
	private boolean alignment;

	/**
	 * 
	 * @throws FileNotFoundException
	 */
	public void load() throws FileNotFoundException { 
		//begins building 1st deck from upright file
		Scanner fileReader1 = new Scanner (new File("src/mtg upright major arcana.txt"));
		cards1 = new Stack<MajorArcana>();
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
		cards2 = new Stack<MajorArcana>();
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
		
		//prints ascii of the spread
		System.out.println();
		System.out.println(" _______");
		System.out.println("|       |");
		System.out.println("|       |");
		System.out.println("|   1   |");
		System.out.println("|       |");
		System.out.println("|       |");
		System.out.println(" -------");
		System.out.println();
		
		Queue<MajorArcana> singleHand = new LinkedList<MajorArcana>();

		//picks the upright or reversed deck
		if (Math.random() < 0.5) {
			alignment = true;
		} else {
			alignment = false;
		}
		
		//if alignment is true, pulls from the upright deck; if false, pulls from reversed
		if (alignment = true) {
			singleHand.add(cards1.pop());
			cards2.pop();			
		} else if (alignment = false) {
			singleHand.add(cards2.pop());
			cards1.pop();
		}
		
		System.out.println(singleHand);
	
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
