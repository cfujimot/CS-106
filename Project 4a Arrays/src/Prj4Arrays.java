
//import Scanner and Array functionality
import java.io.*;
import java.util.*;

/**
 * @author maddierook
 *
 */
public class Prj4Arrays {

	/**
	 * Method to count number of lines in the file
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		//scanner to read through the file
		Scanner lineCounter = new Scanner (new File("src/input.txt"));
		
		//declare number of lines variable
		int numberOfLines=0;
		
		//loop through the file to count number of lines and increment the variable
		while (lineCounter.hasNextLine()) {
			numberOfLines++;
			lineCounter.nextLine();
		}
		
		//close the file reader so can reuse
		lineCounter.close();
		
		//calls the next method to read the file into separate arrays and perform operations
		processTransactions(numberOfLines);	
	}
		
	/**
	 * Method to populate arrays for each data type based on number of lines in the file
	 * Calculates balances based on account type and transaction type, and prints to the screen
	 * 
	 * @param numberOfLines
	 * @throws FileNotFoundException
	 */
	public static void processTransactions(int numberOfLines) throws FileNotFoundException {
		//declare arrays for each data type, ie column, of the file; size of the array depends on number of lines counted above
			//arrays are plural; individual cells of arrays are singular
			//arrays are currently empty
		String dates[] = new String [numberOfLines];
		String accounts[] = new String [numberOfLines];
		String transactions[] = new String [numberOfLines];
		double amounts[] = new double [numberOfLines];
		
		//Scanner to read in each token and populate arrays
		Scanner fileReader = new Scanner (new File("src/input.txt"));
		
		//local line counter variable
		int line = 0;
		
		//loops through the file and processes tokens into appropriate array
		while (fileReader.hasNextLine()) {
			
			//read in date
			dates[line] = fileReader.next();
			
			//read in account type
			accounts[line] = fileReader.next();
				//if Credit, next word will be Bard
			if (accounts[line].equals("Credit")) {
				fileReader.next();
			}
			
			//read in transaction type
			transactions[line] = fileReader.next();
				//if Opening, next word will be Balance
			if (transactions[line].equals("Opening")){
				fileReader.next();
			}
			
			//read in amount; must use .nextDouble so no type mismatch (String to double)
			amounts[line] = fileReader.nextDouble();
			
			//increments the line position by 1
			line ++;
		}
		
		//closes the file reader after the while loop has quit (run out of lines)
		fileReader.close();
				
		//local variables keep track of account balances for each of the 3 types
		double checking = 0;
		double savings = 0;
		double credit = 0;
		
		for (String account : accounts) {
			
		}
		
		//loops through the arrays by index
		for (int index = 0; index < dates.length; index ++) { 
					
			//if the account is checking
			if (accounts[index].equals("Checking")) {
				//subtract if the transaction is a withdrawal
				if(transactions[index].equals("Withdrawal")){
					checking -= amounts[index];
				//otherwise, add
				} else { 
					checking += amounts[index];
				}

			//if the account is savings
			} else if (accounts[index].equals("Savings")) {
				if(transactions[index].equals("Withdrawal")){
					savings -= amounts[index];
				} else { 
					savings += amounts[index];
				}
				
			//if the account is credit
			} else if (accounts[index].equals("Credit")) {
				if(transactions[index].equals("Withdrawal")){
					credit -= amounts[index];
				} else { 
					credit += amounts[index];
				}
			}
		}	
		
		//prints results to the console
		System.out.println("Checking Balance: $" + checking);
		System.out.println("Savings Balance: $" + savings);
		System.out.println("Credit Card Balance: $" +credit);
		
	//closes the method	
	}
	
//closes the class		
}			
		


