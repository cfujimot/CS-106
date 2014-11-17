import java.io.*;
import java.util.*;

/**
 * 
 */

/**
 * @author maddierook
 *
 */
public class TarotDeck {

	public int number;
	public String name;
	public String mtgName;
	public String uprightFlavor;
	public String uprightOracle;
	public String reversedFlavor;
	public String reversedOracle;
	
	public void load () throws FileNotFoundException { 
		
		Scanner fileReader = new Scanner (new File("src/mtg major arcana.txt"));

		//Option 1: line counter object, array into a deck of MajorArcana
			//LineCounter lines = new LineCounter(); ...TODO: create a line counter method
			//MajorArcana[] cards = new MajorArcana[lines.lineCoutner()-1]; ...creates an empty array
		
		//Option 2: populate the set, with commas between each...ie. each card is its own Major Arcana object
			//MajorArcana fool = new MajorArcana(fileReader.nextLine); ...where number = fileReader.nextInt(); name = fileReader.next(); with certain conditions...
			//Then place these MajorArcana objects (all 22 of them) into a HashSet called deck
		HashSet<MajorArcana> deck = new HashSet<MajorArcana>();
		
		
	}
	
}
