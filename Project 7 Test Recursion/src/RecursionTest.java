/**
 * @author maddierook
 *
 * A program to recursively print the integers 1 to max, then print the sum of those integers.
 *
 */
public class RecursionTest {

	/**
	 * A method that calls the recursive function to print an integer list.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//set ending variable
		int max = 10;
		
		//calls a method that recursively prints integers 1 to max
		printIntegers(max);
		System.out.println();
		System.out.println();

		//prints a method that recursively adds the integers 1 to max
		System.out.println(printSum(max));
	}
	
	
	/**
	 * A method to recursively print the integers 1 to max.
	 * 
	 * @param max The ending integer.
	 */
	public static void printIntegers(int max) {
		
		//if the maximum value is >1, recursive call and print the list
		if (max > 1) {
			printIntegers(max-1);
			System.out.print(", " + max);
		} else {
			//finally, print the maximum value at the end of the stack
			System.out.print(max); 
		}
				
	}
	
	/**
	 * A method to print out the sum of integers 1 to max.
	 * 
	 * @param max The ending integer.
	 * @return
	 */
	public static int printSum(int max) {
		
		//if the maximum value is >1, return the max plus max-1
		//the call works backwards because it saves 10 and calls the method, then saves 9 and calls...
		if (max > 1) {
			return max + printSum(max-1);
		} else {
			//return 1 last
			return 1;
		}
	}
	
}
