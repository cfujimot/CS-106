//imports hash set capability
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author maddierook
 *
 */
public class TarotReader {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {

		TarotDeck deck = new TarotDeck();
		deck.load();

		HashSet<MajorArcana> hand = new HashSet<MajorArcana>();
		
		
	}

}
