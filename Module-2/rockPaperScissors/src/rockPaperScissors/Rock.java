package rockPaperScissors;

import java.util.Scanner;
import java.util.Random;

public class Rock
{
    public static void main(String[] args){

    final String RANS = "R";
    final String SANS = "S";
    final String PANS = "P";
    	
	String personPlay;    //User's play -- "R", "P", or "S"
	String computerPlay;  //Computer's play -- "R", "P", or "S"
	int computerInt;      //Randomly generated number used to determine computer's play

	Random generator = new Random();
	Scanner scan = new Scanner (System.in);

	//Get player's play -- note that this is stored as a string
	System.out.print ("Enter your play: R, P, or S: ");
	personPlay = scan.nextLine();
	scan.close();
	//Make player's play uppercase for ease of comparison
	personPlay = personPlay.toUpperCase();

	//Generate computer's play (0,1,2)
	computerInt = generator.nextInt(3);

//Translate computer's randomly generated play to string
//"R", "P", or "S".  If play is not a value you expected (0,1,2), 
//set it to "I" and print a warning message.

// WRITE A SWITCH STATEMENT THAT USES THE RANDOM INTEGER
// GENERATED IN computerInt TO ASIGN computerPlay THE LETTERS “R”, “P”,
// “S”
// MAKE THE DEFAULT OF THE SWITCH STATEMENT ASIGN computerPlay THE LETTER “I”
// AND PRINT AN UNEXPEXTED RANDOM NUMBER MESSAGE TO THE CONSOLE

	switch(computerInt) {
	case 0:
		computerPlay = RANS;
		break;
	case 1:
		computerPlay = PANS;
		break;
	case 2:
		computerPlay = SANS;
		break;
	default:
		computerPlay = "I";
		System.out.println("Value was unexpected");
	}

	//Print computer's play
	System.out.println("Computer play is " + computerPlay);
	
// USING AN ELSE IF CLAUSE, PRINT AN "Illegal person play" MESSAGE TO CONSOLE IF 
// personPlay IS NOT A “P”, “R”, OR “S” 
// ELSE IF computerPlay IS AN “I” PRINT AN "Illegal computer play" MESSAGE TO CONSOLE
// OTHERWISE, DECIDE WHO WON (HINT USE NESTED IFS), REMEMBER:
// ROCK BEATS SCISSOR
// SCISSOR BEATS PAPER
// PAPER BEATS ROCK

    if(personPlay.equals(computerPlay)) {
    	System.out.println("Tie!!");
    }
    //Player win conditions 
    else if(personPlay.equals(RANS) && computerPlay.equals(SANS)){
    	System.out.println("Player wins!");
    }else if(personPlay.equals(SANS) && computerPlay.equals(PANS)){
    	System.out.println("Player wins!");	
    }else if(personPlay.equals(PANS) && computerPlay.equals(RANS)){
    	System.out.println("Player wins!");
    }
    //computer win conditions
    else if(computerPlay.equals(RANS) && personPlay.equals(SANS)){
    	System.out.println("Computer wins!");
    }else if(computerPlay.equals(SANS) && personPlay.equals(PANS)){
    	System.out.println("Computer wins!");	
    }else if(computerPlay.equals(PANS) && personPlay.equals(RANS)){
    	System.out.println("Computer wins!");
    }
    else {
    	System.out.println("Illegal person play");
    }
    
//end    
    }    
}

