package exersicesLP3;

public class Main {
	public static int indexCounter = 0;
	public static char[] newMessage = new char[5];
	
	//Exercise 7.1
	static float average(int numOne, int numTwo) {		
		float sumOfInputs = numOne + numTwo;
		float numberAverage = sumOfInputs / 2;
		
		return numberAverage;
	}
	
	//Exercise 12.7
	static void reversedString(String message) {
		newMessage[indexCounter] = message.charAt((message.length() -1) - indexCounter);
		indexCounter ++;
		 
		if(indexCounter != message.length()) {
			reversedString(message);
		} else {
			System.out.println(newMessage);
			return;
		}
	}


	//main method :3
	public static void main(String[] args) {
		reversedString("Howdy");
		System.out.println(average(0, 7));
	}
}
