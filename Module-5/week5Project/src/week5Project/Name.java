package week5Project;

public class Name {	
	public Name(String first, String middle, String last) {
		firstName = first;
		middleName = middle;
		lastName = last;
	}
	String firstName;
	String middleName;
	String lastName;
	public String getFirst() {
		return firstName;
	}
	
	public String getMiddle() {
		return middleName;
	}
	
	public String getLast() {
		return lastName;
	}
	
	public String firstMiddleLast() {
		String nameInAscendingOrder = firstName + " " +middleName + " " + lastName;
		return nameInAscendingOrder;
	}
	
	public String lastFirstMiddle() {
		String nameIn312Order = lastName + ", " + firstName + ", " + middleName;
		return nameIn312Order;
	}
	
	public String initials() {
		String initials = firstName.substring(0, 1) + middleName.substring(0, 1) + lastName.substring(0, 1);
		initials = initials.toUpperCase();
		return initials;
	}
	
	public int length() {
		String nameInAscendingOrder = firstName + middleName + lastName;
		int lengthOfName = nameInAscendingOrder.length();
		return lengthOfName;
	}
	
}
