//imports hash set capability
import java.io.*;
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
		
		System.out.println("Welcome to the Virtual MTG Tarot Reader! My name is Maddie.");
		System.out.println("Please enter the number of the spread you would like read today:");
		System.out.println("	1. Single-card Reading");
		System.out.println("	2. Past, Present, Future");
		System.out.println("	3. Pentagram");
		System.out.println("	4. Days of the Week");
		
		//Scanner console = new Scanner(System.in);
		//int spread = console.nextInt();
		
		//while (!console.hasNextInt()) {
			//System.out.println("You entered a non-integer value. Please enter the integer of the spread you would like.");
		//}
				
		//if (spread == 1) {
			
		//} else if (spread == 2) {
			
		//}
		
		TarotDeck deck = new TarotDeck();
		deck.load();

		HashSet<MajorArcana> hand = new HashSet<MajorArcana>();
		//hand.read();
		
	}

}
