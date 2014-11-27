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
	public String uprightMeaning;
	public String reversedName;
	public String reversedFlavor;
	public String reversedMeaning;
	
	/**
	 * 
	 * @throws FileNotFoundException
	 */
	public void load () throws FileNotFoundException { 
		
		Scanner fileReader = new Scanner (new File("src/mtg major arcana.txt"));

		//Option 1: line counter object, array into a deck of MajorArcana
			//LineCounter lines = new LineCounter(); ...TODO: create a line counter method
			//MajorArcana[] cards = new MajorArcana[lines.lineCoutner()-1]; ...creates an empty array
		
		//Option 2: populate the set, with each card is its own Major Arcana object
			//MajorArcana fool = new MajorArcana(fileReader.nextLine); ...where number = fileReader.nextInt(); name = fileReader.next()...
			//Then place these MajorArcana objects (all 22 of them) into a HashSet called deck
		HashSet<MajorArcana> cards = new HashSet<MajorArcana>();
		
		fileReader.nextLine(); //skips the first line of identifiers in the text file
		
		//read in each property of MajorArcana, for each card (line in the file)
		int index = 0;
		while (fileReader.hasNextLine()) {
			
			number = fileReader.nextInt();
				
			name = fileReader.next();
			if (name.equalsIgnoreCase("The")) {
				name = name + " " + fileReader.next();
			}
			if (name.equalsIgnoreCase("The Hanged")) {
				name = name + " " + fileReader.next();
			}
			
			while (!fileReader.next().equals("F:")) {
				mtgName = fileReader.next();
			}
				
			while (!fileReader.next().equals("M:")) { 
				uprightFlavor = fileReader.next();
			}
				
			while (!fileReader.next().equals(".")) {
				uprightMeaning = fileReader.next();
			}
				
			while (!fileReader.next().equals("F:")) {
				reversedName = fileReader.next();
			}
			
			while (!fileReader.next().equals("M:")) { 
				reversedFlavor = fileReader.next();
			}
				
			while (!fileReader.next().equals(".")) {
				reversedMeaning = fileReader.next();
			}
				
			cards.add(new MajorArcana(number, name, mtgName, uprightFlavor, uprightMeaning, reversedName, reversedFlavor, reversedMeaning));
		
			index ++;		
		}
		fileReader.close();
		
		//check: did the set populate?
		for (MajorArcana c : cards) {
			System.out.println(c); 
		}
		
	}
	
	/**
	 * 
	 */
	public void read () {
		
	}
	
}
