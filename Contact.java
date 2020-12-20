package Mobile;

public class Contact {
	private String id;
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	
	public void CreateContact(String id, String firstName, String lastName, String number, String address) {
		//check for length and null
			if(id == null || id.length()>10) {
				throw new IllegalArgumentException("Invalid id");
			}
			this.id = id;
			
			UpdatefirstName(firstName);
			UpdatelastName(lastName);
			UpdateNumber(number);
			UpdateAddress(address);
		}
	public void UpdatefirstName(String firstName) {
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		this.firstName = firstName;
	}
	
	public void UpdatelastName(String lastName) {
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = lastName;
	}

	public void UpdateNumber(String number) {
		if(number == null || number.length()>10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		this.number = number;
	}
	
	public void UpdateAddress(String address) {
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = address;
	}
	
	public String GetID() {
		return this.id;
	}
	
	public String GetfirstName() {
		return this.firstName;
	}
	public String GetlastName() {
		return this.lastName;
	}
	public String GetNumber() {
		return this.number;
	}
	public String GetAddress() {
		return this.address;
	}
}