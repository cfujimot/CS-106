import java.io.*; //imports file not found

/**
 * @author maddierook
 * 
 * A program to read in a Magic: The Gathering deck list and output card stats based on card properties.
 *
 */
public class MtgDecklistReader {

	/**
	 * A method to direct the Card and Deck objects to assemble a deck array of card objects.
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {

		Deck deck = new Deck(); //creates an instance of the Deck object
		deck.load(); //creates an array of Card objects using the load method in the Deck class
		deck.analyze(); //runs analysis methods on the deck and prints output to the screen
		
	}

}
