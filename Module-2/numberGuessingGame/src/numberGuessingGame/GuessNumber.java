package numberGuessingGame;

//imports
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// Variables and objects
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();

		boolean gameContinue = true;
		
		int difficulty;
		int difficultyRange = 0;
		
		String userInput;
		int userGuess;
		int number = 0;

		System.out.println("Welcome to the number guessing game!");
		while (gameContinue) {
			System.out.println("Please Select a difficulty(1,2,3,4): ");
			difficulty = scan.nextInt();
			switch (difficulty) {
			case 1:
				difficultyRange = 5;
				break;
			case 2:
				difficultyRange = 20;
				break;
			case 3:
				difficultyRange = 50;
				break;
			case 4:
				difficultyRange = 100;
				break;
			}
			//getting the random number based off of the difficulty ~w~ I am so sick hehe
			number = generator.nextInt(difficultyRange + 1);
			System.out.println(number); //DEBUGGING
				
			while(true) {
				//Guessing module. Getting user guess and checking it against number
				System.out.printf("Guess a number between 0 and %s: ", difficultyRange);
				userGuess = scan.nextInt();
				if (userGuess == number) {
					System.out.println("You guessed correctly!!");
					System.out.println("Type Q to quit the game or D to select a new number and play again: ");
					userInput = scan.next();
					if (userInput.equals("q")) {
						gameContinue = false;
						break;
					} else if(userInput.equalsIgnoreCase("d")) {
						break;
					}
				} else {
					System.out.println("You guessed incorrectly... ");
					System.out.println("To guess again, press G. To select a new number, press D. To quit the game, type Q.");
					userInput = scan.next();
					
					if (userInput.equalsIgnoreCase("q")) {
						gameContinue = false;
						break;
					} else if(userInput.equalsIgnoreCase("d")) {
						break;
					} else {
						//Nothing here cus we just looping money style
					}
				}
				
			}
			

			

		}//while end bracket 
	}
}
