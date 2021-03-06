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
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		//scanner to read through the file
		Scanner fileReader = new Scanner (new File("src/input.txt"));

		//defining variables
		String accountType = new String();
		String transactionType = new String();
		double checking = 0;
		double savings = 0; 
		double credit = 0;
				
		//loops through the file and passes to different methods based on line contents
		while (fileReader.hasNextLine()) {
			
			//bypasses first column of dates
			fileReader.next();
			
			//reads in account type and chooses appropriate method
			accountType = fileReader.next();
			if (accountType.equals("Checking")) {
				checking = processChecking(fileReader.nextLine(), transactionType, checking);
			} else if (accountType.equals("Savings")) {
				savings = processSavings(fileReader.nextLine(), transactionType, savings);
			} else if (accountType.equals("Credit")) {
				credit = processCredit(fileReader.nextLine(), transactionType, credit);
			}	
		}
		
		//close the file reader once the entire file is processed
		fileReader.close();
		
		//printstream object to output results to new text file
		PrintStream output = new PrintStream (new File("src/output.txt"));
		
		//prints the results
		output.println("Checking Account Balance = $" + checking + ".");
		output.println("Savings Account Balance = $" + savings + ".");
		output.println("Credit Card Balance = $" + credit + ".");
		
		//closes the printstream object once results are printed
		output.close();
	}
		
	/**
	 * 
	 * @param line The remainder of the current line, with date and account type appended
	 * @param transactionType Opening balance, withdrawal, or deposit
	 * @param checking Checking account variable
	 * @return Returns updated checking value
	 */
	public static double processChecking(String line, String transactionType, double checking) {				
		//scanner to read through the line passed in from fileReader
		Scanner checkingProcessor = new Scanner(line);

		//CHECK: how many times does it loop through the checking method?
		//System.out.println("checking");
		
		//reads the type of transaction and chooses appropriate calculation
		transactionType = checkingProcessor.next();

		//CHECK: what is this reader actually seeing?
		//System.out.println(transactionType);
		
		if (transactionType.equals("Opening")) {
			checkingProcessor.next(); //this skips over the second word of Opening Balance
			checking += checkingProcessor.nextDouble();
		} else if (transactionType.equals("Withdrawal")) {
			checking -= checkingProcessor.nextDouble();
		} else if (transactionType.equals("Deposit")) {
			checking += checkingProcessor.nextDouble();
		}
		
		//closes the checking processor line reader once checking variable has been updated
		checkingProcessor.close();
		
		//returns updated value of checking to main
		return checking;
	}
			
	/**
	 * 
	 * @param line The remainder of the current line, with date and account type appended
	 * @param transactionType Opening balance, withdrawal, or deposit
	 * @param checking Savings account variable
	 * @return Returns updated savings value
	 */
	public static double processSavings(String line, String transactionType, double savings) {
		//scanner to read through the line passed in from fileReader
		Scanner savingsProcessor = new Scanner(line);

		//CHECK: how many times does it loop through the savings method?
		//System.out.println("savings");
				
		//reads the type of transaction and chooses appropriate calculation
		transactionType = savingsProcessor.next();

		//CHECK: what is this reader actually seeing?
		//System.out.println(transactionType);
		
		if (transactionType.equals("Opening")) {
			savingsProcessor.next(); //this skips over the second word of Opening Balance
			savings += savingsProcessor.nextDouble();
		} else if (transactionType.equals("Withdrawal")) {
			savings -= savingsProcessor.nextDouble();
		} else if (transactionType.equals("Deposit")) {
			savings += savingsProcessor.nextDouble();
		}
		
		//closes the savings processor line reader once savings variable has been updated
		savingsProcessor.close();

		//returns updated value of savings to main
		return savings;
	}
	
	/**
	 * 
	  * @param line The remainder of the current line, with date and account type appended
	 * @param transactionType Opening balance, withdrawal, or deposit
	 * @param checking Credit Card account variable
	 * @return Returns updated credit value
	 */
	public static double processCredit(String line, String transactionType, double credit) {
		//scanner to read through the line passed in from fileReader
		Scanner creditProcessor = new Scanner(line);
		creditProcessor.next(); //skips the second word of Credit Card
		
		//CHECK: how many times does it loop through the credit method?
		//System.out.println("credit");
		
		//reads the type of transaction and chooses appropriate calculation
		transactionType = creditProcessor.next();
		
		//CHECK: what is this reader actually seeing?
		//System.out.println(transactionType);
		
		if (transactionType.equals("Opening")) {
			creditProcessor.next(); //this skips over the second word of Opening Balance
			credit += creditProcessor.nextDouble();
		} else if (transactionType.equals("Withdrawal")) {
			credit -= creditProcessor.nextDouble();
		} else if (transactionType.equals("Deposit")) {
			credit += creditProcessor.nextDouble();
		}
	
		//closes the credit processor line reader once credit variable has been updated
		creditProcessor.close();

		//returns updated value of credit to main
		return credit;
	}
	
}
