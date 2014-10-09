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
				processChecking(fileReader.nextLine(), transactionType, checking);
				//updates checking variable
				checking = processChecking(fileReader.nextLine(), transactionType, checking);
			} else if (accountType.equals("Savings")) {
				processSavings(fileReader.nextLine(), transactionType, savings);
				//updates savings variable
				savings = processSavings(fileReader.nextLine(), transactionType, savings);
			} else if (accountType.equals("Credit")) {
				processCredit(fileReader.nextLine(), transactionType, credit);
				//updates credit variable
				credit = processCredit(fileReader.nextLine(), transactionType, credit);
			}	
			//is this necessary? fileReader.nextLine();
		}
		
		fileReader.close();
		
		//prints results
		System.out.println("Checking Account Balance = " + checking + ".");
		System.out.println("Savings Account Balance = " + savings + ".");
		System.out.println("Credit Card Balance = " + credit + ".");
			/*PrintStream output = new PrintStream (new File("src/output.txt"));
			output.close(); */
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
			checkingProcessor.next();
			checking += checkingProcessor.nextDouble();
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
	 * @param transactionType
	 * @param savings
	 * @return
	 */
	public static double processSavings(String line, String transactionType, double savings) {
		//scanner to read through the line passed in from fileReader
		Scanner savingsProcessor = new Scanner(line);
		
		System.out.println(savingsProcessor.nextLine());
		//CHECK: how many times does it loop through the savings method?
		//System.out.println("savings");
				
		//reads the type of transaction and chooses appropriate calculation
		transactionType = savingsProcessor.next();

		//CHECK: what is this reader actually seeing?
		//System.out.println(transactionType);
		
		if (transactionType.equals("Opening")) {
			savingsProcessor.next();
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
	 * @param transactionType
	 * @param credit
	 * @return
	 */
	public static double processCredit(String line, String transactionType, double credit) {
		//scanner to read through the line passed in from fileReader
		Scanner creditProcessor = new Scanner(line);
		creditProcessor.next();
		
		//CHECK: how many times does it loop through the credit method?
		//System.out.println("credit");
		
		//reads the type of transaction and chooses appropriate calculation
		transactionType = creditProcessor.next();
		
		//CHECK: what is this reader actually seeing?
		//System.out.println(transactionType);
		
		if (transactionType.equals("Opening")) {
			creditProcessor.next();
			credit += creditProcessor.nextDouble();
		} else if (transactionType.equals("Withdrawal")) {
			credit -= creditProcessor.nextDouble();
		} else if (transactionType.equals("Deposit")) {
			credit += creditProcessor.nextDouble();
		}
	
		creditProcessor.close();

		return credit;
	}
	
}
