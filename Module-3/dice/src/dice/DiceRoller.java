package dice;
import java.util.Random;


public class DiceRoller {
	public static void main(String[] args) {
		
		Random dice = new Random();
		int die1 = dice.nextInt(1, 7);
		int die2 = dice.nextInt(1, 7);
		int sumOfRolls = die1 + die2;
		
		System.out.printf("Die no.1: %s\nDie no.2: %s\nSum of rolls: %s", die1, die2, sumOfRolls);
		
//	End of main method	
	}
	
}
