package backwards;

import java.util.Scanner;

public class Backwards {
	public static int indexCounter = 0;
	public static char[] newMessage = new char[900];
	
	static void printBackwards(String message) {
		newMessage[indexCounter] = message.charAt((message.length() -1) - indexCounter);
		indexCounter ++;
		 
		if(indexCounter != message.length()) {
			printBackwards(message);
		} else {
			System.out.println(newMessage);
			return;
		}
	//end of printBackwards method
	}
		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give string now >:3 -:");
		String userMessage = scan.nextLine();
		scan.close();
		
		
		printBackwards(userMessage);
		
		
		
	//End of main method
	}
		
}
	

