import java.io.*;
import java.util.*;

/**
 * @author maddierook
 *
 * A program to generate a tarot reading of Magic: The Gathering cards.
 * Card names and flavor texts are sourced from <gatherer.wizards.com>.
 * 
 */
public class TarotReader {

	/**
	 * A method to ask which spread the user would like read, build a tarot deck from two input files, and read the hand of cards.
	 * 
	 * @param spread Represents the user's answer to the first question and directs the method accordingly
	 * @param console The scanner that reads the user's input to adjust the spread parameter
	 * @param deck Builds the upright and reversed decks using the load method in that class
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 * 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Welcome to the Virtual MTG Tarot Reader! My name is Maddie.");
		System.out.println();
		System.out.println("Please think of a question or problem that you would like an answer for, ");
		System.out.println("then enter the number of the spread you would like read, and hit the return key:");
		System.out.println("	1. Single-card Reading");
		System.out.println("	2. Past, Present, Future");
		System.out.println("	3. Pentagram");
		System.out.println("	4. Days of the Week");
		System.out.println("	5. Celtic Cross");
		
		String spread = "0";
		Scanner console = new Scanner(System.in);
		spread = console.next();
		
		while (!(spread.equals("1") || spread.equals("2") || spread.equals("3") || spread.equals("4") || spread.equals("5"))) {
			System.out.println("You entered an invalid response. Please enter the integer of the spread you would like.");
			spread = console.next();
		}
		
		TarotDeck deck = new TarotDeck();
		deck.load();
		
		System.out.println();
		System.out.println("The first number of the printout corresponds to the card and meaning indicated in the spread diagram.");
		System.out.println("The second number is the number associated with that tarot card; for example, The Fool is 0.");
		System.out.println();

		if (spread.equals("1")) {
			//prints ascii of the spread
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
			//prints ascii of the spread
			System.out.println("                  _______");
			System.out.println("                 |       |");
			System.out.println("                 |       |");
			System.out.println("                 |   2   |");
			System.out.println("                 |       |");
			System.out.println("     _______     |       |     _______");
			System.out.println("    |       |     -------     |       |");
			System.out.println("    |       |      Monday     |       |");
			System.out.println("    |   8   |                 |   3   |");
			System.out.println("    |       |                 |       |");
			System.out.println("    |       |                 |       |");
			System.out.println("     -------      _______      -------");
			System.out.println("      Sunday     |       |      Tuesday");
			System.out.println("  _______        |       |        _______");
			System.out.println(" |       |       |   1   |       |       |");
			System.out.println(" |       |       |       |       |       |");
			System.out.println(" |   7   |       |       |       |   4   |");
			System.out.println(" |       |        -------        |       |");
			System.out.println(" |       |      Significator     |       |");
			System.out.println("  -------                         -------");
			System.out.println("  Saturday                       Wednesday");			
			System.out.println("            _______     _______");
			System.out.println("           |       |   |       |");
			System.out.println("           |       |   |       |");
			System.out.println("           |   6   |   |   5   |");
			System.out.println("           |       |   |       |");
			System.out.println("           |       |   |       |");
			System.out.println("            -------     -------");
			System.out.println("             Friday    Thursday");
			System.out.println();
			//calls the read method with a hand size of 8
			deck.read(8);
		} else if (spread.equals("5")) {
			//prints ascii of the spread
			System.out.println("                                                        _______");
			System.out.println("                                                       |       |");
			System.out.println("                                                       |       |");
			System.out.println("                     _______                           |  10   |");
			System.out.println("                    |       |                          |       |");
			System.out.println("                    |       |                          |       |");
			System.out.println("                    |   2   |                           -------");
			System.out.println("                    |       |                         The outcome");
			System.out.println("                    |       |");
			System.out.println("                     -------                            _______");
			System.out.println("                  Hidden factors                       |       |");
			System.out.println("                                                       |       |");
			System.out.println("  _______            _______           _______         |   8   |");
			System.out.println(" |       |          |   1   |         |       |        |       |");
			System.out.println(" |       |        __|_______|__       |       |        |       |");
			System.out.println(" |   5   |       |             |      |   6   |         -------");
			System.out.println(" |       |       |      2      |      |       |    Emotions surrounding");
			System.out.println(" |       |       |             |      |       |       the situation");
			System.out.println("  -------         -------------        -------                  ");
			System.out.println(" Influences         '-------'     Influences coming     _______");
			System.out.println("passing away    1. Significator        into play       |       |");
			System.out.println("             2. Immediate challenges                   |       |");
			System.out.println("                                                       |   7   |");
			System.out.println("                     _______                           |       |");
			System.out.println("                    |       |                          |       |");
			System.out.println("                    |       |                           -------");
			System.out.println("                    |   3   |                      How others see you");
			System.out.println("                    |       |                       in the situation");
			System.out.println("                    |       |");
			System.out.println("                     -------                            _______");
			System.out.println("                 The foundation                        |       |");
			System.out.println("                  of the issue                         |       |");
			System.out.println("                                                       |   6   |");
			System.out.println("                                                       |       |");
			System.out.println("                                                       |       |");
			System.out.println("                                                        -------");
			System.out.println("                                                  How you see yourself");
			System.out.println("                                                    in the situation");
			System.out.println();
			//calls the read method with a hand size of 10
			deck.read (10);
		}
	}
	
}
