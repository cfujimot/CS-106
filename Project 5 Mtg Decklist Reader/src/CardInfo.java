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
public class CardInfo {
	
	//declare class-level variables, traits of each card
	public String cardName;
	public String cardType; 
	public String color; 
	public int convertedManaCost;
	public String power; 
	public String toughness; 
	public String set; 
	public int copyNumber;
	
	public CardInfo(String cardName1, String cardType1, String color1, int convertedManaCost1, String power1, String toughness1, String set1, int copyNumber1) {
		
		//set variables
		cardName = cardName1;
		cardType = cardType1; 
		color = color1;
		convertedManaCost = convertedManaCost1;
		power  = power1;
		toughness = toughness1;
		set = set1;
		copyNumber = copyNumber1;
		
		
	}

	/*
	//calculate the deck size
	public int deckSize() {
	}
		
	//calculate the land ratio
	public int landRatio() {
	}
		
	//standard or modern legal?
	public String formatLegality() {
	} */			
	
}
