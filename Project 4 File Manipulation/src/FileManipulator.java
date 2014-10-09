/**
 * @author maddierook
 *
 */

//imports Scanner and FileReader ability
import java.util.*;
import java.io.*;


public class FileManipulator {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileReader = new Scanner (new File("src/input.txt"));

		String accountType = new String();
		String transactionType = new String();
		double checking = 0;
		double savings = 0; 
		double credit = 0;
				
		while (fileReader.hasNextLine()) {
			fileReader.next();
			accountType = fileReader.next();

			//read in the account type and choose appropriate method	
			if (accountType.equals("Checking")) {
				processChecking(fileReader.next(), transactionType, checking);
			} else if (accountType.equals("Savings")) {
				processSavings(fileReader.next(), transactionType, savings);
			} else if (accountType.equals("Credit")) {
				processCredit(fileReader.next(), transactionType, credit);
			}			
				
				//fileReader.nextLine();	
		}
		
		fileReader.close();
		
		//calls the print method when all line processing is done
		printBalance(checking, savings, credit);
	}
		

			
	/**
	 * 	
	 * @param line
	 * @param checking
	 * @param savings
	 * @param creditCard
	 * @return
	 */
	public static double processChecking(String line, String transactionType, double checking) {				
		Scanner checkingProcessor = new Scanner(line);
		
		transactionType = checkingProcessor.next();
				
		if (transactionType.equals("Opening")) {
			checking += checkingProcessor.nextDouble();	
			System.out.println(checking);
		} else if (transactionType.equals("Withdrawal")) {
			checking -= checkingProcessor.nextDouble();
		} else if (transactionType.equals("Deposit")) {
			checking += checkingProcessor.nextDouble();
		}
		
		checkingProcessor.close();
				
		return checking;
		
	}
			
	/**
	 * 
	 * @param line
	 * @param checking
	 * @param savings
	 * @param creditCard
	 * @return
	 */
	public static double processSavings(String line, String transactionType, double savings) {
		Scanner savingsProcessor = new Scanner(line);
						
		transactionType = savingsProcessor.next();

		System.out.println(transactionType);

		//skip to the transaction value
		savingsProcessor.next();
				
		if (transactionType.equals("Opening")) {
			savings += savingsProcessor.nextDouble();	
		} else if (transactionType.equals("Withdrawal")) {
			savings -= savingsProcessor.nextDouble();
		} else if (transactionType.equals("Deposit")) {
			savings += savingsProcessor.nextDouble();
		}
		
		savingsProcessor.close();

		return savings;
		
	}
	
	/**
	 * 
	 * @param line
	 * @param checking
	 * @param savings
	 * @param creditCard
	 * @return
	 */
	public static double processCredit(String line, String transactionType, double credit) {
		Scanner creditProcessor = new Scanner(line);
		
		//skip the first column of dates, and the second of account type
		creditProcessor.next();
		creditProcessor.next();
		creditProcessor.next();
				
		transactionType = creditProcessor.next();
		
		//System.out.println(transactionType);
		
		//skip to the transaction type
		//creditProcessor.next();
				
		if (transactionType.equals("Opening")) {
			//creditProcessor.next();
			credit += creditProcessor.nextDouble();
			//System.out.println(creditCard);
		} else if (transactionType.equals("Withdrawal")) {
			credit -= creditProcessor.nextDouble();
		} else if (transactionType.equals("Deposit")) {
			credit += creditProcessor.nextDouble();
		}
	
		creditProcessor.close();

		return credit;
	
	}
		
	
	/**
	 * 
	 * @param checking
	 * @param savings
	 * @param creditCard
	 */
	public static void printBalance(double checking, double savings, double creditCard) {
		System.out.println("Checking Account Balance = " + checking + ".");
		System.out.println("Savings Account Balance = " + savings + ".");
		System.out.println("Credit Card Balance = " + creditCard + ".");
	
		/*PrintStream output = new PrintStream (new File("src/output.txt"));
		output.close(); */
	}
	
}
