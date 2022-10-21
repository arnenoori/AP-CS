public class Person{
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getLastFirst(){
		return this.lastName + ", " + this.firstName;
	}

	public String toString(){
		return this.firstName + " " + this.lastName;
	}
}