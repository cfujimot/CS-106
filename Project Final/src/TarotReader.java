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
		
		String spread = "0";
		Scanner console = new Scanner(System.in);
		spread = console.next();
		
		while (!(spread.equals("1") || spread.equals("2") || spread.equals("3") || spread.equals("4"))) {
			System.out.println("You entered an invalid response. Please enter the integer of the spread you would like.");
			spread = console.next();
		}
		
		TarotDeck deck = new TarotDeck();
		deck.load();
			
		if (spread.equals("1")) {
			deck.single();
		} else if (spread.equals("2")) {
			deck.triple();
		} else if (spread.equals("3")) {
			deck.pentagram();
		} else if (spread.equals("4")) {
			deck.week();
		}
	}

}
