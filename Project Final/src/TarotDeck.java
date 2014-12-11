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
	private ArrayList<MajorArcana> cards1;
	private ArrayList<MajorArcana> cards2;

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
			number = Integer.valueOf(line[0]);
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
			number = Integer.valueOf(line[0]);
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
	 * A method to perform a reading based on the input hand size
	 * 
	 * @param spread
	 * 
	 */
	public void read(int spread) {
				
		//builds the hand out to 3 cards
		ArrayList<MajorArcana> hand = new ArrayList<MajorArcana>();
		while (hand.size() < spread) {
			//picks the upright or reversed deck
			if (Math.random() < 0.5) {
				hand.add(cards1.get(0));
				cards1.remove(0);
			} else {
				hand.add(cards2.get(0));
				cards2.remove(0);
			}
			
			for (MajorArcana h : hand) {
				int remove1 = 0;
				for (MajorArcana c : cards1) {
					if (c.number == h.number) {
						cards1.remove(remove1);
					}
					remove1 ++;
				}
				int remove2 = 0;
				for (MajorArcana d : cards2) {
					if (d.number == h.number) {
						cards2.remove(remove2);
					}
					remove2 ++;
				}
			}
			
			for (MajorArcana i : cards1) {
				System.out.println(i.name);				
			}
			System.out.println();
		
		}
		
		//calls a method to print the reading
		print(hand);
	}
	
	
	/**
	 * A method to print the formatted result of the spread
	 * 
	 * @param hand
	 */
	private void print(ArrayList<MajorArcana> hand) {
		//for each MajorArcana object in the hand, print out a formatted reading
		int i = 1;
		for (MajorArcana c : hand) {
			System.out.println(i + ". " + c.number + ": " + c.name);
			System.out.println(c.mtgName);
			System.out.println(c.flavor);
			System.out.println(c.meaning);
			System.out.println();
			i++;
		}	
	}
	
	
	
	
}
