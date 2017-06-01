// Imports Scanner functionality.
import java.util.*;

/**
 * This class calculates which Guild Wars 2 Race you are based on your responses.
 * 
 * @see Quiz: Daily MTG, borrowed phrasing and style of some questions <http://www.wizards.com/magic/quiz/quiz.aspx?x=mtg/quiz/guild>
 */
public class NightCourtQuiz {

	/**
	 * This method initializes the program with a title and passes control flow to question one to begin method chaining.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//quiz title and instructions
		System.out.println("Mont Nuit is home to thirteen houses of the Court of Nightblooming Flowers.");
		System.out.println("Members of the Night Court serve the precept of the realm of Terre d'Ange, \"Love as thou wilt.\".");
		System.out.println("In which Night Court house do you belong?");
		System.out.println();
		
		//define attribute variables
		int alyssum = 0;
		int balm = 0;
		int bryony = 0;
		int camellia = 0;
		int cereus = 0;
		int dahlia = 0;
		int eglantine = 0;
		int gentian = 0;
		int heliotrope = 0;
		int jasmine = 0;
		int mandrake = 0;
		int orchis = 0;
		int valerian = 0;
		
		//define scanner for following question
		Scanner console = new Scanner(System.in);

		System.out.println("Please enter the letter of your answer for each of the following questions, then press the return key to continue.");
		
		//commence tracking with question one
		questionOne(console, alyssum, balm, bryony, camellia, cereus, dahlia, eglantine, gentian, heliotrope, jasmine, mandrake, orchis, valerian);	
	}
		
	/**
	 * This method asks the first question and prompts for the first answer, then passes control flow to question 2.
	 * 
	 * @param console
	 * @param alyssum
	 * @param balm
	 * @param bryony
	 * @param camellia
	 * @param cereus
	 * @param dahlia
	 * @param eglantine
	 * @param gentian
	 * @param heliotrope
	 * @param jasmine
	 * @param mandrake
	 * @param orchis
	 * @param valerian
	 * 
	 * @return void
	 */
	public static void questionOne(Scanner console, int alyssum, int balm, int bryony, int camellia, int cereus, int dahlia, int eglantine, int gentian, int heliotrope, int jasmine, int mandrake, int orchis, int valerian) {
		//ask the first question and prompt for the first answer
		System.out.println();
		System.out.println("1. Which of the 7 deadly sins do you most embody?");
		System.out.println(" A: Lust.");
		System.out.println(" B: Envy.");
		System.out.println(" C: Gluttony.");
		System.out.println(" D: Pride.");
		System.out.println(" E: Wrath.");		
		System.out.println(" F: Sloth.");
		System.out.println(" G: Greed.");

		//scan for next answer
		String answer1 = console.nextLine();
		
		//checks that the answer is one of the ones listed
		while(!(answer1.equalsIgnoreCase("A") || answer1.equalsIgnoreCase("B") || answer1.equalsIgnoreCase("C") || answer1.equalsIgnoreCase("D") 
				|| answer1.equalsIgnoreCase("E") || answer1.equalsIgnoreCase("F") || answer1.equalsIgnoreCase("G"))) {
			System.out.println("You entered a character or string of characters other than the listed answers..");
			System.out.println("Please enter one of the above letters and then press the return key. Your answer is not case-sensitive.");
			answer1 = console.nextLine();
		}
		
		//recalculate value of each variable based on the first answer
		if (answer1.equalsIgnoreCase("A")) {
			jasmine ++;
			valerian ++;
		} else if (answer1.equalsIgnoreCase("B")) {
			camellia ++;
			cereus ++;
		} else if (answer1.equalsIgnoreCase("C")) {
			heliotrope ++;
		} else if (answer1.equalsIgnoreCase("D")) {
			cereus ++;
			dahlia ++;
		} else if (answer1.equalsIgnoreCase("E")) {
			mandrake ++;
		} else if (answer1.equalsIgnoreCase("F")) {
			alyssum ++;
			valerian ++;
		} else {
			bryony ++;
			heliotrope ++;
		}
		
		//passes control flow to question 2
		questionTwo(console, alyssum, balm, bryony, camellia, cereus, dahlia, eglantine, gentian, heliotrope, jasmine, mandrake, orchis, valerian);	
	}
	
	/**
	 * 
	 * @return void
	 */
	public static void questionTwo(Scanner console, int alyssum, int balm, int bryony, int camellia, int cereus, int dahlia, int eglantine, int gentian, int heliotrope, int jasmine, int mandrake, int orchis, int valerian) {
		System.out.println();
		System.out.println("2. How do you like to have fun?");
		System.out.println(" A: A late night out drinking or clubbing.");
		System.out.println(" B: Curling up with my partner.");
		System.out.println(" C: A nice hot bath or shower to unwind.");
		System.out.println(" D: Entertaining a close-knit group of friends.");
		System.out.println(" E: A contemplative night out under the stars.");		
		System.out.println(" F: Attending a new theater or circus performance.");
		System.out.println(" G: Dinner at a nice restaurant with my friends or significant other.");
		System.out.println(" H: By myself with a book and some hot cocoa.");

		String answer2 = console.nextLine();

		while(!(answer2.equalsIgnoreCase("A") || answer2.equalsIgnoreCase("B") || answer2.equalsIgnoreCase("C") || answer2.equalsIgnoreCase("D")
				|| answer2.equalsIgnoreCase("E") || answer2.equalsIgnoreCase("F") || answer2.equalsIgnoreCase("G") || answer2.equalsIgnoreCase("H"))){
			System.out.println("You entered a character or string of characters other than the listed answers.");
			System.out.println("Please enter one of the above letters and then press the return key. Your answer is not case-sensitive.");
			answer2 = console.nextLine();
		}
				
		if (answer2.equalsIgnoreCase("A")) {
			bryony ++;
		} else if (answer2.equalsIgnoreCase("B")) {
			heliotrope ++;
		} else if (answer2.equalsIgnoreCase("C")) {
			balm ++;
		} else if (answer2.equalsIgnoreCase("D")) {
			orchis ++;
		} else if (answer2.equalsIgnoreCase("E")) {
			cereus ++;
			gentian ++;
		} else if (answer2.equalsIgnoreCase("F")) {
			eglantine ++;
		} else if (answer2.equalsIgnoreCase("G")) {
			camellia ++;
			cereus ++;
			dahlia ++;
			heliotrope ++;
		} else {
			alyssum++;
		}
		
		questionThree(console, alyssum, balm, bryony, camellia, cereus, dahlia, eglantine, gentian, heliotrope, jasmine, mandrake, orchis, valerian);	
	}
	
