/**
 * Imports Scanner functionality.
 */
import java.util.*;

/**
 * This class calculates which Guild Wars 2 Race you are based on your responses.
 */
public class GW2RaceQuiz {
	/**
	 * This method initializes the program with a title and passes control flow to question one to begin method chaining.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//quiz title and instructions
		System.out.println("Which Guild Wars 2 race are you?");
		System.out.println("Please press the return key to continue.");

		//define attribute variables
		int curiosity = 0;
		int empathy = 0;
		int heroism = 0;
		int ingenuity = 0;
		int pragmatism = 0;
		
		//define scanner for following question
		Scanner console = new Scanner(System.in);
		String answer = console.nextLine();

		System.out.println("Please enter the letter of your answer for each of the following questions.");
		System.out.println();
		
		//commence tracking with question one
		questionOne(console, answer, curiosity, empathy, heroism, ingenuity, pragmatism);	
	}
		
	/**
	 * This method asks the first question and prompts for the first answer, then passes control flow to question 2.
	 * 
	 * @param console  Scanner to ask for a response.
	 * @param answer  The user's response in letter form; ignores case. 
	 * @param curiosity  The tracking variable for the curiosity trait.
	 * @param empathy  The tracking variable for the empathy trait.
	 * @param heroism  The tracking variable for the heroism trait.
	 * @param ingenuity  The tracking variable for the ingenuity trait.
	 * @param pragmatism  The tracking variable for the pragmatism trait.
	 * 
	 * @return void
	 */
	public static void questionOne(Scanner console, String answer, int curiosity, int empathy, int heroism, int ingenuity, int pragmatism) {
		//ask the first question and prompt for the first answer
		System.out.println("Question 1");
		System.out.println(" A: ");
		System.out.println(" B: ");
		System.out.println(" C: ");
		System.out.println(" D: ");
		
		//recalculate value of each variable based on the first answer
		if (answer.equalsIgnoreCase("A")) {
			empathy += 2;
			curiosity ++;
		} else if (answer.equalsIgnoreCase("B")) {
			pragmatism += 2;
			curiosity --;
		} else if (answer.equalsIgnoreCase("C")) {
			heroism += 2;
			pragmatism --;
		} else {
			ingenuity ++;
		}
		
		//passes control flow to question 2
		questionTwo(console, answer, curiosity, empathy, heroism, ingenuity, pragmatism);	
	}
	
	/**
	 * This method asks the first question and prompts for the first answer, then passes control flow to question 2.
	 * 
	 * @param console  Scanner to ask for a response.
	 * @param answer  The user's response in letter form; ignores case. 
	 * @param curiosity  The tracking variable for the curiosity trait.
	 * @param empathy  The tracking variable for the empathy trait.
	 * @param heroism  The tracking variable for the heroism trait.
	 * @param ingenuity  The tracking variable for the ingenuity trait.
	 * @param pragmatism  The tracking variable for the pragmatism trait.
	 * 
	 * @return void
	 */
	public static void questionTwo(Scanner console, String answer, int curiosity, int empathy, int heroism, int ingenuity, int pragmatism) {
		//ask the second question and prompt for the second answer
		System.out.println("Question 2");
		System.out.println(" A: ");
		System.out.println(" B: ");
		System.out.println(" C: ");
		System.out.println(" D: ");
				
		//recalculate value of each variable based on the second answer
		if (answer.equalsIgnoreCase("A")) {
			empathy += 2;
			curiosity ++;
		} else if (answer.equalsIgnoreCase("B")) {
			pragmatism += 2;
			curiosity --;
		} else if (answer.equalsIgnoreCase("C")) {
			heroism += 2;
			pragmatism --;
		} else {
			ingenuity ++;
		}
		
		//TODO pass control flow to question 3; at the end, pass control flow to printRace
		
	}
	
	public static void printRace(int curiosity, int empathy, int heroism, int ingenuity, int pragmatism) {
		//TODO if else statements to calculate which race you are
	}

//closes the class
}