/**
 * 
 */

/**
 * @author maddierook
 *
 */
public class MajorArcana {

	//TODO this is a constructor
	public String number;
	public String name;
	public String mtgName;
	public String flavor;
	public String meaning;

	/**
	 * 
	 * @param number1
	 * @param name1
	 * @param mtgName1
	 * @param flavor1
	 * @param meaning1
	 */
	public MajorArcana(String number1, String name1, String mtgName1, String flavor1, String meaning1){
	
		//TODO create an array or set with name, flavor text, and oracle text
		//TODO be able to load each of these MajorArcana objects as a value for the integer keys in a HashSet
		this.number =  number1;
		this.name = name1;
		this.mtgName = mtgName1;
		this.flavor = flavor1;
		this.meaning = meaning1;
	}
	
}