	/**
	 * 
	 * @return void
	 */
	public static void questionThree(Scanner console, int alyssum, int balm, int bryony, int camellia, int cereus, int dahlia, int eglantine, int gentian, int heliotrope, int jasmine, int mandrake, int orchis, int valerian) {
		System.out.println();
		System.out.println("3. What passive boon would you most like to have?");
		System.out.println(" A: Immortality (agelessness, but can still be killed).");
		System.out.println(" B: Telepathy.");
		System.out.println(" C: The ability to control anyone by the power of my gaze alone.");
		System.out.println(" D: I would never need to sleep.");
		System.out.println(" E: Telekenesis.");		
		System.out.println(" F: Invisibility at will.");		
		System.out.println(" G: The ability to stop time.");

		String answer3 = console.nextLine();

		while(!(answer3.equalsIgnoreCase("A") || answer3.equalsIgnoreCase("B") || answer3.equalsIgnoreCase("C") || answer3.equalsIgnoreCase("D")
				|| answer3.equalsIgnoreCase("E") || answer3.equalsIgnoreCase("F") || answer3.equalsIgnoreCase("G"))){
			System.out.println("You entered a character or string of characters other than the listed answers.");
			System.out.println("Please enter one of the above letters and then press the return key. Your answer is not case-sensitive.");
			answer3 = console.nextLine();
		}
				
		if (answer3.equalsIgnoreCase("A")) {
			cereus ++;
		} else if (answer3.equalsIgnoreCase("B")) {
			gentian ++;
		} else if (answer3.equalsIgnoreCase("C")) {
			mandrake ++;
		} else if (answer3.equalsIgnoreCase("D")) {
			eglantine ++;
			jasmine ++;
		} else if (answer3.equalsIgnoreCase("E")) {
			orchis ++;
		} else if (answer3.equalsIgnoreCase("F")) {
			alyssum ++;
		} else {
			camellia ++;
		}
		
		questionFour(console, alyssum, balm, bryony, camellia, cereus, dahlia, eglantine, gentian, heliotrope, jasmine, mandrake, orchis, valerian);	
	}
	
	/**
	 * 
	 * @return void
	 */
	public static void questionFour(Scanner console, int alyssum, int balm, int bryony, int camellia, int cereus, int dahlia, int eglantine, int gentian, int heliotrope, int jasmine, int mandrake, int orchis, int valerian) {
		System.out.println();
		System.out.println("4. What is your favorite component of intimacy?");
		System.out.println(" A: Quiet relaxation and rejuveination.");
		System.out.println(" B: A keen sense and manipulation of stakes.");
		System.out.println(" C: Absolute perfection, in appearance and act.");
		System.out.println(" D: The transience of beauty.");
		System.out.println(" E: Elaborate costumes and role play.");		
		System.out.println(" F: Taking advantage of all the senses to better understand my partner.");
		System.out.println(" G: Loyalty and devotion- making my partner feel like they are the only one for me.");
		System.out.println(" H: Raw passion.");
		
		String answer4 = console.nextLine();

		while(!(answer4.equalsIgnoreCase("A") || answer4.equalsIgnoreCase("B") || answer4.equalsIgnoreCase("C") || answer4.equalsIgnoreCase("D")
				|| answer4.equalsIgnoreCase("E") || answer4.equalsIgnoreCase("F") || answer4.equalsIgnoreCase("G") || answer4.equalsIgnoreCase("H"))){
			System.out.println("You entered a character or string of characters other than the listed answers.");
			System.out.println("Please enter one of the above letters and then press the return key. Your answer is not case-sensitive.");
			answer4 = console.nextLine();
		}
				
		if (answer4.equalsIgnoreCase("A")) {
			balm ++;
		} else if (answer4.equalsIgnoreCase("B")) {
			bryony ++;
		} else if (answer4.equalsIgnoreCase("C")) {
			camellia ++;
		} else if (answer4.equalsIgnoreCase("D")) {
			cereus ++;
		} else if (answer4.equalsIgnoreCase("E")) {
			eglantine ++;
			mandrake ++;
			valerian ++;
		} else if (answer4.equalsIgnoreCase("F")) {
			gentian ++;
		} else if (answer4.equalsIgnoreCase("G")) {
			heliotrope ++;
		} else {
			jasmine ++;
		}
		
		questionFive(console, alyssum, balm, bryony, camellia, cereus, dahlia, eglantine, gentian, heliotrope, jasmine, mandrake, orchis, valerian);	
	}
	
