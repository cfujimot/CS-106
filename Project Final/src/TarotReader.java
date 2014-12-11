import java.io.*;
import java.util.*;

/**
 * A program to generate a tarot reading of Magic: The Gathering cards.
 * Card names and flavor texts are sourced from <gatherer.wizards.com>
 * 
 * @author maddierook
 *
 */
public class TarotReader {

	/**
	 * A method to ask which spread the user would like read, build a tarot deck from the input files, and read the hand of cards.
	 * 
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
			//prints ascii of the spread
			System.out.println();
			System.out.println("  _______");
			System.out.println(" |       |");
			System.out.println(" |       |");
			System.out.println(" |   1   |");
			System.out.println(" |       |");
			System.out.println(" |       |");
			System.out.println("  -------");
			System.out.println("Significator");
			System.out.println();
			//calls the read method with a hand size of 1
			deck.read(1);
		} else if (spread.equals("2")) {
			//prints ascii of the spread
			System.out.println();
			System.out.println(" _______    _______    _______");
			System.out.println("|       |  |       |  |       |");
			System.out.println("|       |  |       |  |       |");
			System.out.println("|   1   |  |   2   |  |   3   |");
			System.out.println("|       |  |       |  |       |");
			System.out.println("|       |  |       |  |       |");
			System.out.println(" -------    -------    -------");
			System.out.println("   Past     Present    Future");
			System.out.println();
			//calls the read method with a hand size of 3
			deck.read(3);
		} else if (spread.equals("3")) {
			//prints ascii of the spread
			System.out.println(); 
			System.out.println("              _______");
			System.out.println("             |       |");
			System.out.println("             |       |");
			System.out.println("             |   2   |");
			System.out.println("             |       |");
			System.out.println("             |       |");
			System.out.println("  _______     -------     _______");
			System.out.println(" |       |    What you   |       |");
			System.out.println(" |       |   can't see   |       |");
			System.out.println(" |   4   |               |   5   |");
			System.out.println(" |       |               |       |");
			System.out.println(" |       |               |       |");
			System.out.println(" -------                  -------");
			System.out.println("  What you                What you");
			System.out.println("can't change             can expect");
			System.out.println("       _______      _______");
			System.out.println("      |       |    |       |");
			System.out.println("      |       |    |       |");
			System.out.println("      |   1   |    |   3   |");
			System.out.println("      |       |    |       |");
			System.out.println("      |       |    |       |");
			System.out.println("       -------      -------");
			System.out.println("       What you     What you");
			System.out.println("       can see     can change");
			System.out.println();
			//calls the read method with a hand size of 5
			deck.read(5);
		} else if (spread.equals("4")) {
			deck.read(7);
		}
	}
	
}