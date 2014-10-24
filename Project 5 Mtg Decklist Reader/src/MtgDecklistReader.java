/**
 * 
 */
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

		//CardConstructor card = new CardConstructor(cardName, convertedManaCost, cardType, power, toughness, color, copyNumber, set);
		//System.out.println(card.cardName);
		
		//CardParser parse = new CardParser();
		//CardConstructor[] cards = CardParser.cardParser();
		
		//TODO card analyzer class to do the methods below, so only have to have one line to perform all calculations
		 
		//TODO insert a toString functionality in the CardInfo class
		System.out.println(parse.deckSize()); //output: Deck size is x cards.
		System.out.println(parse.landRatio()); //output: Land to spell ratio is x:x.
		System.out.println(parse.spellRatio()); //output: Creature spell to non-creature spell ratio is x:x.
		System.out.println(parse.meanConvetedManaCost()); //output: Average converted mana cost is x.
		System.out.println(parse.formatLegality()); //output: Standard legal? Yes/No. Modern legal? Yes/No.

	}

}