	/**
	 * 
	 * @return void
	 */
	public static void questionFive(Scanner console, int alyssum, int balm, int bryony, int camellia, int cereus, int dahlia, int eglantine, int gentian, int heliotrope, int jasmine, int mandrake, int orchis, int valerian) {
		System.out.println();
		System.out.println("5. Choose a form of artistic expression.");
		System.out.println(" A: Poetry.");
		System.out.println(" B: Instrumental performance.");
		System.out.println(" C: Vocal performance.");
		System.out.println(" D: Visual arts.");
		System.out.println(" E: Theater.");		
		System.out.println(" F: Spoken word.");
		System.out.println(" G: Modern dance or performance art.");
		System.out.println(" H: Costuming.");
		System.out.println(" I: Something that stimulates all the senses to trigger self-reflection.");
		
		String answer5 = console.nextLine();

		while(!(answer5.equalsIgnoreCase("A") || answer5.equalsIgnoreCase("B") || answer5.equalsIgnoreCase("C") || answer5.equalsIgnoreCase("D")
				|| answer5.equalsIgnoreCase("E") || answer5.equalsIgnoreCase("F") || answer5.equalsIgnoreCase("G") 
				|| answer5.equalsIgnoreCase("H") || answer5.equalsIgnoreCase("I"))){
			System.out.println("You entered a character or string of characters other than the listed answers.");
			System.out.println("Please enter one of the above letters and then press the return key. Your answer is not case-sensitive.");
			answer5 = console.nextLine();
		}
				
		if (answer5.equalsIgnoreCase("A")) {
			cereus ++;
			heliotrope ++;
		} else if (answer5.equalsIgnoreCase("B")) {
			camellia ++;
		} else if (answer5.equalsIgnoreCase("C")) {
			heliotrope ++;
		} else if (answer5.equalsIgnoreCase("D")) {
			alyssum ++;
		} else if (answer5.equalsIgnoreCase("E")) {
			orchis ++;
		} else if (answer5.equalsIgnoreCase("F")) {
			bryony ++;
		} else if (answer5.equalsIgnoreCase("G")) {
			jasmine ++;
		} else if (answer5.equalsIgnoreCase("H")) {
			eglantine ++;
		} else {
			gentian ++;
		}
		
		//passes control flow to question 6
		questionSix(console, alyssum, balm, bryony, camellia, cereus, dahlia, eglantine, gentian, heliotrope, jasmine, mandrake, orchis, valerian);	
	}
	
	/**
	 * 
	 * @return void
	 */
	public static void questionSix(Scanner console, int alyssum, int balm, int bryony, int camellia, int cereus, int dahlia, int eglantine, int gentian, int heliotrope, int jasmine, int mandrake, int orchis, int valerian) {
		System.out.println();
		System.out.println("6. In what do you place the most stock?");
		System.out.println(" A: My intuition.");
		System.out.println(" B: Karma.");
		System.out.println(" C: The power of the individual.");
		System.out.println(" D: The ideas of my own mind.");
		System.out.println(" E: The healing power of rest.");		
		System.out.println(" F: My reputation and personal status.");
		System.out.println(" G: My ability to play the odds.");
		System.out.println(" H: The fleeting breath of life.");
		System.out.println(" I: My partner.");
		System.out.println(" J: Pleasure and sensuality.");
		System.out.println(" K: With personal perfection, all things will fall into place.");
		System.out.println(" L: Surrounding myself with things I enjoy.");
		
		String answer6 = console.nextLine();

		while(!(answer6.equalsIgnoreCase("A") || answer6.equalsIgnoreCase("B") || answer6.equalsIgnoreCase("C") || answer6.equalsIgnoreCase("D")
				|| answer6.equalsIgnoreCase("E") || answer6.equalsIgnoreCase("F") || answer6.equalsIgnoreCase("G") || answer6.equalsIgnoreCase("H")
				|| answer6.equalsIgnoreCase("I") || answer6.equalsIgnoreCase("J") || answer6.equalsIgnoreCase("K") || answer6.equalsIgnoreCase("L"))){
			System.out.println("You entered a character or string of characters other than the listed answers.");
			System.out.println("Please enter one of the above letters and then press the return key. Your answer is not case-sensitive.");
			answer6 = console.nextLine();
		}
				
		if (answer6.equalsIgnoreCase("A")) {
			gentian ++;
		} else if (answer6.equalsIgnoreCase("B")) {
			mandrake ++;
		} else if (answer6.equalsIgnoreCase("C")) {
			valerian ++;
		} else if (answer6.equalsIgnoreCase("D")) {
			eglantine ++;
		} else if (answer6.equalsIgnoreCase("E")) {
			balm ++;
		} else if (answer6.equalsIgnoreCase("F")) {
			dahlia ++;
		} else if (answer6.equalsIgnoreCase("G")) {
			bryony ++;
		} else if (answer6.equalsIgnoreCase("H")) {
			cereus ++;
		} else if (answer6.equalsIgnoreCase("I")) {
			heliotrope ++;
		} else if (answer6.equalsIgnoreCase("J")) {
			jasmine ++;
		} else if (answer6.equalsIgnoreCase("K")) {
			camellia ++;
		} else {
			orchis ++;
		}
		
		questionSeven(console, alyssum, balm, bryony, camellia, cereus, dahlia, eglantine, gentian, heliotrope, jasmine, mandrake, orchis, valerian);	
	}
	
	/**
	 * 
	 * @return void
	 */
	public static void questionSeven(Scanner console, int alyssum, int balm, int bryony, int camellia, int cereus, int dahlia, int eglantine, int gentian, int heliotrope, int jasmine, int mandrake, int orchis, int valerian) {
		System.out.println();
		System.out.println("7. When your time comes, how will you leave this world?");
		System.out.println(" A: With my head held high.");
		System.out.println(" B: Quietly, and amid family and close friends.");
		System.out.println(" C: With a prophecy on my lips.");
		System.out.println(" D: Not unhappily, for I know my partner and I will soon be joined for eternity.");		
		System.out.println(" E: Sad to leave the beauty of this world.");
		System.out.println(" F: Optimistically.");
		System.out.println(" G: Passively, and ready to meet my fate.");
		
		String answer7 = console.nextLine();

		while(!(answer7.equalsIgnoreCase("A") || answer7.equalsIgnoreCase("B") || answer7.equalsIgnoreCase("C") || answer7.equalsIgnoreCase("D")
				|| answer7.equalsIgnoreCase("E") || answer7.equalsIgnoreCase("F") || answer7.equalsIgnoreCase("G"))){
			System.out.println("You entered a character or string of characters other than the listed answers.");
			System.out.println("Please enter one of the above letters and then press the return key. Your answer is not case-sensitive.");
			answer7 = console.nextLine();
		}
				
		if (answer7.equalsIgnoreCase("A")) {
			cereus ++;
			dahlia ++;
		} else if (answer7.equalsIgnoreCase("B")) {
			alyssum ++;
			gentian ++;
			heliotrope ++;
		} else if (answer7.equalsIgnoreCase("C")) {
			gentian ++;
			orchis ++;
		} else if (answer7.equalsIgnoreCase("D")) {
			heliotrope ++;
		} else if (answer7.equalsIgnoreCase("E")) {
			jasmine ++;
		} else if (answer7.equalsIgnoreCase("F")) {
			orchis ++;
		} else {
			balm ++;
			gentian ++;
		}
		
		questionEight(console, alyssum, balm, bryony, camellia, cereus, dahlia, eglantine, gentian, heliotrope, jasmine, mandrake, orchis, valerian);	
	}
	
