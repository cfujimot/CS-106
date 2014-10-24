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

		CardParser cardsMain = new CardParser();
		
		//TODO insert a toString functionality in the CardInfo class
		System.out.println(cardsMain.deckSize()); //output: Deck size is x cards.
		System.out.println(cardsMain.landRatio()); //output: Land to spell ratio is x:x.
		System.out.println(cardsMain.spellRatio()); //output: Creature spell to non-creature spell ratio is x:x.
		System.out.println(cardsMain.meanConvetedManaCost()); //output: Average converted mana cost is x.
		System.out.println(cardsMain.formatLegality()); //output: Standard legal? Yes/No. Modern legal? Yes/No.

	}

}
