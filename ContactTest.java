package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Mobile.Contact;

class ContactTest {
	Contact contact = new Contact();
	@Test
	void CreateContactTest() {

		contact.CreateContact("12", "test", "Name", "number", "address");
		assertTrue(contact.GetID().equals("12"));
		assertTrue(contact.GetfirstName().equals("test"));
		assertTrue(contact.GetlastName().equals("Name"));
		assertTrue(contact.GetNumber().equals("number"));
		assertTrue(contact.GetAddress().equals("address"));
	}
	
	@Test
	void NullIDTest() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.CreateContact(null, "firstName", "lastName", "number", "address");
		}); 
	}

	@Test
	void IdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.CreateContact("12345678910", "firstName", "lastName", "number", "address");
		}); 
	}
	@Test
	void FirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.UpdatefirstName("12345678910");
		}); 
	}
	@Test
	void FirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.UpdatefirstName(null);
		}); 
	}
	@Test
	void LastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.UpdatelastName("12345678910");
		}); 
	}
	@Test
	void LastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.UpdatelastName(null);
		}); 
	}
	@Test
	void numberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.UpdateNumber("12345678910");
		}); 
	}
	@Test
	void NumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.UpdateNumber(null);
		}); 
	}
	@Test
	void AddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.UpdateAddress("Address's can be really long so this is huge");
		}); 
	}
	@Test
	void AddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.UpdateAddress(null);
		}); 
	}
}