	/**
	 * 
	 * @return void
	 */
	public static void questionEight(Scanner console, int alyssum, int balm, int bryony, int camellia, int cereus, int dahlia, int eglantine, int gentian, int heliotrope, int jasmine, int mandrake, int orchis, int valerian) {
		System.out.println();
		System.out.println("8. If you had to win over a guard to prevent being arrested, what would you do?");
		System.out.println(" A: Feign innocence and naiveté.");
		System.out.println(" B: Seduce them.");
		System.out.println(" C: I serve a higher power; justice will be administered rightfully.");
		System.out.println(" D: Offer myself to their whim.");
		System.out.println(" E: Bribe them.");		
		System.out.println(" F: Resist arrest, with the power of my house behind me.");
		System.out.println(" G: Devise a creative and persuasive solution in the moment.");
		System.out.println(" H: I wouldn't have gotten arrested in the first place.");
		
		String answer8 = console.nextLine();

		while(!(answer8.equalsIgnoreCase("A") || answer8.equalsIgnoreCase("B") || answer8.equalsIgnoreCase("C") || answer8.equalsIgnoreCase("D")
				|| answer8.equalsIgnoreCase("E") || answer8.equalsIgnoreCase("F") || answer8.equalsIgnoreCase("G") || answer8.equalsIgnoreCase("H"))){
			System.out.println("You entered a character or string of characters other than the listed answers.");
			System.out.println("Please enter one of the above letters and then press the return key. Your answer is not case-sensitive.");
			answer8 = console.nextLine();
		}
				
		if (answer8.equalsIgnoreCase("A")) {
			alyssum ++;
		} else if (answer8.equalsIgnoreCase("B")) {
			jasmine ++;
		} else if (answer8.equalsIgnoreCase("C")) {
			mandrake ++;
		} else if (answer8.equalsIgnoreCase("D")) {
			valerian ++;
		} else if (answer8.equalsIgnoreCase("E")) {
			bryony ++;
		} else if (answer8.equalsIgnoreCase("F")) {
			cereus ++;
			camellia ++;
		} else if (answer8.equalsIgnoreCase("G")) {
			eglantine ++;
		} else {
			dahlia ++;
			gentian ++;
		}
		
		questionNine(console, alyssum, balm, bryony, camellia, cereus, dahlia, eglantine, gentian, heliotrope, jasmine, mandrake, orchis, valerian);	
	}
	
	/**
	 * 
	 * @return void
	 */
	public static void questionNine(Scanner console, int alyssum, int balm, int bryony, int camellia, int cereus, int dahlia, int eglantine, int gentian, int heliotrope, int jasmine, int mandrake, int orchis, int valerian) {
		System.out.println();
		System.out.println("9. What is your greatest shortcoming?");
		System.out.println(" A: My obsession with detail.");
		System.out.println(" B: How I languish in physical pleasure.");
		System.out.println(" C: My overly-stern sense of justice.");
		System.out.println(" D: I turn everything into a game.");
		System.out.println(" E: I'm not outspoken enough.");		
		System.out.println(" F: I often jump headlong into elaborate projects.");
		System.out.println(" G: Once I'm set on an idea, I'm hard to shake.");
		System.out.println(" H: I can sometimes be haughty and overbearing.");
		
		String answer9 = console.nextLine();

		while(!(answer9.equalsIgnoreCase("A") || answer9.equalsIgnoreCase("B") || answer9.equalsIgnoreCase("C") || answer9.equalsIgnoreCase("D")
				|| answer9.equalsIgnoreCase("E") || answer9.equalsIgnoreCase("F") || answer9.equalsIgnoreCase("G") || answer9.equalsIgnoreCase("H"))){
			System.out.println("You entered a character or string of characters other than the listed answers.");
			System.out.println("Please enter one of the above letters and then press the return key. Your answer is not case-sensitive.");
			answer9 = console.nextLine();
		}
				
		if (answer9.equalsIgnoreCase("A")) {
			camellia ++;
		} else if (answer9.equalsIgnoreCase("B")) {
			jasmine ++;
			valerian ++;
		} else if (answer9.equalsIgnoreCase("C")) {
			mandrake ++;
		} else if (answer9.equalsIgnoreCase("D")) {
			bryony ++;
		} else if (answer9.equalsIgnoreCase("E")) {
			alyssum ++;
			balm ++;
		} else if (answer9.equalsIgnoreCase("F")) {
			eglantine ++;
		} else if (answer9.equalsIgnoreCase("G")) {
			heliotrope ++;
		} else {
			dahlia ++;
		}
		
		questionTen(console, alyssum, balm, bryony, camellia, cereus, dahlia, eglantine, gentian, heliotrope, jasmine, mandrake, orchis, valerian);	
	}
	
