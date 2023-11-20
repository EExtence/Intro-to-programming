package loveCS;

import java.util.Scanner;

public class LoveCS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message = "I love computer science";
		int messageCounter;
		int sumTotal;
		
		//Ask user how many times the message is printed
		System.out.print("How many times would you like to print the message?: ");
		int printTimes = scan.nextInt();
		scan.close();
		
		//print out message
		for(messageCounter = 1; messageCounter <= printTimes; messageCounter ++) {
			System.out.printf("%s %d\n", message, messageCounter);
		}
	
		//Print out final message
		sumTotal = messageCounter + printTimes -1;
		System.out.printf("Printed the message %d times. The sum of the numbers between 1 and %d is %d.\n", printTimes, printTimes, sumTotal);
	
	//end
	}

}
