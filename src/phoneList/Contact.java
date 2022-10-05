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
 *   - Setter methods not necessary unless Constructor
 *        initialize variables.
 *   - Override toString() so that Contact can
 *        be printed as part of a list.
 * 
 */



public class Contact {
	private String Name;
	private long Number;
	
	public Contact (String Name, long Number) {
		this.Name = Name;
		this.Number = Number;
	}
	public String getName() {
	
		return Name;//gets name
	}
	public long getNumber() {
		return Number;//gets the name
		
	}
	public void setName(String Name) {
		this.Name = Name;//sets the name
	}
	public void setNumber(long Number) {
		this.Number = Number;//sets the number
	}
	@Override
	public String toString() {//makes it easier to print by name
		return Name + "   " + Number;
	}
	
}



