/**
 * 
 */

/**
 * @author maddierook
 *
 */
public class MajorArcana {

	//TODO this is a constructor
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
	 * @param number1
	 * @param name1
	 * @param mtgName1
	 * @param uprightFlavor1
	 * @param uprightMeaning1
	 * @param reversedName1
	 * @param reversedFlavor1
	 * @param reversedMeaning1
	 */
	public MajorArcana(int number1, String name1, String mtgName1, String uprightFlavor1, String uprightMeaning1, String reversedName1, String reversedFlavor1, String reversedMeaning1){
	
		//TODO create an array or set with name, flavor text, and oracle text
		//TODO be able to load each of these MajorArcana objects as a value for the integer keys in a HashSet
		this.number =  number1;
		this.name = name1;
		this.mtgName = mtgName1;
		this.uprightFlavor = uprightFlavor1;
		this.uprightMeaning = uprightMeaning1;
		this.reversedName = reversedName1;
		this.reversedFlavor = reversedFlavor1;
		this.reversedMeaning = reversedMeaning1;
	}
	
}
