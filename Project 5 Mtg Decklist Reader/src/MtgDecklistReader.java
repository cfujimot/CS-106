import java.io.*;

/**
 * @author maddierook
 *
 */
public class MtgDecklistReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {

		Deck deck = new Deck(); //creates an instance of the CardParser object, called parse
		deck.load(); //creates an array of Card objects; must reference "deck" the instance of the object (not the Class itself) and run the "load" method on it
		
		//deck.analyze(); //runs analysis methods on the deck
		
		System.out.println("The size of your deck is " + deck.deckSize() + " cards."); //output: Deck size is x cards.
		System.out.println("Your land:spell ratio is " + deck.landRatio() + "."); //output: Land to spell ratio is x:x.
		System.out.println("Your creature-spell:non-creature-spell ratio is " + deck.spellRatio() + "."); //output: Creature spell to non-creature spell ratio is x:x.
		System.out.println("The average converted mana cost of spells in your deck is " + deck.meanCMC() + " mana."); //output: Average converted mana cost is x.
		System.out.println("Your deck is " + deck.standardLegality() + " legal."); //output: Standard legal? Yes/No.
	}

}
