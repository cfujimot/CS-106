import java.util.*;

/**
 * @author maddierook
 *
 * A constructor class for the MajorArcana (individual card) object.
 *
 */
public class MajorArcana {

	public int number;
	public String name;
	public String mtgName;
	public String flavor;
	public String meaning;

	/**
	 * 
	 * @param number1 The assigned number of the tarot card, 0-21
	 * @param name1 The traditional tarot name of the card
	 * @param mtgName1 The MTG name of the magic card that represents the given tarot card
	 * @param flavor1 The flavor text of that MTG card, per Wizards of the Coast
	 * @param meaning1 The tarot meaning associated with the traditional cards
	 */
	public MajorArcana(int number1, String name1, String mtgName1, String flavor1, String meaning1){
	
		this.number =  number1;
		this.name = name1;
		this.mtgName = mtgName1;
		this.flavor = flavor1;
		this.meaning = meaning1;
	}

}