	/**
	 * 
	 * @return void
	 */
	public static void questionTen(Scanner console, int alyssum, int balm, int bryony, int camellia, int cereus, int dahlia, int eglantine, int gentian, int heliotrope, int jasmine, int mandrake, int orchis, int valerian) {
		System.out.println();
		System.out.println("10. What animal would be your familiar?");
		System.out.println(" A: Swan.");
		System.out.println(" B: Owl.");
		System.out.println(" C: Tiger.");
		System.out.println(" D: Dove.");
		System.out.println(" E: Peacock.");		
		System.out.println(" F: Wild horse.");
		System.out.println(" G: Wolf");
		System.out.println(" H: Otter.");
		System.out.println(" I: Raven.");

		String answer10 = console.nextLine();

		while(!(answer10.equalsIgnoreCase("A") || answer10.equalsIgnoreCase("B") || answer10.equalsIgnoreCase("C") || answer10.equalsIgnoreCase("D")
				|| answer10.equalsIgnoreCase("E") || answer10.equalsIgnoreCase("F") || answer10.equalsIgnoreCase("G")
				|| answer10.equalsIgnoreCase("H") || answer10.equalsIgnoreCase("I"))){
			System.out.println("You entered a character or string of characters other than the listed answers.");
			System.out.println("Please enter one of the above letters and then press the return key. Your answer is not case-sensitive.");
			answer10 = console.nextLine();
		}
				
		if (answer10.equalsIgnoreCase("A")) {
			camellia ++;
			cereus ++;
		} else if (answer10.equalsIgnoreCase("B")) {
			gentian ++;
		} else if (answer10.equalsIgnoreCase("C")) {
			jasmine ++;
		} else if (answer10.equalsIgnoreCase("D")) {
			cereus ++;
			heliotrope ++;
		} else if (answer10.equalsIgnoreCase("E")) {
			eglantine ++;
		} else if (answer10.equalsIgnoreCase("F")) {
			dahlia ++;
		} else if (answer10.equalsIgnoreCase("G")) {
			mandrake ++;
		} else if (answer10.equalsIgnoreCase("H")) {
			bryony ++;
			orchis ++;
		} else {
			mandrake ++;
		}
		
		questionEleven(console, alyssum, balm, bryony, camellia, cereus, dahlia, eglantine, gentian, heliotrope, jasmine, mandrake, orchis, valerian);	
	}
	
	/**
	 * 
	 * @return void
	 */
	public static void questionEleven(Scanner console, int alyssum, int balm, int bryony, int camellia, int cereus, int dahlia, int eglantine, int gentian, int heliotrope, int jasmine, int mandrake, int orchis, int valerian) {
		System.out.println();
		System.out.println("11. Pick a flower.");
		System.out.println(" A: Lavender.");
		System.out.println(" B: Tiger lily.");
		System.out.println(" C: Rose.");
		System.out.println(" D: Forget-me-not.");
		System.out.println(" E: Lotus.");
		System.out.println(" F: Calla lily.");		
		System.out.println(" G: Primrose.");
		System.out.println(" H: Azalea.");
		
		String answer11 = console.nextLine();

		while(!(answer11.equalsIgnoreCase("A") || answer11.equalsIgnoreCase("B") || answer11.equalsIgnoreCase("C") || answer11.equalsIgnoreCase("D")
				|| answer11.equalsIgnoreCase("E") || answer11.equalsIgnoreCase("F") || answer11.equalsIgnoreCase("G") || answer11.equalsIgnoreCase("H"))){
			System.out.println("You entered a character or string of characters other than the listed answers.");
			System.out.println("Please enter one of the above letters and then press the return key. Your answer is not case-sensitive.");
			answer11 = console.nextLine();
		}
				
		if (answer11.equalsIgnoreCase("A")) {
			balm ++;
			gentian ++;
		} else if (answer11.equalsIgnoreCase("B")) {
			bryony ++;
			jasmine ++;
		} else if (answer11.equalsIgnoreCase("C")) {
			cereus ++;
			heliotrope ++;
		} else if (answer11.equalsIgnoreCase("D")) {
			heliotrope ++;
		} else if (answer11.equalsIgnoreCase("E")) {
			balm ++;
			dahlia ++;
		} else if (answer11.equalsIgnoreCase("F")) {
			mandrake ++;
			valerian ++;
		} else if (answer11.equalsIgnoreCase("G")) {
			alyssum ++;
			camellia ++;
			dahlia ++;
		} else {
			eglantine ++;
			orchis ++;
		}
		
		questionTwelve(console, alyssum, balm, bryony, camellia, cereus, dahlia, eglantine, gentian, heliotrope, jasmine, mandrake, orchis, valerian);	
	}
	
	/**
	 * 
	 * @return void
	 */
	public static void questionTwelve(Scanner console, int alyssum, int balm, int bryony, int camellia, int cereus, int dahlia, int eglantine, int gentian, int heliotrope, int jasmine, int mandrake, int orchis, int valerian) {
		System.out.println();
		System.out.println("12. How do you feel about BDSM?");
		System.out.println(" A: How embarrassing and immodest!");
		System.out.println(" B: As long as I'm the one in control.");
		System.out.println(" C: My engagements tend to require a more traditional skill set.");
		System.out.println(" D: It's interesting, as far as the aesthetic and the costumes go.");
		System.out.println(" E: I'd hardly tolerate such a rude show of affection.");
		System.out.println(" F: It's not my primary interest, but I might entertain the idea depending on my partner.");
		System.out.println(" G: My mistress/master knows just how to control me.");		
		System.out.println(" H: While some may find it cathartic, I prefer to find healing in other ways.");
		System.out.println(" I: The best part is betting on which switch will come out on top!");
		System.out.println(" J: I prefer a more light-hearted form of affection.");
		
		String answer12 = console.nextLine();

		while(!(answer12.equalsIgnoreCase("A") || answer12.equalsIgnoreCase("B") || answer12.equalsIgnoreCase("C") || answer12.equalsIgnoreCase("D")
				|| answer12.equalsIgnoreCase("E") || answer12.equalsIgnoreCase("F") || answer12.equalsIgnoreCase("G") 
				|| answer12.equalsIgnoreCase("H") || answer12.equalsIgnoreCase("I") || answer12.equalsIgnoreCase("J"))){
			System.out.println("You entered a character or string of characters other than the listed answers.");
			System.out.println("Please enter one of the above letters and then press the return key. Your answer is not case-sensitive.");
			answer12 = console.nextLine();
		}
				
		if (answer12.equalsIgnoreCase("A")) {
			alyssum +=2;
		} else if (answer12.equalsIgnoreCase("B")) {
			mandrake +=2;
		} else if (answer12.equalsIgnoreCase("C")) {
			cereus ++;
		} else if (answer12.equalsIgnoreCase("D")) {
			eglantine ++;
		} else if (answer12.equalsIgnoreCase("E")) {
			camellia ++;
			cereus ++;
			dahlia ++;
		} else if (answer12.equalsIgnoreCase("F")) {
			heliotrope ++;
		} else if (answer12.equalsIgnoreCase("G")) {
			alyssum ++;
			valerian +=2;
		} else if (answer12.equalsIgnoreCase("H")) {
			balm ++;
			gentian ++;
		} else if (answer12.equalsIgnoreCase("I")) {
			bryony ++;
		} else {
			orchis ++;
		}
		
		questionThirteen(console, alyssum, balm, bryony, camellia, cereus, dahlia, eglantine, gentian, heliotrope, jasmine, mandrake, orchis, valerian);	
	}
	
