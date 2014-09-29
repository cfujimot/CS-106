/**
 * Imports Scanner functionality.
 */
import java.util.*;

/**
 * This class calculates which Guild Wars 2 Race you are based on your responses.
 * 
 * @see Quiz: Daily MTG, borrowed phrasing and style of some questions <http://www.wizards.com/magic/quiz/quiz.aspx?x=mtg/quiz/guild>
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

		//define attribute variables
		int curiosity = 0;
		int empathy = 0;
		int heroism = 0;
		int ingenuity = 0;
		int pragmatism = 0;
		int warring = 0;
		
		//define scanner for following question
		Scanner console = new Scanner(System.in);

		System.out.println("Please enter the letter of your answer for each of the following questions.");
		
		//commence tracking with question one
		questionOne(console, curiosity, empathy, heroism, ingenuity, pragmatism, warring);	
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
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionOne(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int pragmatism, int warring) {
		//ask the first question and prompt for the first answer
		System.out.println();
		System.out.println("1. If you could create your ideal society, what would it be?");
		System.out.println(" A: An isolated niche in nature where all beings are mentally connected and working toward a common purpose, but relatively unaware of what lies beyond their borders.");
		System.out.println(" B: A grand city-state where alliances are won through skirmishes and honor is highly valued.");
		System.out.println(" C: A place of learning where everyone begins on a level playing field, and one’s ascendence through society’s ranks is determined by the cleverness of their inventions.");
		System.out.println(" D: A serene village where creativity is respected, but hard work is also valued, and neighbors are always willing to lend a helping hand.");
		
		String answer1 = console.nextLine();
		
		//recalculate value of each variable based on the first answer
		if (answer1.equalsIgnoreCase("A")) {
			empathy += 2;
			curiosity --;
		} else if (answer1.equalsIgnoreCase("B")) {
			heroism ++;
			warring ++;
		} else if (answer1.equalsIgnoreCase("C")) {
			ingenuity += 2;
			curiosity ++;
		} else {
			pragmatism +=2;
			empathy ++;
			ingenuity ++;
			warring --;
		}
		
		//passes control flow to question 2
		questionTwo(console, curiosity, empathy, heroism, ingenuity, pragmatism, warring);	
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
	 * @param pragmatism  The tracking variable for the pragmatism trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionTwo(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int pragmatism, int warring) {
		//ask the second question and prompt for the second answer
		System.out.println();
		System.out.println("2. What is your opinion on the merits of philosophy in the progress of society?");
		System.out.println(" A: As an intelligent race, it’s the only way for us to move forward.");
		System.out.println(" B: It’s useful to think about, but only if we can apply its principles to real problems.");
		System.out.println(" C: I don’t need philosophy; all you need to know is the good of the many versus the good of the few.");
		System.out.println(" D: Philosophy is only worth considering if it helps me whip my minions into shape.");

		String answer2 = console.nextLine();

		//recalculate value of each variable based on the second answer
		if (answer2.equalsIgnoreCase("A")) {
			curiosity ++;
			ingenuity ++;
			pragmatism --;
		} else if (answer2.equalsIgnoreCase("B")) {
			pragmatism ++;
		} else if (answer2.equalsIgnoreCase("C")) {
			heroism ++;
			empathy --;
		} else {
			warring +=2;
		}
		
		//passes control flow to question 3
		questionThree(console, curiosity, empathy, heroism, ingenuity, pragmatism, warring);
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
	 * @param pragmatism  The tracking variable for the pragmatism trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionThree(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int pragmatism, int warring) {
		//ask the third question and prompt for the third answer
		System.out.println();
		System.out.println("3. How do you tend to work through problems that you encounter on a daily basis?");
		System.out.println(" A: Running into them headlong a few times seems to work well enough!");
		System.out.println(" B: I lay out a step-by-step plan and follow it to the letter.");
		System.out.println(" C: Daily problems don’t interest me unless they require some show of skill and honor.");
		System.out.println(" D: I devise a machine to do it for me.");

		String answer3 = console.nextLine();

		//recalculate value of each variable based on the third answer
		if (answer3.equalsIgnoreCase("A")) {
			warring ++;
		} else if (answer3.equalsIgnoreCase("B")) {
			pragmatism ++;
		} else if (answer3.equalsIgnoreCase("C")) {
			heroism ++;
		} else {
			ingenuity ++;
		}
		
		//passes control flow to question 4
		questionFour(console, curiosity, empathy, heroism, ingenuity, pragmatism, warring);
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
	public static void questionFour(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int pragmatism, int warring) {
		//ask the fourth question and prompt for the fourth answer
		System.out.println();
		System.out.println("4. What would you do to inspire a crowd?");
		System.out.println(" A: Present the facts of my research and allow them to speak for themselves.");
		System.out.println(" B: Devise an intelligent creation or wild spectacle to accompany my presentation— crowds are always more likely to believe given an awe factor.");
		System.out.println(" C: Rally them around a common cause— and by around common cause, I mean against a common enemy, which they believe to be the scourge of our existence.");
		System.out.println(" D: I’d inspire them believe in the honor and righteousness of my cause and in the integrity of the city, which I would lay down my life to protect.");

		String answer4 = console.nextLine();

		//recalculate value of each variable based on the fourth answer
		if (answer4.equalsIgnoreCase("A")) {
			pragmatism ++;
		} else if (answer4.equalsIgnoreCase("B")) {
			ingenuity ++;
		} else if (answer4.equalsIgnoreCase("C")) {
			warring ++;
		} else {
			heroism ++;
		}
		
		//passes control flow to question 5
		questionFive(console, curiosity, empathy, heroism, ingenuity, pragmatism, warring);
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
	 * @param pragmatism  The tracking variable for the pragmatism trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionFive(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int pragmatism, int warring) {
		//ask the fifth question and prompt for the fifth answer
		System.out.println();
		System.out.println("5. How should an army be organized?");
		System.out.println(" A: It should be ordered into ranks of infantry and cavalry, rallied around a single inspiring leader.");
		System.out.println(" B: Whoever makes the kill, eats the kill!");
		System.out.println(" C: In order for the city to be at peace, we should discourage fighting, and turn resources that would be funneled into the army instead toward the betterment of the disadvantaged and the comfort of the elderly.");
		System.out.println(" D: The primary goal of the army when expanding into new territory should be to gather information without destroying natural resources, such that the college can learn as much as possible about our world— only if it is attacked should it retaliate.");

		String answer5 = console.nextLine();

		//recalculate value of each variable based on the fifth answer
		if (answer5.equalsIgnoreCase("A")) {
			heroism ++;
			pragmatism ++;
		} else if (answer5.equalsIgnoreCase("B")) {
			warring +=2;
		} else if (answer5.equalsIgnoreCase("C")) {
			empathy ++;
			warring --;
		} else {
			curiosity ++;
		}
		
		//passes control flow to question 6
		questionSix(console, curiosity, empathy, heroism, ingenuity, pragmatism, warring);
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
	 * @param pragmatism  The tracking variable for the pragmatism trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionSix(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int pragmatism, int warring) {
		//ask the sixth question and prompt for the sixth answer
		System.out.println();
		System.out.println("6. Someone challenges you to a duel in the middle of a crowded street— what do you do?");
		System.out.println(" A: If they want to fight me fine— but first, I have a duty to clear all bystanders to a safe distance before my spectacular display.");
		System.out.println(" B: I’d chop out his tongue for daring to challenge me, and likely his fighting hand while I’m at it.");
		System.out.println(" C: I’d accept, though I currently have no weapons in hand; as my attacker is charging me, I’d trigger a cleverly designed telekinetic detonation of my own personal design— that should teach him to mess with a senior graduate of the Mages’ College.");
		System.out.println(" D: If we could just talk out our dispute, I’m sure we could come to a mutual understanding without the need of weapons.");

		String answer6 = console.nextLine();

		//recalculate value of each variable based on the sixth answer
		if (answer6.equalsIgnoreCase("A")) {
			empathy ++;
			heroism ++;
			pragmatism ++;
		} else if (answer6.equalsIgnoreCase("B")) {
			warring +=2;
			pragmatism --;
		} else if (answer6.equalsIgnoreCase("C")) {
			ingenuity ++;
		} else {
			empathy ++;
			warring --;
		}
		
		//passes control flow to question 7
		questionSeven(console, curiosity, empathy, heroism, ingenuity, pragmatism, warring);
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
	 * @param pragmatism  The tracking variable for the pragmatism trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionSeven(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int pragmatism, int warring) {
		//ask the seventh question and prompt for the seventh answer
		System.out.println();
		System.out.println("7. If you were offered control over one aspect of the city, which would it be?");
		System.out.println(" A: The universities, to gain more knowledge and in turn teach the following generation.");
		System.out.println(" B: The religious body, to offer consolation to the populous.");
		System.out.println(" C: The army, to protect the city.");
		System.out.println(" D: The governmental body, to parse out responsibility to those beneath me.");

		String answer7 = console.nextLine();

		//recalculate value of each variable based on the seventh answer
		if (answer7.equalsIgnoreCase("A")) {
			curiosity ++;
			ingenuity ++;
		} else if (answer7.equalsIgnoreCase("B")) {
			empathy ++;
		} else if (answer7.equalsIgnoreCase("C")) {
			warring +=2;
			heroism ++;
		} else {
			pragmatism ++;
		}
		
		//passes control flow to question 8
		questionEight(console, curiosity, empathy, heroism, ingenuity, pragmatism, warring);
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
	public static void questionEight(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int pragmatism, int warring) {
		//ask the eighth question and prompt for the eighth answer
		System.out.println();
		System.out.println("8. Given free reign and no obligations, how would you choose to spend your life?");
		System.out.println(" A: Helping the sick or underprivileged to make their lives more comfortable.");
		System.out.println(" B: Go to the ends of the earth to learn as much about the world as possible, and compile it all for others to follow in my footsteps before I died.");
		System.out.println(" C: Death is merely an obstacle; I would devise a path toward immortality.");
		System.out.println(" D: I would live my life on a whim, cutting down anyone who stood in my way.");

		String answer8 = console.nextLine();

		//recalculate value of each variable based on the eighth answer
		if (answer8.equalsIgnoreCase("A")) {
			empathy +=2;
			heroism ++;
		} else if (answer8.equalsIgnoreCase("B")) {
			curiosity ++;
		} else if (answer8.equalsIgnoreCase("C")) {
			ingenuity +=2;
			pragmatism --;
		} else {
			warring +=2;
			heroism ++;
		}
		
		//passes control flow to question 9
		questionNine(console, curiosity, empathy, heroism, ingenuity, pragmatism, warring);
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
	 * @param pragmatism  The tracking variable for the pragmatism trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionNine(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int pragmatism, int warring) {
		//ask the ninth question and prompt for the ninth answer
		System.out.println();
		System.out.println("9. You come across what appears to be someone being harassed by guards in the street— what do you do?");
		System.out.println(" A: I step in, one hand on my sword hilt and the other on my coin purse— perhaps they can be…convinced.");
		System.out.println(" B: I interject politely and see if I can help solve the dispute— no one will benefit from fighting.");
		System.out.println(" C: I try to win the guards over with a passionate articulation of the victim’s story!");
		System.out.println(" D: If the concern doesn’t affect me, it’s not my problem— keep on walking>");

		String answer9 = console.nextLine();

		//recalculate value of each variable based on the ninth answer
		if (answer9.equalsIgnoreCase("A")) {
			heroism ++;
			ingenuity ++;
		} else if (answer9.equalsIgnoreCase("B")) {
			pragmatism ++;
			warring --;
		} else if (answer9.equalsIgnoreCase("C")) {
			heroism +=2;
			empathy ++;
		} else {
			pragmatism ++;
			empathy --;
		}
		
		//passes control flow to question 10
		questionTen(console, curiosity, empathy, heroism, ingenuity, pragmatism, warring);
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
	 * @param pragmatism  The tracking variable for the pragmatism trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionTen(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int pragmatism, int warring) {
		//ask the tenth question and prompt for the tenth answer
		System.out.println();
		System.out.println("10. If someone were to show up on your doorstep tomorrow morning and say that an alternate universe existed, what would you do?");
		System.out.println(" A: New intelligent lifeforms and technology to be gained? Take me there immediately!");
		System.out.println(" B: I don’t care much for the creatures that exist there, but I’d bring back any new technology I could and study the hell out of it.");
		System.out.println(" C: It clearly poses a threat to our society— we should inform the appropriate authorities and prepare to defend our borders.");
		System.out.println(" D: I would prepare a scouting party to explore and bring back anything that could be useful to our society.");

		String answer10 = console.nextLine();

		//recalculate value of each variable based on the tenth answer
		if (answer10.equalsIgnoreCase("A")) {
			curiosity +=2;
			pragmatism --;
		} else if (answer10.equalsIgnoreCase("B")) {
			ingenuity ++;
			empathy --;
		} else if (answer10.equalsIgnoreCase("C")) {
			pragmatism ++;
			warring ++;
		} else {
			heroism ++;
			pragmatism ++;
		}
		
		//passes control flow to question 11
		questionEleven(console, curiosity, empathy, heroism, ingenuity, pragmatism, warring);
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
	 * @param pragmatism  The tracking variable for the pragmatism trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionEleven(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int pragmatism, int warring) {
		//ask the eleventh question and prompt for the eleventh answer
		System.out.println();
		System.out.println("11. If you lived in a fantasy world, which side quests would you do?");
		System.out.println(" A: Anything that involves helping others, but not at the cost of killing innocent beings.");
		System.out.println(" B: Saving a damsel in distress? Count me in!");
		System.out.println(" C: Only those that would further my knowledge of the world.");
		System.out.println(" D: Anything that helps me level up, improves my gear, and gives me an advantage over the next guy.");

		String answer11 = console.nextLine();

		//recalculate value of each variable based on the eleventh answer
		if (answer11.equalsIgnoreCase("A")) {
			empathy +=2;
		} else if (answer11.equalsIgnoreCase("B")) {
			heroism +=2;
			warring ++;
		} else if (answer11.equalsIgnoreCase("C")) {
			curiosity ++;
			empathy ++;
		} else {
			pragmatism ++;
			empathy --;
		}
		
		//passes control flow to question 12
		questionTwelve(console, curiosity, empathy, heroism, ingenuity, pragmatism, warring);
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
	 * @param pragmatism  The tracking variable for the pragmatism trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionTwelve(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int pragmatism, int warring) {
		//ask the twelfth question and prompt for the twelfth answer
		System.out.println();
		System.out.println("12. If you were engaged in a heated debate with someone, what would you do?");
		System.out.println(" A: Lay out the facts and ask him/her to do the same. Whoever has the most facts on their side is clearly in the right.");
		System.out.println(" B: I’d hammer my point home. Literally.");
		System.out.println(" C: Listen carefully to his or her argument, so I could come up with the most convincing and persuasive counterarguments, even if I’d have to bend the facts a little to fit my side. Allowing the opposition to believe what they infer isn’t technically lying, right?");
		System.out.println(" D: I’m not one for heated debates; I’d rather have a civil discussion with someone, because I’m legitimately interested in their opinions and want to learn more about viewpoints other than my own .");

		String answer12 = console.nextLine();

		//recalculate value of each variable based on the twelfth answer
		if (answer12.equalsIgnoreCase("A")) {
			pragmatism ++;
		} else if (answer12.equalsIgnoreCase("B")) {
			warring +=2;
		} else if (answer12.equalsIgnoreCase("C")) {
			heroism ++;
		} else {
			curiosity ++;
			warring --;
		}
		
		//passes control flow to question 13
		questionThirteen(console, curiosity, empathy, heroism, ingenuity, pragmatism, warring);
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
	 * @param pragmatism  The tracking variable for the pragmatism trait.
	 * @param warring The tracking variable for the warring trait.
	 * 
	 * @return void
	 */
	public static void questionThirteen(Scanner console, int curiosity, int empathy, int heroism, int ingenuity, int pragmatism, int warring) {
		//ask the thirteen question and prompt for the thirteen answer
		System.out.println();
		System.out.println("13. If someone close to you were to come to harm, what would you do?");
		System.out.println(" A: Ensure that their every need was taken care of until I could help them back to health— my duty lies with my friends, and not in revenge upon my enemies.");
		System.out.println(" B: Gather all the physical evidence that might point to the aggressor, then fingerprint all suspects and see the culprit brought to justice through sanctioned channels.");
		System.out.println(" C: Seek out their attacker and take vengeance on my own terms.");
		System.out.println(" D: Devise a way to hack into the city’s power source and turn all its resources to finding the one responsible.");
		
		String answer13 = console.nextLine();

		//recalculate value of each variable based on the thirteen answer
		if (answer13.equalsIgnoreCase("A")) {
			curiosity ++;
		} else if (answer13.equalsIgnoreCase("B")) {
			heroism ++;
			pragmatism ++;
		} else if (answer13.equalsIgnoreCase("C")) {
			heroism ++;
			warring ++;
		} else {
			heroism ++;
			ingenuity ++;
		}
		
		//passes control flow to the results method
		printRace(curiosity, empathy, heroism, ingenuity, pragmatism, warring);
	}
	
	public static void printRace(int curiosity, int empathy, int heroism, int ingenuity, int pragmatism, int warring) {
		 
		//prints the cumulative trait scores
		System.out.println();
		System.out.println("Your results are as follows:");
		System.out.println("Curiosity: " + curiosity);
		System.out.println("Empathy: " + empathy);
		System.out.println("Heroism: " + heroism);
		System.out.println("Ingenuity: " + ingenuity);
		System.out.println("Pragmatism: " + pragmatism);
		System.out.println("Warring: " + warring);
		
		//calculates race based on the six trait variables
		if (ingenuity > curiosity && ingenuity > empathy && ingenuity > heroism && ingenuity > pragmatism && ingenuity > warring
				&& pragmatism > curiosity && pragmatism > empathy && pragmatism > heroism && pragmatism > warring
				&& curiosity > empathy && curiosity > heroism && curiosity > warring) {
			System.out.println("You are an Asura!");
		} else if (pragmatism > curiosity && pragmatism > empathy && pragmatism > heroism && pragmatism > ingenuity && pragmatism > warring
				&& warring > curiosity && warring > empathy && warring > heroism && warring > ingenuity
				&& ingenuity > curiosity && ingenuity > empathy && ingenuity > heroism) {
			System.out.println("You are a Char!");
		} else if (heroism > curiosity && heroism > empathy && heroism > ingenuity && heroism > pragmatism && heroism > warring
				&& ingenuity > curiosity && ingenuity > empathy && ingenuity > pragmatism && ingenuity > warring
				&& empathy > curiosity && empathy > pragmatism && empathy > warring) {
			System.out.println("You are a Human!");
		} else if (warring > curiosity && warring > empathy && warring > heroism && warring > ingenuity && warring > pragmatism
				&& curiosity > empathy && curiosity > heroism && curiosity > ingenuity && curiosity > pragmatism
				&& heroism > empathy && heroism > ingenuity && heroism > pragmatism) {
			System.out.println("You are a Norn!");
		} else if (curiosity > empathy && curiosity > heroism && curiosity > ingenuity && curiosity > pragmatism && curiosity > warring
				&& empathy > heroism && empathy > ingenuity && empathy > pragmatism && empathy > warring
				&& ingenuity > heroism && ingenuity > pragmatism && ingenuity > warring) {
			System.out.println("You are a Sylvari!");
		} else {
			System.out.println("Your results are inconclusive.");
		}
		
	}

//closes the class
}