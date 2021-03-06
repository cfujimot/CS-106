import java.io.*;
import java.util.*;

/**
 * @author maddierook
 * 
 * A class that contains operations performed on the decks of cards.
 *
 * @param number The number of each Major Arcana card, 0-21
 * @param name The name of the tarot card
 * @param mtgName The name of the MTG card associated with each tarot card
 * @param flavor The flavor text associated witht that MTG card
 * @param meaning The tarot meaning of the card
 * @param cards1 The upright deck
 * @param cards2 The reversed deck
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
	 * @param fileReader1 The scanner that reads in the file of upright cards
	 * @param fileReader2 The scanner that reads in the file of reversed cards
	 * @param line1 An array of the information for one card in the upright file
	 * @param line2 An array of the information for one card in the reversed file
	 * 
	 * @throws FileNotFoundException
	 * 
	 */
	public void load() throws FileNotFoundException { 
		//begins building 1st deck from upright file
		Scanner fileReader1 = new Scanner (new File("src/mtg upright major arcana.txt"));
		cards1 = new ArrayList<MajorArcana>();
		fileReader1.nextLine(); //skips the first line of identifiers in the text file

		//reads in MajorArcana properties and builds the upright deck
		while (fileReader1.hasNextLine()) {
			
			//reads in each line as an array, splitting tokens based on tabs
			String line1[] = fileReader1.nextLine().split("\\t");
			
			//assigns each token to the appropriate variable
			number = Integer.valueOf(line1[0]);
			name = line1[1];
			mtgName = line1[2];
			flavor = line1[3];
			meaning = line1[4];
			
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
			String line2[] = fileReader2.nextLine().split("\\t");
				
			//assigns each token to the appropriate variable
			number = Integer.valueOf(line2[0]);
			name = line2[1];
			mtgName = line2[2];
			flavor = line2[3];
			meaning = line2[4];
						
			//constructs the reversed deck from MajorArcana objects
			cards2.add(new MajorArcana(number, name, mtgName, flavor, meaning));
		}
		fileReader2.close();
	
		//shuffles both decks
		Collections.shuffle(cards1);
		Collections.shuffle(cards2);
		
	}

	
	/**
	 * A method to perform a reading based on the input hand size, determined by the spread in the main method.
	 * 
	 * @param numCards The number of cards in the chosen spread, passed by the main method
	 * @param hand An array list of cards for the spread, populated from the decks cards1 and cards2
	 * @param indexOf1 A counter to store the index of the matching upright card in order to remove it
	 * @param indexOf2 A counter to store the index of the matching reversed card in order to remove it
	 * @param remove1 A counter to keep track of the index in the upright deck while searching for the matching card
	 * @param remove2 A counter to keep track of the index in the reversed deck while searching for the matching card
	 * 
	 * The method works as follows: while the hand is not full, boolean pick upright or reversed; pull the first card off the top of that deck, then search through the other deck for the matching card and remove it.
	 * To remove matching card, cycles through the deck to match based on number, incrementing the remove counter.
	 * When it finds it, sets indexOf to the value of remove and then deletes that card from the deck.
	 * 
	 */
	public void read(int numCards) {
				
		//creates the hand and populates it with the appropriate number of cards
		ArrayList<MajorArcana> hand = new ArrayList<MajorArcana>();
		while (hand.size() < numCards) {
			//picks the upright or reversed deck, adds the card off the top of that deck to the hand, and removes it from the deck
			if (Math.random() < 0.55) {
				hand.add(cards1.get(0));
				cards1.remove(0);
				//removes the matching card from the reversed deck
				int indexOf2 = -1;
				for (MajorArcana h : hand) {
					int remove2 = 0;
					for (MajorArcana c : cards2) {
						//if the card matches, remove it; else increment the counter
						if (c.number == h.number) {
							indexOf2 = remove2;
						}
						remove2 ++;
					}	
				}
				cards2.remove(indexOf2);	
			} else {
				hand.add(cards2.get(0));
				cards2.remove(0);
				int indexOf1 =-1;
				for (MajorArcana h : hand) {
					int remove1 = 0;
					for (MajorArcana d : cards1) {
						if (d.number == h.number) {
							indexOf1 = remove1;
						}
						remove1 ++;
					}	
				}
				cards1.remove(indexOf1);
			}	
		}
		//calls a method to print the reading
		print(hand);
	}
	
	
	/**
	 * A method to print the formatted result of the spread.
	 * 
	 * @param hand An array list of cards for the spread, in the order that they were pulled from the decks cards1 and cards2
	 * @param i A counter for the number of cards in the hand
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
