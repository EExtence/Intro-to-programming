package week5Project;
import java.util.Scanner;


public class TestNames {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give me a first name: ");
		String firstNameOne = scanner.nextLine();
		System.out.println("Give me a middle name: ");
		String middleNameOne = scanner.nextLine();
		System.out.println("Give me a last name: ");
		String lastNameOne = scanner.nextLine();
		Name nameOneObject = new Name(firstNameOne, middleNameOne, lastNameOne);
		
		System.out.println("Give me a first name: ");
		String firstNameTwo = scanner.nextLine();
		System.out.println("Give me a middle name: ");
		String middleNameTwo = scanner.nextLine();
		System.out.println("Give me a last name: ");
		String lastNameTwo = scanner.nextLine();
		Name nameTwoObject = new Name(firstNameTwo, middleNameTwo, lastNameTwo);
		
		
		System.out.println("NAME ONE STUFF");
		System.out.println(nameOneObject.firstMiddleLast());
		System.out.println(nameOneObject.lastFirstMiddle());
		System.out.println(nameOneObject.initials());
		System.out.println(nameOneObject.length());
		
		
		System.out.println("NAME TWO STUFF");
		System.out.println(nameTwoObject.firstMiddleLast());
		System.out.println(nameTwoObject.lastFirstMiddle());
		System.out.println(nameTwoObject.initials());
		System.out.println(nameTwoObject.length());
		
		scanner.close();
	}
	
}
