/**
 * Imports Scanner functionality.
 */
import java.util.*;

/**
 * This class calculates which Guild Wars 2 Race you are based on your responses.
 */
public class GW2RaceQuiz {
	/**
	 * This method keeps track of variables.
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
		
		//define scanner for each question
		Scanner console = new Scanner(System.in);
		String answer = console.nextLine();
		
		System.out.println("Please enter the number of your answer for each of the following questions.");
		System.out.println();
		
		//following methods
		questionOne(console, answer, curiosity, empathy, heroism, ingenuity, pragmatism);
		questionTwo(console, answer, curiosity, empathy, heroism, ingenuity, pragmatism);
			//TODO insert questions 3-10
		
		//tally responses to each attribute variable
		if (answer.equals("1")) {
			curiosity ++;
			/*can have this add to more than one attribute
				empathy ++
			  can also have this count by more than one
			  	curiosity = +4
			  	empathy ++
			*/
		} else if (answer.equals("2")) {
			empathy ++;
		} else if (answer.equals("3")) {
			heroism ++;
		} else if (answer.equals("4")) {
			ingenuity ++;
		} else if (answer.equals("5")) {
			pragmatism ++;
		}
		
		//final determination of race
		//TODO figure out how to output race based on highest tally
		if (curiosity > pragmatism) {
			System.out.println("You are Sylvari.");
		} else {
			System.out.println("You are Char.");
		}
			/*	if (curiosity > empathy) {
					race = "Sylvari";
				} else {
					race = "Norn";
				}
		
				System.out.println("You belong to the %s!", race);
			 */
	}
		
	/**
	 * The following methods use Scanner to request answers to questions.
	 */
	public static String questionOne(Scanner console, String answer, int curiosity, int empathy, int heroism, int ingenuity, int pragmatism) {
		//first question
		System.out.println("Question 1:");
		System.out.println("1. Answer 1");
		System.out.println("2. Answer 2");
		System.out.println("3. Answer 3");
		System.out.println("4. Answer 4");
		System.out.println("5. Answer 5");
				
		return answer = console.nextLine();
	}

	public static String questionTwo(Scanner console, String answer, int curiosity, int empathy, int heroism, int ingenuity, int pragmatism) {
		//first question
		System.out.println("Question 2:");
		System.out.println("1. Answer 1");
		System.out.println("2. Answer 2");
		System.out.println("3. Answer 3");
		System.out.println("4. Answer 4");
		System.out.println("5. Answer 5");
				
		return answer = console.nextLine();
	}
}