	/**
	 * 
	 * @return void
	 */
	public static void questionThirteen(Scanner console, int alyssum, int balm, int bryony, int camellia, int cereus, int dahlia, int eglantine, int gentian, int heliotrope, int jasmine, int mandrake, int orchis, int valerian) {
		System.out.println();
		System.out.println("13. What is the most versatile tool for your love-making?");
		System.out.println(" A: Colorful ribbons and other fun props.");
		System.out.println(" B: My mind.");
		System.out.println(" C: My hands.");
		System.out.println(" D: A leather quirt.");
		System.out.println(" E: The visual aesthetic of my body.");		
		System.out.println(" F: My demeanour in the bedroom.");
		System.out.println(" G: Physical relaxtion and emotional intimacy.");
		System.out.println(" H: The versatility of the furniture.");
		
		String answer13 = console.nextLine();

		while(!(answer13.equalsIgnoreCase("A") || answer13.equalsIgnoreCase("B") || answer13.equalsIgnoreCase("C") || answer13.equalsIgnoreCase("D")
				|| answer13.equalsIgnoreCase("E") || answer13.equalsIgnoreCase("F") || answer13.equalsIgnoreCase("G") || answer13.equalsIgnoreCase("H"))){
			System.out.println("You entered a character or string of characters other than the listed answers.");
			System.out.println("Please enter one of the above letters and then press the return key. Your answer is not case-sensitive.");
			answer13 = console.nextLine();
		}
				
		if (answer13.equalsIgnoreCase("A")) {
			eglantine ++;
			orchis ++;
		} else if (answer13.equalsIgnoreCase("B")) {
			bryony ++;
			eglantine ++;
			mandrake ++;
		} else if (answer13.equalsIgnoreCase("C")) {
			jasmine ++;
			mandrake ++;
		} else if (answer13.equalsIgnoreCase("D")) {
			mandrake ++;
			valerian ++;
		} else if (answer13.equalsIgnoreCase("E")) {
			camellia ++;
			cereus ++;
		} else if (answer13.equalsIgnoreCase("F")) {
			alyssum ++;
			dahlia ++;
			valerian ++;
		} else if (answer13.equalsIgnoreCase("F")) {
			balm ++;
			gentian ++;
		} else {
			jasmine ++;
			orchis ++;
		}
		
		questionFourteen(console, alyssum, balm, bryony, camellia, cereus, dahlia, eglantine, gentian, heliotrope, jasmine, mandrake, orchis, valerian);	
	}
	
	/**
	 * 
	 * @return void
	 */
	public static void questionFourteen(Scanner console, int alyssum, int balm, int bryony, int camellia, int cereus, int dahlia, int eglantine, int gentian, int heliotrope, int jasmine, int mandrake, int orchis, int valerian) {
		System.out.println();
		System.out.println("14. Sugar and spice, and everything nice?");
		System.out.println(" A: I prefer sweets.");
		System.out.println(" B: I prefer spices.");
		System.out.println(" C: A combination brings out the best of both.");
		System.out.println(" D: I cater toward neither in particular.");
		
		String answer14 = console.nextLine();

		while(!(answer14.equalsIgnoreCase("A") || answer14.equalsIgnoreCase("B") || answer14.equalsIgnoreCase("C") || answer14.equalsIgnoreCase("D"))){
			System.out.println("You entered a character or string of characters other than the listed answers.");
			System.out.println("Please enter one of the above letters and then press the return key. Your answer is not case-sensitive.");
			answer14 = console.nextLine();
		}
				
		if (answer14.equalsIgnoreCase("A")) {
			balm ++;
			camellia ++;
			cereus ++;
			orchis ++;
		} else if (answer14.equalsIgnoreCase("B")) {
			bryony ++;
			mandrake ++;
			valerian ++;
		} else if (answer14.equalsIgnoreCase("C")) {
			alyssum ++;
			eglantine ++;
			jasmine ++;
		} else {
			dahlia ++;
			gentian ++;
			heliotrope ++;
		}
		
		questionFifteen(console, alyssum, balm, bryony, camellia, cereus, dahlia, eglantine, gentian, heliotrope, jasmine, mandrake, orchis, valerian);	
	}
	
	/**
	 * 
	 * @return void
	 */
	public static void questionFifteen(Scanner console, int alyssum, int balm, int bryony, int camellia, int cereus, int dahlia, int eglantine, int gentian, int heliotrope, int jasmine, int mandrake, int orchis, int valerian) {
		System.out.println();
		System.out.println("15. How do you show your affection for a partner?");
		System.out.println(" A: I show my devotion with eyes only for them, showing them they're loved and cared for.");
		System.out.println(" B: I offer peace in relaxation and healing.");
		System.out.println(" C: We engage in an elaborate game, with a boon for the winner’s enjoyment.");
		System.out.println(" D: Creativity and originality are paramount in love-making.");
		System.out.println(" E: I submit myself to their will, with a tone of respect and adoration.");	
		System.out.println(" F: Love is less about physical satiation, and more about personal exploration.");
		System.out.println(" G: Love-play should be fun, for both partners’ enjoyment and laughter!");
		System.out.println(" H: The traditional manners- flowers, small trinkets, dinners out, and quiet nights in.");
		
		String answer15 = console.nextLine();

		while(!(answer15.equalsIgnoreCase("A") || answer15.equalsIgnoreCase("B") || answer15.equalsIgnoreCase("C") || answer15.equalsIgnoreCase("D")
				|| answer15.equalsIgnoreCase("E") || answer15.equalsIgnoreCase("F") || answer15.equalsIgnoreCase("G") || answer15.equalsIgnoreCase("H"))){
			System.out.println("You entered a character or string of characters other than the listed answers.");
			System.out.println("Please enter one of the above letters and then press the return key. Your answer is not case-sensitive.");
			answer15 = console.nextLine();
		}
				
		if (answer15.equalsIgnoreCase("A")) {
			heliotrope ++;
		} else if (answer15.equalsIgnoreCase("B")) {
			balm ++;
		} else if (answer15.equalsIgnoreCase("C")) {
			bryony ++;
		} else if (answer15.equalsIgnoreCase("D")) {
			eglantine ++;
		} else if (answer15.equalsIgnoreCase("E")) {
			alyssum ++;
			valerian ++;
		} else if (answer15.equalsIgnoreCase("F")) {
			gentian ++;
		} else if (answer15.equalsIgnoreCase("G")) {
			orchis ++;
		} else {
			cereus ++;
			heliotrope ++;
		}
		
		questionSixteen(console, alyssum, balm, bryony, camellia, cereus, dahlia, eglantine, gentian, heliotrope, jasmine, mandrake, orchis, valerian);	
	}
	
