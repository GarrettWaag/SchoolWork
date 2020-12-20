package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Mobile.Contact;
import Mobile.ContactService;

class ContactServiceTest {
ContactService service = new ContactService();
	@Test
	void CreateContact() {
		service.AddContact("1234", "firstName", "lastName", "number", "address");
		
	Assertions.assertThrows(IllegalArgumentException.class,  () -> {
		service.AddContact("1234", "firstName", "lastName", "number", "address");
	});
	
		assertTrue(service.GetContacts().size() == 1);
		
		service.AddContact("12346", "firstName", "lastName", "number", "address");
		
		assertTrue(service.GetContacts().size() == 2);
	}
	@Test
	void RemoveContact() {
		service.AddContact("1234", "firstName", "lastName", "number", "address");
		service.RemoveContact("1234");
		assertTrue(service.GetContacts().size() == 0);
	}
	
	@Test
	void UpdateContacts() {
		service.AddContact("1234", "firstName", "lastName", "number", "address");
		service.AddContact("12345", "firstName", "lastName", "number", "address");
		service.UpdateContact("1234", "Garrett", "Waag", "number", "address");
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
		service.UpdateContact("12345", null, "lastName", "number", "address");
		});
	}
	@Test
	void ReadingFromService() {
		service.AddContact("1234", "Garrett", "lastName", "number", "address");
		service.AddContact("12345", "First", "lastName", "number", "address");
		//not sure if declaring here was needed but couldn't work otherwise
		Contact contact = (Contact) service.GetContacts().get(0);
		assertTrue(contact.GetfirstName().equals("Garrett"));
		contact = (Contact) service.GetContacts().get(1);
		assertTrue(contact.GetfirstName().equals("First"));
	}
}
