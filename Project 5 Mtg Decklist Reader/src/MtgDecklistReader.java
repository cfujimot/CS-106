
import java.util.*;
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

		LineCounter lines = new LineCounter();
		System.out.println(lines.lineCounter());

		CardConstructor card = new CardConstructor(cardName, convertedManaCost, cardType, power, toughness, color, copyNumber, set);
		System.out.println(card.cardName);
		
		CardParser parse = new CardParser(); //creates an instance of the CardParser object, called parse
		CardConstructor[] cards = CardParser.cardParser(); //creates an array of CardConstructor objects
				
		/*
		//TODO insert a toString functionality in the CardInfo class
		System.out.println(card.deckSize()); //output: Deck size is x cards.
		System.out.println(card.landRatio()); //output: Land to spell ratio is x:x.
		System.out.println(card.spellRatio()); //output: Creature spell to non-creature spell ratio is x:x.
		System.out.println(card.meanCMC()); //output: Average converted mana cost is x.
		System.out.println(card.formatLegality()); //output: Standard legal? Yes/No. Modern legal? Yes/No.
		 */
	}

}
