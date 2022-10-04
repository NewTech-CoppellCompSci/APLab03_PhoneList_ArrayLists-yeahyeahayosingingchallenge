package phoneList;

/*
 * This contains info for a single contact
 * 
 * Parameters Needed to Store
 *   - Contact's Name
 *   - Contact's Phone Number
 *   
 * Needed Methods
 *   - Constructor(s)
 *   - getter methods
 *   - Setter methods not necessary unless Constructor initialize variables.
 *   - Override toString() so that Contact can be printed as part of a list.
 * 
 */



public class Contact {
	
	 private String name;
	 private String number;//string because int can hold a limited number

	public Contact(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	public String getName() {//gets the name 
		return name;
		
	}

	
	public String getNumber() {//gets the number
		return number;
		
	}
	
	@Override
	public String toString() {//returns the stuff 
		return name + "= " + number;
	}

	
}