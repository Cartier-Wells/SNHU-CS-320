/* Evan Carter
 * CS-320-R4840 24EW4
 * Contact
 */

package contactService;

public class Contact {
	
	// Encapsulated working values
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;

	// Constructor & data formatting
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		if (validID(contactID)) {
			this.contactID = contactID;
		}
		if (validFirstName(firstName)) {
			this.firstName = firstName;
		}
		if (validLastName(lastName)) {
			this.lastName = lastName;
		}
		if (validPhone(phone)) {
			this.phone = phone;
		}
		if (validAddress(address)) {
			this.address = address;
		}
		
	}
	
	public boolean validID(String toCheck) {
		if(toCheck == null || toCheck.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		return true;
	}
	
	public boolean validFirstName(String toCheck) {
		if(toCheck == null || toCheck.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		return true;
	}
	
	public boolean validLastName(String toCheck) {
		if(toCheck == null || toCheck.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		return true;
	}
	
	public boolean validPhone(String toCheck) {
		if(toCheck == null || !toCheck.matches("\\d{10}") ) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		return true;
	}
	
	public boolean validAddress(String toCheck) {
		if(toCheck == null || toCheck.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		return true;
	}
	
	// Accessors & Mutators
	public String getContactID() {
		return contactID;
	}
	
	public String getFirstName() {
	return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = String.format("%1.10s", firstName);
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = String.format("%1.10s", lastName);
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = String.format("%10s", phone);
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = String.format("%1.30s", address);
	}
	
	// Output relevant info to the console
	public void displayInfo() {
		System.out.println(String.format("%s: %s", "ID", contactID));
		System.out.println(String.format("%s: %s, %s", "Name", lastName, firstName));
		System.out.println(String.format("%s: %s", "Phone Number", phone));
		System.out.println(String.format("%s: %s", "Home Address", address));
	}

}
