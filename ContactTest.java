package contactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	// Values remain as input
	@Test
	void testContactClassCreateContactSuccess() {
		Contact testContact = new Contact("5", "Evan", "Carter", "5556667777", "Cape Kobayahsi Maru");
		assertTrue(testContact.getContactID().equals("5"));
		assertTrue(testContact.getFirstName().equals("Evan"));
		assertTrue(testContact.getLastName().equals("Carter"));
		assertTrue(testContact.getPhone().equals("5556667777"));
		assertTrue(testContact.getAddress().equals("Cape Kobayahsi Maru"));
	}
	
	// Null handling
	@Test
	void testContactClassCreateContactFailsNullID() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact(null, "Evan", "Carter", "5556667777", "Cape Kobayahsi Maru");
	});}
		
	@Test
	void testContactClassCreateContactFailsNullFirstName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("5", null, "Carter", "5556667777", "Cape Kobayahsi Maru");
	});}
	
	@Test
	void testContactClassCreateContactFailsNullLastName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("5", "Evan", null, "5556667777", "Cape Kobayahsi Maru");
	});}
	
	@Test
	void testContactClassCreateContactFailsNullPhone() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("5", "Evan", "Carter", null, "Cape Kobayahsi Maru");
	});}
	
	@Test
	void testContactClassCreateContactFailsNullAddress() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("5", "Evan", "Carter", "5556667777", null);
	});}
		
	
	// Invalid Data Length Handling
	@Test 
	void testContactClassCreateContactFailsIDTooLong(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("12345678910", "Evan", "Carter", "5556667777", "Cape Kobayahsi Maru");
		});}
	
	@Test 
	void testContactClassCreateContactFailsFirstNameTooLong(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("5", "Evan NameTooLong", "Carter", "5556667777", "Cape Kobayahsi Maru");
		});}

	@Test 
	void testContactClassCreateContactFailsLastNameTooLong(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("5", "Evan", "NameTooLong Carter", "5556667777", "Cape Kobayahsi Maru");
		});}
		
	@Test 
	void testContactClassCreateContactFailsPhoneTooShort(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("5", "Evan", "Carter", "555", "Cape Kobayahsi Maru");
		});}
	
	@Test 
	void testContactClassCreateContactFailsPhoneTooLong(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("5", "Evan", "Carter", "55555555555", "Cape Kobayahsi Maru");
		});}
		
	@Test 
	void testContactClassCreateContactFailsAddressTooLong(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("5", "Evan", "Carter", "5556667777", "Azpilicuetagaraycosaroyarenberecolarrea, Azpilkueta, Navarra, Spain");
		});}
	}
	
