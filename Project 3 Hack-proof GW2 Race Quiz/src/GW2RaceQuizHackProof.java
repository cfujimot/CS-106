// Imports Scanner functionality.
import java.util.*;

/**
 * This class calculates which Guild Wars 2 Race you are based on your responses.
 * 
 * @see Quiz: Daily MTG, borrowed phrasing and style of some questions <http://www.wizards.com/magic/quiz/quiz.aspx?x=mtg/quiz/guild>
 */
public class GW2RaceQuizHackProof {

	/**
	 * This method initializes the program with a title and passes control flow to question one to begin method chaining.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//quiz title and instructions
		System.out.println("Which Guild Wars 2 race are you?");

		//define attribute variables
		int curiosity = 0;
		int empathy = 0;
		int heroism = 0;
		int ingenuity = 0;
		int warring = 0;
		
		//define scanner for following question
		Scanner console = new Scanner(System.in);

		System.out.println("Please enter the letter of your answer for each of the following questions, then press the return key to continue.");
		
		//commence tracking with question one
		questionOne(console, curiosity, empathy, heroism, ingenuity, warring);	
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
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionOne(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int warring) {
		//ask the first question and prompt for the first answer
		System.out.println();
		System.out.println("1. If you could create your ideal society, what would it be?");
		System.out.println(" A: A grand city-state of political alliances, where honor is highly valued.");
		System.out.println(" B: A place of learning where one’s ascendence through the ranks is determined by the cleverness of their inventions.");
		System.out.println(" C: A serene village where creativity is respected and hard work is valued, and neighbors are always willing to lend a helping hand.");
		System.out.println(" D: A collection of smaller tribes where personal skirmishes are solved in a dueling ring.");
		
		//scan for next answer
		String answer1 = console.nextLine();
		
		//checks that the answer is either A, B, C, or D
		while(!(answer1.equalsIgnoreCase("A") || answer1.equalsIgnoreCase("B") || answer1.equalsIgnoreCase("C") || answer1.equalsIgnoreCase("D"))) {
			System.out.println("You entered a character or string of characters other than A, B, C, or D.");
			System.out.println("Please enter A, B, C, or D and then press the return key. Your answer is not case-sensitive.");
			answer1 = console.nextLine();
		}
		
		//recalculate value of each variable based on the first answer
		if (answer1.equalsIgnoreCase("A")) {
			heroism ++;
		} else if (answer1.equalsIgnoreCase("B")) {
			ingenuity ++;
			curiosity ++;
		} else if (answer1.equalsIgnoreCase("C")) {
			empathy ++;
			curiosity ++;
		} else {
			warring ++;
		}
		
		//passes control flow to question 2
		questionTwo(console, curiosity, empathy, heroism, ingenuity, warring);	
	}
	
	/**
	 * This method asks the second question and prompts for the second answer, then passes control flow to question 3.
	 * 
	 * @param console  Scanner to ask for a response.
	 * @param answer  The user's response in letter form; ignores case. 
	 * @param curiosity  The tracking variable for the curiosity trait.
	 * @param empathy  The tracking variable for the empathy trait.
	 * @param heroism  The tracking variable for the heroism trait.
	 * @param ingenuity  The tracking variable for the ingenuity trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionTwo(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int warring) {
		//ask the second question and prompt for the second answer
		System.out.println();
		System.out.println("2. Do you have any religious or spiritual inclinations?");
		System.out.println(" A: I believe that all beings are connected.");
		System.out.println(" B: Everything I’ve done has been by my own hand. I don’t believe in divine influence.");
		System.out.println(" C: Maybe once, but the gods have long since abandoned us.");
		System.out.println(" D: I believe that there are several deities, and everyone has an affinity for a specific one.");

		//scan for next answer
		String answer2 = console.nextLine();

		//checks that the answer is either A, B, C, or D
		while(!(answer2.equalsIgnoreCase("A") || answer2.equalsIgnoreCase("B") || answer2.equalsIgnoreCase("C") || answer2.equalsIgnoreCase("D"))){
			System.out.println("You entered a character or string of characters other than A, B, C, or D.");
			System.out.println("Please enter A, B, C, or D and then press the return key. Your answer is not case-sensitive.");
			answer2 = console.nextLine();
		}
				
		//recalculate value of each variable based on the second answer
		if (answer2.equalsIgnoreCase("A")) {
			empathy ++;
			curiosity ++;
		} else if (answer2.equalsIgnoreCase("B")) {
			ingenuity ++;
		} else if (answer2.equalsIgnoreCase("C")) {
			warring +=2;
		} else {
			heroism +=2;
		}
		
		//passes control flow to question 3
		questionThree(console, curiosity, empathy, heroism, ingenuity, warring);
	}
	
	/**
	 * This method asks the third question and prompts for the third answer, then passes control flow to question 4.
	 * 
	 * @param console  Scanner to ask for a response.
	 * @param answer  The user's response in letter form; ignores case. 
	 * @param curiosity  The tracking variable for the curiosity trait.
	 * @param empathy  The tracking variable for the empathy trait.
	 * @param heroism  The tracking variable for the heroism trait.
	 * @param ingenuity  The tracking variable for the ingenuity trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionThree(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int warring) {
		//ask the third question and prompt for the third answer
		System.out.println();
		System.out.println("3. How do you tend to work through problems that you encounter on a daily basis?");
		System.out.println(" A: Running into them headlong a few times seems to work well enough!");
		System.out.println(" B: Daily problems don’t interest me unless they require some show of skill and honor.");
		System.out.println(" C: If my friends and I work together, we can solve pretty much anything.");
		System.out.println(" D: Boring! I devise a machine or program to do it for me.");

		//scan for next answer
		String answer3 = console.nextLine();

		//checks that the answer is either A, B, C, or D
		while(!(answer3.equalsIgnoreCase("A") || answer3.equalsIgnoreCase("B") || answer3.equalsIgnoreCase("C") || answer3.equalsIgnoreCase("D"))){
			System.out.println("You entered a character or string of characters other than A, B, C, or D.");
			System.out.println("Please enter A, B, C, or D and then press the return key. Your answer is not case-sensitive.");
			answer3 = console.nextLine();
		}
				
		//recalculate value of each variable based on the third answer
		if (answer3.equalsIgnoreCase("A")) {
			warring ++;
		} else if (answer3.equalsIgnoreCase("B")) {
			heroism ++;
		} else if (answer3.equalsIgnoreCase("C")) {
			empathy ++;
			curiosity ++;
		} else {
			ingenuity ++;
		}
		
		//passes control flow to question 4
		questionFour(console, curiosity, empathy, heroism, ingenuity, warring);
	}
	
	/**
	 * This method asks the fourth question and prompts for the fourth answer, then passes control flow to question 5.
	 * 
	 * @param console  Scanner to ask for a response.
	 * @param answer  The user's response in letter form; ignores case. 
	 * @param curiosity  The tracking variable for the curiosity trait.
	 * @param empathy  The tracking variable for the empathy trait.
	 * @param heroism  The tracking variable for the heroism trait.
	 * @param ingenuity  The tracking variable for the ingenuity trait.
	 * @param pragmatism  The tracking variable for the pragmatism trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionFour(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int warring) {
		//ask the fourth question and prompt for the fourth answer
		System.out.println();
		System.out.println("4. What would you do to inspire a crowd?");
		System.out.println(" A: Take stock of my audience, then speak to their individual beliefs.");
		System.out.println(" B: Devise some sort of wild spectacle to accompany my presentation-- crowds love a show!");
		System.out.println(" C: Rally them against a common enemy, which they believe to be the scourge of our existence.");
		System.out.println(" D: Inspire them to believe in my personal honor, and therefore the righteousness of my cause.");

		//scan for next answer
		String answer4 = console.nextLine();

		//checks that the answer is either A, B, C, or D
		while(!(answer4.equalsIgnoreCase("A") || answer4.equalsIgnoreCase("B") || answer4.equalsIgnoreCase("C") || answer4.equalsIgnoreCase("D"))){
			System.out.println("You entered a character or string of characters other than A, B, C, or D.");
			System.out.println("Please enter A, B, C, or D and then press the return key. Your answer is not case-sensitive.");
			answer4 = console.nextLine();
		}
				
		//recalculate value of each variable based on the fourth answer
		if (answer4.equalsIgnoreCase("A")) {
			empathy ++;
		} else if (answer4.equalsIgnoreCase("B")) {
			ingenuity ++;
		} else if (answer4.equalsIgnoreCase("C")) {
			warring ++;
		} else {
			heroism ++;
		}
		
		//passes control flow to question 5
		questionFive(console, curiosity, empathy, heroism, ingenuity, warring);
	}
	
	/**
	 * This method asks the fifth question and prompts for the fifth answer, then passes control flow to question 6.
	 * 
	 * @param console  Scanner to ask for a response.
	 * @param answer  The user's response in letter form; ignores case. 
	 * @param curiosity  The tracking variable for the curiosity trait.
	 * @param empathy  The tracking variable for the empathy trait.
	 * @param heroism  The tracking variable for the heroism trait.
	 * @param ingenuity  The tracking variable for the ingenuity trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionFive(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int warring) {
		//ask the fifth question and prompt for the fifth answer
		System.out.println();
		System.out.println("5. How should an army be organized?");
		System.out.println(" A: It should be ordered into ranks of infantry and cavalry, rallied around a single inspiring leader.");
		System.out.println(" B: Every man for himself-- whoever makes the kill, drinks the spill!");
		System.out.println(" C: If the army were dissolved, we could use its funds to better care for our citizens.");
		System.out.println(" D: Its primary goal should be to expand our knowledge and cultivate relations with surrounding areas.");

		//scan for next answer
		String answer5 = console.nextLine();

		//checks that the answer is either A, B, C, or D
		while(!(answer5.equalsIgnoreCase("A") || answer5.equalsIgnoreCase("B") || answer5.equalsIgnoreCase("C") || answer5.equalsIgnoreCase("D"))){
			System.out.println("You entered a character or string of characters other than A, B, C, or D.");
			System.out.println("Please enter A, B, C, or D and then press the return key. Your answer is not case-sensitive.");
			answer5 = console.nextLine();
		}
				
		//recalculate value of each variable based on the fifth answer
		if (answer5.equalsIgnoreCase("A")) {
			heroism ++;
		} else if (answer5.equalsIgnoreCase("B")) {
			warring ++;
		} else if (answer5.equalsIgnoreCase("C")) {
			empathy ++;
		} else {
			curiosity +=2;
		}
		
		//passes control flow to question 6
		questionSix(console, curiosity, empathy, heroism, ingenuity, warring);
	}
	
	/**
	 * This method asks the sixth question and prompts for the sixth answer, then passes control flow to question 7.
	 * 
	 * @param console  Scanner to ask for a response.
	 * @param answer  The user's response in letter form; ignores case. 
	 * @param curiosity  The tracking variable for the curiosity trait.
	 * @param empathy  The tracking variable for the empathy trait.
	 * @param heroism  The tracking variable for the heroism trait.
	 * @param ingenuity  The tracking variable for the ingenuity trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionSix(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int warring) {
		//ask the sixth question and prompt for the sixth answer
		System.out.println();
		System.out.println("6. Someone challenges you to a duel in the middle of a crowded street— what do you do?");
		System.out.println(" A: First, I have a duty to clear all bystanders before my spectacular display of valor.");
		System.out.println(" B: I’d chop out his tongue for daring to challenge me, and likely his fighting hand while I’m at it.");
		System.out.println(" C: How kind of him to offer himself up as a test subject for my latest creation!");
		System.out.println(" D: If we could just talk out our dispute, I’m sure we could come to an understanding.");

		//scan for next answer
		String answer6 = console.nextLine();

		//checks that the answer is either A, B, C, or D
		while(!(answer6.equalsIgnoreCase("A") || answer6.equalsIgnoreCase("B") || answer6.equalsIgnoreCase("C") || answer6.equalsIgnoreCase("D"))){
			System.out.println("You entered a character or string of characters other than A, B, C, or D.");
			System.out.println("Please enter A, B, C, or D and then press the return key. Your answer is not case-sensitive.");
			answer6 = console.nextLine();
		}
				
		//recalculate value of each variable based on the sixth answer
		if (answer6.equalsIgnoreCase("A")) {
			heroism ++;
		} else if (answer6.equalsIgnoreCase("B")) {
			warring +=2;
		} else if (answer6.equalsIgnoreCase("C")) {
			ingenuity ++;
		} else {
			empathy ++;
		}
		
		//passes control flow to question 7
		questionSeven(console, curiosity, empathy, heroism, ingenuity, warring);
	}
	
	/**
	 * This method asks the seventh question and prompts for the seventh answer, then passes control flow to question 8.
	 * 
	 * @param console  Scanner to ask for a response.
	 * @param answer  The user's response in letter form; ignores case. 
	 * @param curiosity  The tracking variable for the curiosity trait.
	 * @param empathy  The tracking variable for the empathy trait.
	 * @param heroism  The tracking variable for the heroism trait.
	 * @param ingenuity  The tracking variable for the ingenuity trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionSeven(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int warring) {
		//ask the seventh question and prompt for the seventh answer
		System.out.println();
		System.out.println("7. If you were offered control over one aspect of the city, which would it be?");
		System.out.println(" A: The universities, to gain more knowledge and in turn teach the following generations.");
		System.out.println(" B: The religious body, to offer consolation to the populace.");
		System.out.println(" C: The army, to protect the city.");
		System.out.println(" D: The governmental body, to parse out responsibility to those beneath me.");

		//scan for next answer
		String answer7 = console.nextLine();

		//checks that the answer is either A, B, C, or D
		while(!(answer7.equalsIgnoreCase("A") || answer7.equalsIgnoreCase("B") || answer7.equalsIgnoreCase("C") || answer7.equalsIgnoreCase("D"))){
			System.out.println("You entered a character or string of characters other than A, B, C, or D.");
			System.out.println("Please enter A, B, C, or D and then press the return key. Your answer is not case-sensitive.");
			answer7 = console.nextLine();
		}
				
		//recalculate value of each variable based on the seventh answer
		if (answer7.equalsIgnoreCase("A")) {
			curiosity ++;
			ingenuity ++;
		} else if (answer7.equalsIgnoreCase("B")) {
			empathy ++;
		} else if (answer7.equalsIgnoreCase("C")) {
			heroism ++;
		} else {
			ingenuity ++;
		}
		
		//passes control flow to question 8
		questionEight(console, curiosity, empathy, heroism, ingenuity, warring);
	}
	
	/**
	 * This method asks the eight question and prompts for the eight answer, then passes control flow to question 9.
	 * 
	 * @param console  Scanner to ask for a response.
	 * @param answer  The user's response in letter form; ignores case. 
	 * @param curiosity  The tracking variable for the curiosity trait.
	 * @param empathy  The tracking variable for the empathy trait.
	 * @param heroism  The tracking variable for the heroism trait.
	 * @param ingenuity  The tracking variable for the ingenuity trait.
	 * @param pragmatism  The tracking variable for the pragmatism trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionEight(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int warring) {
		//ask the eighth question and prompt for the eighth answer
		System.out.println();
		System.out.println("8. Given free reign and no obligations, how would you choose to spend the rest of your life?");
		System.out.println(" A: Helping the sick or underprivileged to make their lives more comfortable.");
		System.out.println(" B: Go to the ends of the earth to learn as much as possible, for the sake of my personal advancement.");
		System.out.println(" C: Death is merely an obstacle; I would devise a path toward immortality.");
		System.out.println(" D: I would live my life on a whim, cutting down anyone who stood in my way.");

		//scan for next answer
		String answer8 = console.nextLine();

		//checks that the answer is either A, B, C, or D
		while(!(answer8.equalsIgnoreCase("A") || answer8.equalsIgnoreCase("B") || answer8.equalsIgnoreCase("C") || answer8.equalsIgnoreCase("D"))){
			System.out.println("You entered a character or string of characters other than A, B, C, or D.");
			System.out.println("Please enter A, B, C, or D and then press the return key. Your answer is not case-sensitive.");
			answer8 = console.nextLine();
		}
				
		//recalculate value of each variable based on the eighth answer
		if (answer8.equalsIgnoreCase("A")) {
			empathy ++;
			heroism ++;
		} else if (answer8.equalsIgnoreCase("B")) {
			curiosity ++;
		} else if (answer8.equalsIgnoreCase("C")) {
			ingenuity ++;
		} else {
			warring ++;
		}
		
		//passes control flow to question 9
		questionNine(console, curiosity, empathy, heroism, ingenuity, warring);
	}
	
	/**
	 * This method asks the ninth question and prompts for the ninth answer, then passes control flow to question 10.
	 * 
	 * @param console  Scanner to ask for a response.
	 * @param answer  The user's response in letter form; ignores case. 
	 * @param curiosity  The tracking variable for the curiosity trait.
	 * @param empathy  The tracking variable for the empathy trait.
	 * @param heroism  The tracking variable for the heroism trait.
	 * @param ingenuity  The tracking variable for the ingenuity trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionNine(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int warring) {
		//ask the ninth question and prompt for the ninth answer
		System.out.println();
		System.out.println("9. You come across what appears to be a citizen being harassed by guards— what do you do?");
		System.out.println(" A: I step in, one hand on my sword hilt and the other on my coin purse— perhaps they can be . . . convinced.");
		System.out.println(" B: I interject politely and see if I can help solve the dispite-- no one will benefit from fighting.");
		System.out.println(" C: Sidestep the leader with one knife under his chin and the other at his side. He'll call of his lackies if he knows what's good for him.");
		System.out.println(" D: Keep walking-- if the victim is clever enough, he can talk his way out of it.");

		//scan for next answer
		String answer9 = console.nextLine();

		//checks that the answer is either A, B, C, or D
		while(!(answer9.equalsIgnoreCase("A") || answer9.equalsIgnoreCase("B") || answer9.equalsIgnoreCase("C") || answer9.equalsIgnoreCase("D"))){
			System.out.println("You entered a character or string of characters other than A, B, C, or D.");
			System.out.println("Please enter A, B, C, or D and then press the return key. Your answer is not case-sensitive.");
			answer9 = console.nextLine();
		}
				
		//recalculate value of each variable based on the ninth answer
		if (answer9.equalsIgnoreCase("A")) {
			heroism ++;
		} else if (answer9.equalsIgnoreCase("B")) {
			empathy ++;
		} else if (answer9.equalsIgnoreCase("C")) {
			warring ++;
		} else {
			ingenuity ++;
		}
		
		//passes control flow to question 10
		questionTen(console, curiosity, empathy, heroism, ingenuity, warring);
	}
	
	/**
	 * This method asks the tenth question and prompts for the tenth answer, then passes control flow to question 11.
	 * 
	 * @param console  Scanner to ask for a response.
	 * @param answer  The user's response in letter form; ignores case. 
	 * @param curiosity  The tracking variable for the curiosity trait.
	 * @param empathy  The tracking variable for the empathy trait.
	 * @param heroism  The tracking variable for the heroism trait.
	 * @param ingenuity  The tracking variable for the ingenuity trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionTen(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int warring) {
		//ask the tenth question and prompt for the tenth answer
		System.out.println();
		System.out.println("10. If someone were to show up on your doorstep tomorrow morning and say that an alternate universe existed, what would you do?");
		System.out.println(" A: New intelligent lifeforms? Land to explore? Take me there immediately!");
		System.out.println(" B: Forget the life forms; I’d bring back any new technology I could and study the hell out of it.");
		System.out.println(" C: It clearly poses a threat to our society— we should inform the appropriate authorities and prepare to defend our borders.");
		System.out.println(" D: I'd seek to gather new resources, and understand the beings that live there.");

		//scan for next answer
		String answer10 = console.nextLine();

		//checks that the answer is either A, B, C, or D
		while(!(answer10.equalsIgnoreCase("A") || answer10.equalsIgnoreCase("B") || answer10.equalsIgnoreCase("C") || answer10.equalsIgnoreCase("D"))){
			System.out.println("You entered a character or string of characters other than A, B, C, or D.");
			System.out.println("Please enter A, B, C, or D and then press the return key. Your answer is not case-sensitive.");
			answer10 = console.nextLine();
		}
				
		//recalculate value of each variable based on the tenth answer
		if (answer10.equalsIgnoreCase("A")) {
			curiosity ++;
		} else if (answer10.equalsIgnoreCase("B")) {
			ingenuity ++;
		} else if (answer10.equalsIgnoreCase("C")) {
			warring ++;
		} else {
			empathy ++;
		}
		
		//passes control flow to question 11
		questionEleven(console, curiosity, empathy, heroism, ingenuity, warring);
	}
	
	/**
	 * This method asks the eleventh question and prompts for the eleventh answer, then passes control flow to question 12.
	 * 
	 * @param console  Scanner to ask for a response.
	 * @param answer  The user's response in letter form; ignores case. 
	 * @param curiosity  The tracking variable for the curiosity trait.
	 * @param empathy  The tracking variable for the empathy trait.
	 * @param heroism  The tracking variable for the heroism trait.
	 * @param ingenuity  The tracking variable for the ingenuity trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionEleven(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int warring) {
		//ask the eleventh question and prompt for the eleventh answer
		System.out.println();
		System.out.println("11. If you lived in a fantasy world, which side quests would you do?");
		System.out.println(" A: Those that involve helping others, but not at the cost of killing innocent beings.");
		System.out.println(" B: Endless action? Saving a damsel in distress? Count me in!");
		System.out.println(" C: Only those that would further my knowledge of the world.");
		System.out.println(" D: Anything that helps me level up, improves my gear, and gives me an advantage over the next guy.");
		
		//scan for next answer
		String answer11 = console.nextLine();

		//checks that the answer is either A, B, C, or D
		while(!(answer11.equalsIgnoreCase("A") || answer11.equalsIgnoreCase("B") || answer11.equalsIgnoreCase("C") || answer11.equalsIgnoreCase("D"))){
			System.out.println("You entered a character or string of characters other than A, B, C, or D.");
			System.out.println("Please enter A, B, C, or D and then press the return key. Your answer is not case-sensitive.");
			answer11 = console.nextLine();
		}
				
		//recalculate value of each variable based on the eleventh answer
		if (answer11.equalsIgnoreCase("A")) {
			empathy ++;
		} else if (answer11.equalsIgnoreCase("B")) {
			heroism ++;
			warring ++;
		} else if (answer11.equalsIgnoreCase("C")) {
			ingenuity ++;
		} else {
			warring ++;
		}
		
		//passes control flow to question 12
		questionTwelve(console, curiosity, empathy, heroism, ingenuity, warring);
	}
	
	/**
	 * This method asks the twelfth question and prompts for the twelfth answer, then passes control flow to question 13.
	 * 
	 * @param console  Scanner to ask for a response.
	 * @param answer  The user's response in letter form; ignores case. 
	 * @param curiosity  The tracking variable for the curiosity trait.
	 * @param empathy  The tracking variable for the empathy trait.
	 * @param heroism  The tracking variable for the heroism trait.
	 * @param ingenuity  The tracking variable for the ingenuity trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionTwelve(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int warring) {
		//ask the twelfth question and prompt for the twelfth answer
		System.out.println();
		System.out.println("12. If you were engaged in a heated debate with someone, what would you do?");
		System.out.println(" A: Whoever has the most facts on their side is clearly in the right.");
		System.out.println(" B: I’d hammer my point home. Literally.");
		System.out.println(" C: Use my personal golem to find holes in their argument, and then exploit them.");
		System.out.println(" D: I’m not one for heated debates; the point of a discussion is to learn about viewpoints other than my own.");

		//scan for next answer
		String answer12 = console.nextLine();

		//checks that the answer is either A, B, C, or D
		while(!(answer12.equalsIgnoreCase("A") || answer12.equalsIgnoreCase("B") || answer12.equalsIgnoreCase("C") || answer12.equalsIgnoreCase("D"))){
			System.out.println("You entered a character or string of characters other than A, B, C, or D.");
			System.out.println("Please enter A, B, C, or D and then press the return key. Your answer is not case-sensitive.");
			answer12 = console.nextLine();
		}
				
		//recalculate value of each variable based on the twelfth answer
		if (answer12.equalsIgnoreCase("A")) {
			heroism ++;
		} else if (answer12.equalsIgnoreCase("B")) {
			warring ++;
		} else if (answer12.equalsIgnoreCase("C")) {
			ingenuity ++;
		} else {
			empathy ++;
			curiosity ++;
		}
		
		//passes control flow to question 13
		questionThirteen(console, curiosity, empathy, heroism, ingenuity, warring);
	}
	
	/**
	 * This method asks the thirteenth question and prompts for the thirteenth answer, then passes control flow to print results.
	 * 
	 * @param console  Scanner to ask for a response.
	 * @param answer  The user's response in letter form; ignores case. 
	 * @param curiosity  The tracking variable for the curiosity trait.
	 * @param empathy  The tracking variable for the empathy trait.
	 * @param heroism  The tracking variable for the heroism trait.
	 * @param ingenuity  The tracking variable for the ingenuity trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionThirteen(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int warring) {
		//ask the thirteen question and prompt for the thirteen answer
		System.out.println();
		System.out.println("13. If someone close to you were to come to harm, what would you do?");
		System.out.println(" A: Ensure that their every need was taken care of- my duty lies with my friends, and not in revenge upon my enemies.");
		System.out.println(" B: Gather all physical evidence against the culprit and humiliate them in a public trial.");
		System.out.println(" C: Seek out their attacker and take vengeance on my own terms.");
		System.out.println(" D: Devise a way to hack into the city’s power source and turn all its resources to finding the one responsible.");
		
		//scan for next answer
		String answer13 = console.nextLine();

		//checks that the answer is either A, B, C, or D
		while(!(answer13.equalsIgnoreCase("A") || answer13.equalsIgnoreCase("B") || answer13.equalsIgnoreCase("C") || answer13.equalsIgnoreCase("D"))){
			System.out.println("You entered a character or string of characters other than A, B, C, or D.");
			System.out.println("Please enter A, B, C, or D and then press the return key. Your answer is not case-sensitive.");
			answer13 = console.nextLine();
		}
				
		//recalculate value of each variable based on the thirteen answer
		if (answer13.equalsIgnoreCase("A")) {
			empathy ++;
		} else if (answer13.equalsIgnoreCase("B")) {
			heroism ++;
		} else if (answer13.equalsIgnoreCase("C")) {
			warring ++;
		} else {
			ingenuity ++;
		}
		
		//passes control flow to the results method
		printRace(console, curiosity, empathy, heroism, ingenuity, warring);
	}
	
	public static void printRace(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int warring) {
		 
		//prints the cumulative trait scores
		System.out.println();
		System.out.println("Your results are as follows:");
		System.out.println("Curiosity: " + curiosity);
		System.out.println("Empathy: " + empathy);
		System.out.println("Heroism: " + heroism);
		System.out.println("Ingenuity: " + ingenuity);
		System.out.println("Warring: " + warring);
		System.out.println();
		
		//calculates race based on the six trait variables
		if (ingenuity > empathy && ingenuity > heroism && ingenuity > warring
				&& curiosity > empathy && curiosity > heroism && curiosity > warring) {
			System.out.println("You are an Asura!");
			System.out.println("Asura are defined by their ingenuity and curiosity.");
		} else if (warring > curiosity && warring > empathy && warring > heroism
				&& ingenuity > curiosity && ingenuity > empathy && ingenuity > heroism) {
			System.out.println("You are a Char!");
			System.out.println("Char are defined by their warring nature and ingenuity.");
		} else if (heroism > curiosity && heroism > ingenuity && heroism > warring
				&& empathy > curiosity && empathy > ingenuity && empathy > warring) {
			System.out.println("You are a Human!");
			System.out.println("Humans are defined by their heroism and empathy.");
		} else if (warring > curiosity && warring > empathy && warring > ingenuity
				&& heroism > curiosity && heroism > empathy && heroism > ingenuity) {
			System.out.println("You are a Norn!");
			System.out.println("Norn are defined by their warring nature and heroism.");
		} else if (curiosity > heroism && curiosity > ingenuity && curiosity > warring
				&& empathy > heroism && empathy > ingenuity && empathy > warring) {
			System.out.println("You are a Sylvari!");
			System.out.println("Sylvari are defined by their curiosity and empathy.");
		} else {
			System.out.println("Your results are inconclusive.");
			System.out.println();
			System.out.println("Asura are defined by their ingenuity and curiosity");
			System.out.println("Char are defined by their warring nature and ingenuity.");
			System.out.println("Humans are defined by their heroism and empathy.");
			System.out.println("Norn are defined by their warring nature and heroism.");
			System.out.println("Sylvari are defined by their curiosity and empathy.");
			System.out.println();
			System.out.println("Would you like to take the quiz again? Please enter Y for yes or N for no.");
			
			String answerFinal = console.nextLine();

			while(!(answerFinal.equalsIgnoreCase("Y") || answerFinal.equalsIgnoreCase("N"))){
				System.out.println("You entered a character or string of characters other than Y or N. Your answer is not case-sensitive.");
				System.out.println("Please enter Y or N and then press the return key. Your answer is not case-sensitive.");
				answerFinal = console.nextLine();
			}
			
			if (answerFinal.equalsIgnoreCase("Y")) {
				questionOne(console, curiosity, empathy, heroism, ingenuity, warring);	
			} else {
				System.out.println("Thank you for participating!");
			}
		//closes the first if-else statement
		}
	//closes the final method
	}
	
//closes the class
}