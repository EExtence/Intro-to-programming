package palindromicSwag;

import java.util.Scanner;

public class Palindrome {
	// I wanted to make the method usable outside of itself but couldn't figure out how to get a return value from an if
	// else sequence so I'm just storing a boolean value for is or isn't palindromic. 
	public static Boolean isPalindromeReturnValue;
	public static void isPalindrome(String message, int indexCounter) {
		//Making  message all lowercase
		message = message.toLowerCase();
		
		//internal variables
		char originChar = message.charAt(indexCounter);
		char endChar = message.charAt(message.length() - indexCounter - 1);
		
		//checking if index counter == 1/2 of the length of message. If it gets to this point it means message is a palindrome
		if(indexCounter >= (message.length() / 2)) {
			System.out.println("Message is palindromic");
			isPalindromeReturnValue = true;
			return;
		} 
		//If the character its checking is the same as the character its checking against, it can continue.
		else if(originChar == endChar) {
			indexCounter ++;
			isPalindrome(message, indexCounter +1);
		} 
		//If both conditions above aren't true, then the word is not a palindrome.
		else {
			System.out.println("Not palindromic");
			isPalindromeReturnValue = false;
			return; 
		}
	//end of printBackwards method
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give a string: ");
		String userMessage = scan.nextLine(); 
		
		isPalindrome(userMessage, 0);
		System.out.println(isPalindromeReturnValue);
		
	//end of main method
	}

}
