/**
 * 
 */
import java.util.*;
/**
 * @author maddierook
 *
 */
public class ProgrammingCompetition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		Scanner console = new Scanner(System.in);
		System.out.println("What is the input text for Finding Nemo?");
		
		int bobcat = 0;
		int coyote = 0;
		int mlion = 0;
		int wolf = 0;
		
		String location = "blank";
		
		while (console.hasNextLine()) {
			if (console.hasNextInt()) {
				console.nextLine();
			} else {
				location = console.next();
				if (console.next().equalsIgnoreCase("W")) {
					wolf +=2;
				} else if ((console.next().equalsIgnoreCase("C"))) {
					coyote += 1;
				} else if ((console.next().equalsIgnoreCase("M"))) {
					mlion +=4;
				} else if ((console.next().equalsIgnoreCase("W"))) {
					wolf += 3;
				}
			}
						
			if (bobcat > coyote || bobcat > mlion || bobcat > wolf) {
				System.out.print(location + ":");
				System.out.println("The Bobcat is the dominant species.");
			} else if (coyote > bobcat || coyote > mlion || coyote > wolf) {
				System.out.print(location + ":");
				System.out.println("The Coyote is the dominant species.");
			} else if (mlion > bobcat || mlion > coyote || mlion > wolf) {
				System.out.print(location + ":");
				System.out.println("The Mountain Lion is the dominant species.");
			} else if (wolf > bobcat || wolf > coyote || wolf > mlion) {
				System.out.print(location + ":");
				System.out.println("The Wolf is the dominant species.");
			} else {
				System.out.print(location + ":");
				System.out.println("There is no dominant species.");
			}
		}

		
		System.out.println("");
		*/
		
		Scanner candy = new Scanner(System.in);
		
		System.out.println("Please enter the input text.");
		
		int numLines = candy.nextInt();
		
		int lines[] = new int[numLines];
		int pieces[] = new int[numLines];
		int you = 0;
		int siblings[] = new int[numLines];
		int dad = 0;
				
		for (int i = 0; i < numLines; i++) {
			pieces[i] = candy.nextInt();
			siblings[i] = candy.nextInt();			
		}
		
		for (int i = 0; i < numLines; i++) {
			dad = pieces[i] % (siblings[i] + 1);
			you = (pieces[i] - dad) / (siblings[i] + 1);	
			System.out.println("You get " + you + " piece(s), and your dad gets " + dad + " piece(s).");
		}
	}

}
