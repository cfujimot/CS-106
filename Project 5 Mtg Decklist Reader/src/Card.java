/**
 * @author maddierook
 *
 * A class to represent one object (card) in the deck.
 *
 */
public class Card {
	
	//declare class-level variables, traits of each card
	public String cardName;
	public int convertedManaCost;
	public String cardType; 
	public String power; 
	public String toughness;
	public String color; 
	public int copyNumber;
	public String set; 
	
	/**
	 * A constructor that contains properties of each MTG card.
	 * 
	 * @param cardName1
	 * @param convertedManaCost1
	 * @param cardType1
	 * @param power1
	 * @param toughness1
	 * @param color1
	 * @param copyNumber1
	 * @param set1
	 */
	public Card(String cardName1, int convertedManaCost1, String cardType1, String power1, String toughness1, String color1,  int copyNumber1, String set1) {
		
		//set variables
		this.cardName = cardName1;
		this.convertedManaCost = convertedManaCost1;
		this.cardType = cardType1;
		this.power  = power1;
		this.toughness = toughness1;
		this.color = color1;
		this.copyNumber = copyNumber1;
		this.set = set1;

	}
}