	/**
	 * 
	 */
	public static void questionSixteen(Scanner console, int alyssum, int balm, int bryony, int camellia, int cereus, int dahlia, int eglantine, int gentian, int heliotrope, int jasmine, int mandrake, int orchis, int valerian) {
		System.out.println();
		System.out.println("16. Pick a saying.");
		System.out.println(" A: Play the person, not the game.");
		System.out.println(" B: Everything has its time, and everything ends.");
		System.out.println(" C: All knowledge is worth having.");
		System.out.println(" D: I said I would, so I did.");
		System.out.println(" E: If you can bear to say it, I can bear to hear it.");		
		System.out.println(" F: All that blood was never once beautiful; it was just red.");
		System.out.println(" G: We do not see things as they are; we see them as we are.");
		System.out.println(" H: Mistletoe can be deadly if you eat it— but a kiss can be deadlier if you mean it.");
		System.out.println(" I: I bleed myself to be your drink; is not the blood of poets— ink?");
		System.out.println(" J: You’re only given a little spark of madness. You mustn’t lose it.");
		System.out.println(" K: A soft woman is merely a wolf caught in meditation.");
		System.out.println(" L: The world is changed by your example, not your opinion.");
		System.out.println(" M: She likes a gentleman who knows when not to be gentle.");
		
		String answer16 = console.nextLine();

		while(!(answer16.equalsIgnoreCase("A") || answer16.equalsIgnoreCase("B") || answer16.equalsIgnoreCase("C") || answer16.equalsIgnoreCase("D")
				|| answer16.equalsIgnoreCase("E") || answer16.equalsIgnoreCase("F") || answer16.equalsIgnoreCase("G") || answer16.equalsIgnoreCase("H")
				|| answer16.equalsIgnoreCase("I") || answer16.equalsIgnoreCase("J") || answer16.equalsIgnoreCase("K") || answer16.equalsIgnoreCase("L") || answer16.equalsIgnoreCase("M"))){
			System.out.println("You entered a character or string of characters other than the listed answers.");
			System.out.println("Please enter one of the above letters and then press the return key. Your answer is not case-sensitive.");
			answer16 = console.nextLine();
		}
				
		if (answer16.equalsIgnoreCase("A")) {
			bryony ++;
		} else if (answer16.equalsIgnoreCase("B")) {
			cereus ++;
		} else if (answer16.equalsIgnoreCase("C")) {
			eglantine ++;
		} else if (answer16.equalsIgnoreCase("D")) {
			heliotrope ++;
		} else if (answer16.equalsIgnoreCase("E")) {
			balm ++;
		} else if (answer16.equalsIgnoreCase("F")) {
			mandrake ++;
		} else if (answer16.equalsIgnoreCase("G")) {
			gentian ++;
		} else if (answer16.equalsIgnoreCase("H")) {
			jasmine ++;
		} else if (answer16.equalsIgnoreCase("I")) {
			valerian ++;
		} else if (answer16.equalsIgnoreCase("J")) {
			orchis ++;
		} else if (answer16.equalsIgnoreCase("K")) {
			dahlia ++;
		} else if (answer16.equalsIgnoreCase("L")) {
			camellia ++;
		} else {
			alyssum ++;
		}
		
		printRace(console, alyssum, balm, bryony, camellia, cereus, dahlia, eglantine, gentian, heliotrope, jasmine, mandrake, orchis, valerian);
	}
	
