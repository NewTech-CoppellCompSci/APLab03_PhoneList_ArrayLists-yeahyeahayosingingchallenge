package phoneList;

import java.util.Scanner;
import java.util.ArrayList;


/*
 * Phone List
 * 
 * You'll be using an ArrayList of Contact objects
 * to crate a digital address book.
 * 
 * You MUST
 *   - Use an ArrayList
 *   - Keep list in alphabetical order
 *   - Complete the 
 *   
 * You May
 *   - Add methods as you see fit
 *   - Change method parameters and return types
 *   
 * You May NOT
 *   - change the menu method
 *        unless you're changing what methods it calls
 * 
 */


public class PhoneList {
	
	private ArrayList<Contact> internalList;
	/*
	 * Instance Variables
	 * 
	 */
	
	
	
	//Constructor
	public PhoneList() {
		internalList = new ArrayList<Contact>();
		//initialize instance variables
	}
	
	
	/*
	 * This should do the following
	 * (whatever order you feel is best)
	 *   - ask the user for contact's name and number
	 *   - create a new Contact object with that input
	 *   - add that object to the phone list
	 *        in alphabetical order
	 *        Hint: compareTo(String other)
	 *   - tell the user what the new contact is and that 
	 *        it's been added
	 */
	public void addContact() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("What is the contact's name?!");
		String name = inKey.next();
		System.out.println("What is the contact's phone number");
		String number = inKey.next();
		System.out.println("The contact has been added to your list");
		int i = 0;
		while(i<internalList.size() && internalList.get(i).getName() != name) {
			i++;
		}	if(i<internalList.size()) {
			internalList.add(i, new Contact(name, number));
			} else {
			internalList.add(new Contact(name, number));
		}
		
	}
	
	
	
	/*
	 * This should do the following
	 * (whatever order you feel is best)
	 *   - ask the user for the contact's name
	 *   - search through the list for that contact
	 *   - if the contact is not found
	 *        tell the user and end the method
	 *   - if the contact is found
	 *        Remove the item from the list
	 *        Print the contact's name and number
	 *        Say that contact has been removed
	 *        Remove the item from the list
	 *        
	 */
	public void removeContact() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("What contact do you want to remove?!");
		String name = inKey.next();
		int i = 0;
		boolean right = false;
		int ind = 0;
		while(i < internalList.size()) {
			
			System.out.println(internalList.get(i).getName());
			System.out.println(name);
			if (internalList.get(i).getName().equals(name)) {
				right = true;
				ind = i;
			}
			i++;
		}
		System.out.println(right);
		if(right) {
			internalList.remove(ind);
			System.out.println(name + " has now been removed your contact list");
		} else {
			System.out.println(name + " is invalid lololo (+_+)");
		}
	}
	
	
	/*
	 * This should
	 *   - Print all items in list
	 *   - Must be headers for all columns
	 *   - print in alphabetical order
	 *   - print line of something to "box" the list
	 *       Examples:
	 *          *****************
	 *          -----------------
	 *          #################
	 */
	public void printList() 
	{
		System.out.println(internalList);
	}

	
	
	/*
	 * GET FAMILIAR WITH THIS MENU!!!!
	 * 
	 * I will be asking you to create programs with menus.
	 * You may do them however you like.  But here is an example
	 * of how to manage them.
	 * 
	 */
	public void menu() {
		
		int input = 0;
		
		String menu = "-----------------------\n"
				    + "     Contacts Menu     \n"
				    + "-----------------------\n"
				    + "  1 - Add Contact      \n"
				    + "  2 - Remove Contact   \n"
				    + "  3 - Print List       \n"
				    + "  4 - Quit             \n\n"
				    + "Enter Choice: ";
		
		while (input != 4) {  //keep looping till user want's to quit
			
			//try getting an input
			try {
				String inputString = getString("\n" + menu);  //get input
				input = Integer.valueOf(inputString);  //try converting to int
			}
			catch (Exception e) {
				//if bad input, set input to 0
				input = 0;  
			}
		
			switch (input) {
			case 1:
				//handle menu line 1: Add Contact
				addContact();
				break;
			case 2:
				//handle menu line 2: Remove Contact
				removeContact();
				break;
			case 3:
				//handle menu line 3: Print List
				printList();
				break;
			case 4:
				//handle menu line 4: Quit
				System.out.println("\nGoodbye!");
				break;
			default:
				System.out.println("\nNot a valid input.\n"
								 + "Please try again.");
			}
			
			
		
		}
		
	}
	
	public String getString(String str) {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print(str);  //notice it's NOT a print line.  This way input is next to question.
		return inKey.nextLine();
		
	}
	
	
	public static void main(String[] args) {
		PhoneList app = new PhoneList();
		app.menu();
	}
}