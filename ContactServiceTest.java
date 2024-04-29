package contactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	// Adding a Contact with duplicate ID throws error
	@Test
	void testContactServiceClassAddContactFailsIDNotUnique() {
		ContactService testContactService = new ContactService();
		Contact testContact1 = new Contact("1", "Evan", "Carter", "5556667777", "Cape Kobayashi Maru");
		Contact testContact2 = new Contact("1", "John", "Fortnight", "4445556666", "Limsa Lominsa, Eorzea");
		testContactService.addContact(testContact1);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {testContactService.addContact(testContact2); });
	}
	
	// Deleting a Contact via ID
	@Test
	void testContactServiceClassDeleteContactSuccess() {
		ContactService testContactService = new ContactService();
		Contact testContact1 = new Contact("1", "Evan", "Carter", "5556667777", "Cape Kobayashi Maru");
		Contact testContact2 = new Contact("2", "John", "Fortnight", "4445556666", "Limsa Lominsa, Eorzea");
		testContactService.addContact(testContact1);
		testContactService.addContact(testContact2);
		testContactService.deleteContact(2);
		
		for (int i = 0; i < testContactService.contactList.size(); i++) {
			if (testContactService.contactList.get(i).getContactID().equals(String.valueOf(2))) {
				fail("Delete did not work");
			}
		}
	}
	
	// Updating Contact values via ID
	@Test
	void testContactServiceClassUpdateContactFirstNameSuccess() {
		ContactService testContactService = new ContactService();
		Contact testContact1 = new Contact("1", "Evan", "Carter", "5556667777", "Cape Kobayashi Maru");
		testContactService.addContact(testContact1);
		
		testContactService.contactList.get(0).setFirstName("John");
		if (!testContactService.contactList.get(0).getFirstName().equals("John")){
			fail("Update first name failed");
		}}
		
	@Test
	void testContactServiceClassUpdateContactLastNameSuccess() {
		ContactService testContactService = new ContactService();
		Contact testContact1 = new Contact("1", "Evan", "Carter", "5556667777", "Cape Kobayashi Maru");
		testContactService.addContact(testContact1);
		
		testContactService.contactList.get(0).setLastName("Fortnight");
		if (!testContactService.contactList.get(0).getLastName().equals("Fortnight")){
			fail("Update last name failed");
	}}
	
	@Test
	void testContactServiceClassUpdateContactPhoneSuccess() {
		ContactService testContactService = new ContactService();
		Contact testContact1 = new Contact("1", "Evan", "Carter", "5556667777", "Cape Kobayashi Maru");
		testContactService.addContact(testContact1);
		
		testContactService.contactList.get(0).setPhone("4445556666");
		if (!testContactService.contactList.get(0).getPhone().equals("4445556666")){
			fail("Update phone failed");
	}}
	
	@Test
	void testContactServiceClassUpdateContactAddressSuccess() {
		ContactService testContactService = new ContactService();
		Contact testContact1 = new Contact("1", "Evan", "Carter", "5556667777", "Cape Kobayashi Maru");
		testContactService.addContact(testContact1);
		
		testContactService.contactList.get(0).setAddress("Limsa Lominsa, Eorzea");
		if (!testContactService.contactList.get(0).getAddress().equals("Limsa Lominsa, Eorzea")){
			fail("Update address failed");
	}}
}
