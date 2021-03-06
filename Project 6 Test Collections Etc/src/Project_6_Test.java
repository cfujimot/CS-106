import java.util.*;

/**
 * @author maddierook
 *
 */
public class Project_6_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("ARRAY LIST");

		ArrayList<String> testArrayList = new ArrayList<String>();
		testArrayList.add("0: The Fool");
		testArrayList.add("1: The Magician");
		testArrayList.add("2: The High Priestess");
		testArrayList.add("3: The Empress");
		
		System.out.println("Prints the array list after populating 4 positions.");
		System.out.println(testArrayList);
		System.out.println();
		
		testArrayList.remove(2);
		System.out.println("Prints the array list after removing The High Priestess.");
		System.out.println(testArrayList);
		System.out.println();
		
		System.out.println("Prints the modified array list using a for-each loop.");
		for (String a : testArrayList) {
			System.out.println(a);
		}
		System.out.println();
		
		System.out.println("Prints the modified array list using an iterator.");
		Iterator <String> i = testArrayList.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		
		System.out.println("LINKED LIST");
		LinkedList<String> testLinkedList = new LinkedList<String>();
		testLinkedList.add("4: The Emperor");
		testLinkedList.add("5: The Hierophant");
		testLinkedList.add("6: The Lovers");
		testLinkedList.add("7: The Chariot");
		
		System.out.println("Prints the linked list after populating 4 positions.");
		System.out.println(testLinkedList);
		System.out.println();
		
		testLinkedList.remove(1);
		System.out.println("Prints the linked list after removing The Hierophant.");
		System.out.println(testLinkedList);
		System.out.println();
		
		System.out.println("Prints the modified linked list using a for-each loop.");
		for (String l : testLinkedList) {
			System.out.println(l);
		}
		System.out.println();
		
		System.out.println("Prints the modified linked list using an iterator.");
		Iterator <String> j = testLinkedList.iterator();
		while (j.hasNext()) {
			System.out.println(j.next());
		}
		System.out.println();
		
		System.out.println("TREE SET");
		TreeSet<String> testTreeSet = new TreeSet<String>();
		testTreeSet.add("8: Justice");
		testTreeSet.add("9: The Hermit");
		testTreeSet.add("10: The Wheel");
		testTreeSet.add("11: Strength");
		
		System.out.println("Prints the tree set after populating 4 positions.");
		System.out.println(testTreeSet);
		System.out.println();
		
		testTreeSet.remove("11: Strength");
		System.out.println("Prints the tree set after removing Strength.");
		System.out.println(testTreeSet);
		System.out.println();
		
		System.out.println("Prints the modified tree set using a for-each loop.");
		for (String t : testTreeSet) {
			System.out.println(t);
		}
		System.out.println();
		
		System.out.println("Prints the modified tree set using an iterator.");
		Iterator <String> k = testTreeSet.iterator();
		while (k.hasNext()) {
			System.out.println(k.next());
		}
		System.out.println();
		
		System.out.println("Attempts to re-add Strength twice.");
		testTreeSet.add("11: Strength");
		testTreeSet.add("11: Strength");
		System.out.println(testTreeSet);
		
	}

}
