/**
 * Created by bates.he.z on 1/23/2015.
 */
public class Person {
	private String lastName;
	private String firstName;
	private String street;
	private int zip;

	public Person(String lastName, String firstName, String street, int zip) {
		this.setLastName(lastName);
		this.setFirstName(firstName);
		this.setStreet(street);
		this.setZip(zip);
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
}
