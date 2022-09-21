package phoneList;

import java.util.ArrayList;

import java.util.Scanner;

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
	
	ArrayList<Contact> list ;

	/*
	 * Instance Variables
	 */
	
	
	
	//Constructor
	public PhoneList() {
		//initialize instance variables
		list = new ArrayList<Contact>();
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
		
		Contact contact = new Contact();
	//	System.out.println();
		contact.setName(getString("Enter a Name to add a contact."));
		contact.setNumber(getNumber("Enter a Number to add a contact."));
		list.add(contact);
	}
	
	
	
	private long getNumber(String string) {
		Scanner inKey = new Scanner(System.in);
		System.out.print(string);  //notice it's NOT a print line.  This way input is next to question.
		return inKey.nextLong();
	
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
		
		String name = getString("Enter a Contact Name to be removed");
		int i = 0;
		
		for (i = 0; i < list.size(); i++) {
				
				if(name.equals(list.get(i).getName())) {
					list.remove(i);
					break;
				}
				
		}
		if(i==0) {
			System.out.println(" Ya name isn't available loser");
			
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
	public void printList() {
		list.sort(null);
		System.out.println(" Name              Number          ");
		System.out.println(" ----------------- ----------------");
		Contact cnt;
		
		for (int i = 0; i < list.size(); i++) {
			
			
			cnt = list.get(i);
			cnt.toString();
			
		}
		
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
				System.out.println("\nBye Homie!");
				break;
			default:
				System.out.println("\nThat's not a valid input.\n"
								 + "pls try again lol.");
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