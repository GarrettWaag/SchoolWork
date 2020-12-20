package Mobile;

import java.util.List;
import java.util.ArrayList;


public class ContactService{
	//list for contacts
	List<Object> myContacts = new ArrayList<Object>();
	int i;
	//adds contacts
	public void AddContact(String id, String firstName, String lastName, String number, String address) {
		//checks if id is used
		for(i = 0; i < myContacts.size(); i++){
			Contact contact = (Contact) myContacts.get(i);
			if(contact.GetID() == id) {
				throw new IllegalArgumentException("Id in use");
			}
		}
		//adds contact
		Contact contact = new Contact();
		contact.CreateContact(id, firstName, lastName, number, address);
		myContacts.add(contact);
	}
	
	public void RemoveContact(String id) {
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid id");
		}
		//finds id to remove
		for(i = 0; i < myContacts.size(); i++){
			Contact contact = (Contact) myContacts.get(i);
			if(contact.GetID() == id) {
				myContacts.remove(i);
			}
		}
	}
	public void UpdateContact(String id, String firstName, String lastName, String number, String address) {
		//checks for id to change then updates
		for(i = 0; i < myContacts.size(); i++){
			Contact contact = (Contact) myContacts.get(i);
			if(contact.GetID() == id) {
				contact.UpdatefirstName(firstName);
				contact.UpdatelastName(lastName);
				contact.UpdateNumber(number);
				contact.UpdateAddress(address);
			}
		}
	}
	public List<Object> GetContacts() {
		return myContacts;
	}
}
