/* Evan Carter
 * CS-320-R4840 24EW4
 * ContactService
 */

package contactService;

import java.util.ArrayList;

public class ContactService {

	// Create a list to hold the contact data
	ArrayList<Contact> contactList = new ArrayList<Contact>(); 
	
	public ContactService(){
	
	}
	
	// Add a contact to the list
	public void addContact(Contact toAdd) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(toAdd.getContactID())) {
				throw new IllegalArgumentException("Duplicate ID");
			}
			
		}
		contactList.add(toAdd);
	}
	
	// Delete a contact based on ID value
	public void deleteContact(int toDelete) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(String.valueOf(toDelete))) {
				contactList.remove(i);
			}
		}
	}
	
	public void updateFirstName(int toUpdate, String newValue) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(String.valueOf(toUpdate))) {
				contactList.get(i).setFirstName(newValue);
			}
		}
	}
	
	public void updateLastName(int toUpdate, String newValue) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(String.valueOf(toUpdate))) {
				contactList.get(i).setLastName(newValue);
			}
		}
	}
	
	public void updatePhone(int toUpdate, String newValue) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(String.valueOf(toUpdate))) {
				contactList.get(i).setPhone(newValue);
			}
		}
	}
	
	public void updateAddress(int toUpdate, String newValue) {
		for (int i = 0; i < contactList.size(); i++) {
			if (contactList.get(i).getContactID().equals(String.valueOf(toUpdate))) {
				contactList.get(i).setAddress(newValue);
			}
		}
	}
}