	public static void printRace(Scanner console, int alyssum, int balm, int bryony, int camellia, int cereus, int dahlia, int eglantine, int gentian, int heliotrope, int jasmine, int mandrake, int orchis, int valerian) {
		 
		//prints the cumulative trait scores
		System.out.println();
		System.out.println("The emphasis that you place on associated traits is as follows:");
		System.out.println("Modesty: " + alyssum);
		System.out.println("Healing: " + balm);
		System.out.println("Wealth: " + bryony);
		System.out.println("Perfection: " + camellia);
		System.out.println("Fragiligy: " + cereus);
		System.out.println("Dignity: " + dahlia);
		System.out.println("Creativity: " + eglantine);
		System.out.println("Mysticism: " + gentian);
		System.out.println("Devotion: " + heliotrope);
		System.out.println("Sensuality: " + jasmine);
		System.out.println("Dominance: " + mandrake);
		System.out.println("Humor: " + orchis);
		System.out.println("Submission: " + valerian);
		System.out.println();
		
		//calculates house based on the 13 house variables
		if (alyssum > balm && alyssum > bryony && alyssum > camellia && alyssum > cereus
				&& alyssum > dahlia && alyssum > eglantine && alyssum > gentian && alyssum > heliotrope
				&& alyssum > jasmine && alyssum > mandrake && alyssum > orchis && alyssum > valerian) {
			System.out.println("You belong to Alyssum House!");
			System.out.println("Alyssum's canon is modesty, and their saying is \"With Eyes Averted\".");
		} else if (balm > alyssum && balm > bryony && balm > camellia && balm > cereus
				&& balm > dahlia && balm > eglantine && balm > gentian && balm > heliotrope
				&& balm > jasmine && balm > mandrake && balm > orchis && balm > valerian) {
			System.out.println("You belong to Balm House!");
			System.out.println("Balm's canon is healing, and their saying is \"Rest and Be Soothed\".");
		} else if (bryony > alyssum && bryony > balm && bryony > camellia && bryony > cereus
				&& bryony > dahlia && bryony > eglantine && bryony > gentian && bryony > heliotrope
				&& bryony > jasmine && bryony > mandrake && bryony > orchis && bryony > valerian) {
			System.out.println("You belong to Bryony House!");
			System.out.println("Bryony's canon is weath, and their saying is \"Wealth seeks company\".");
		} else if (camellia > alyssum && camellia > balm && camellia > bryony && camellia > cereus
				&& camellia > dahlia && camellia > eglantine && camellia > gentian && camellia > heliotrope
				&& camellia > jasmine && camellia > mandrake && camellia > orchis && camellia > valerian) {
			System.out.println("You belong to Camellia House!");
			System.out.println("Camellia's canon is perfection, and their saying is \"Without Fault or Flaw\".");
		} else if (cereus > alyssum && cereus > balm && cereus > bryony && cereus > camellia
				&& cereus > dahlia && cereus > eglantine && cereus > gentian && cereus > heliotrope
				&& cereus > jasmine && cereus > mandrake && cereus > orchis && cereus > valerian) {
			System.out.println("You belong to Cereus House!");
			System.out.println("Cereus' canon is Fragility, and their saying is \"All Loveliness Fades\".");
		} else if (dahlia > alyssum && dahlia > balm && dahlia > bryony && dahlia > camellia
				&& dahlia > cereus && dahlia > eglantine && dahlia > gentian && dahlia > heliotrope
				&& dahlia > jasmine && dahlia > mandrake && dahlia > orchis && dahlia > valerian) {
			System.out.println("You belong to Dahlia House!");
			System.out.println("Dahlia's canon is dignity, and their saying is \"Upright and Unbending\".");
		} else if (eglantine > alyssum && eglantine > balm && eglantine > bryony && eglantine > camellia
				&& eglantine > cereus && eglantine > dahlia && eglantine > gentian && eglantine > heliotrope
				&& eglantine > jasmine && eglantine > mandrake && eglantine > orchis && eglantine > valerian) {
			System.out.println("You belong to Eglantine House!");
			System.out.println("Eglantine's canon is creativity, and their saying is \"To Create is to Live\".");
		} else if (gentian > alyssum && gentian > balm && gentian > bryony && gentian > camellia
				&& gentian > cereus && gentian > dahlia && gentian > eglantine && gentian > heliotrope
				&& gentian > jasmine && gentian > mandrake && gentian > orchis && gentian > valerian) {
			System.out.println("You belong to Gentian House!");
			System.out.println("Gentian's canon is mysticism, and their saying is \"Truth and Vision\".");
		} else if (heliotrope > alyssum && heliotrope > balm && heliotrope > bryony && heliotrope > camellia
				&& heliotrope > cereus && heliotrope > dahlia && heliotrope > eglantine && heliotrope > gentian
				&& heliotrope > jasmine && heliotrope > mandrake && heliotrope > orchis && heliotrope > valerian) {
			System.out.println("You belong to Heliotrope House!");
			System.out.println("Heliotrope's canon is devotion, and their saying is \"Thou, and No Other\".");
		} else if (jasmine > alyssum && jasmine > balm && jasmine > bryony && jasmine > camellia
				&& jasmine > cereus && jasmine > dahlia && jasmine > eglantine && jasmine > gentian
				&& jasmine > heliotrope && jasmine > mandrake && jasmine > orchis && jasmine > valerian) {
			System.out.println("You belong to Jasmine House!");
			System.out.println("Jasmine's canon is sensuality, and their saying is \"For Pleasure's Sake\".");
		} else if (mandrake > alyssum && mandrake > balm && mandrake > bryony && mandrake > camellia
				&& mandrake > cereus && mandrake > dahlia && mandrake > eglantine && mandrake > gentian
				&& mandrake > heliotrope && mandrake > jasmine && mandrake > orchis && mandrake > valerian) {
			System.out.println("You belong to Mandrake House!");
			System.out.println("Mandrake's canon is dominance, and their saying is \"Yield All\".");
		} else if (orchis > alyssum && orchis > balm && orchis > bryony && orchis > camellia
				&& orchis > cereus && orchis > dahlia && orchis > eglantine && orchis > gentian
				&& orchis > heliotrope && orchis > jasmine && orchis > mandrake && orchis > valerian) {
			System.out.println("You belong to Orchis House!");
			System.out.println("Orchis' canon is humor, and their saying is \"Joy in Laughter\".");
		} else if (valerian > alyssum && valerian > balm && valerian > bryony && valerian > camellia
				&& valerian > cereus && valerian > dahlia && valerian > eglantine && valerian > gentian
				&& valerian > heliotrope && valerian > jasmine && valerian > mandrake && valerian > orchis) {
			System.out.println("You belong to Valerian House!");
			System.out.println("Valerian's canon is submission, and their saying is \"I Yield\".");
		
		} else {
			System.out.println("Your results are inconclusive.");
			System.out.println("Would you like to take the quiz again? Please enter Y for yes or N for no.");
			
			String answerFinal = console.nextLine();

			while(!(answerFinal.equalsIgnoreCase("Y") || answerFinal.equalsIgnoreCase("N"))){
				System.out.println("You entered a character or string of characters other than Y or N. Your answer is not case-sensitive.");
				System.out.println("Please enter Y or N and then press the return key. Your answer is not case-sensitive.");
				answerFinal = console.nextLine();
			}
			
			if (answerFinal.equalsIgnoreCase("Y")) {
				questionOne(console, alyssum, balm, bryony, camellia, cereus, dahlia, eglantine, gentian, heliotrope, jasmine, mandrake, orchis, valerian);	
			} else {
				System.out.println("Thank you for participating!");
			}
		//closes the first if-else statement
		}
	//closes the final method
	}
	
//closes the class
}