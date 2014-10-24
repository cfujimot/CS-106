/**
 * 
 */
import java.util.*;
import java.io.*;

/**
 * @author maddierook
 *
 * Keeps track of card data
 *
 */
public class CardConstructor {
	
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
	public CardConstructor(String cardName1, int convertedManaCost1, String cardType1, String power1, String toughness1, String color1,  int copyNumber1, String set1) {
		
		//set variables
		cardName = cardName1;
		convertedManaCost = convertedManaCost1;
		cardType = cardType1;
		power  = power1;
		toughness = toughness1;
		color = color1;
		copyNumber = copyNumber1;
		set = set1;

	}


	//calculate the deck size
	public int deckSize() {
		int deckSize = 0;
		return deckSize;
	}
		
	//calculate the land ratio
	public int landRatio() {
		int landRatio = 0;
		return landRatio;
	}
		
	public int spellRatio() {
		int spellRatio = 0;
		return spellRatio;
	}
	
	public int meanCMC() {
		int meanCMC = 0;
		return meanCMC;
	}
	
	//standard or modern legal?
	public String formatLegality() {
		String formatLegality = null;
		return formatLegality;
	}		
	
}
