package stringManipulation;

import java.util.Scanner;

public class StringManips
{
    public static void main (String[] args)
    {
	String phrase = new String ("This is a String test.");
	int phraseLength;   // number of characters in the phrase String
	int middleIndex;    // index of the middle character in the String
	String firstHalf;   // first half of the phrase String
	String secondHalf;  // second half of the phrase String
	String switchedPhrase; // a new phrase with original halves switched
	// DECLARE A STRING VARIABLE NAMED middle3
	String middle3;
	// DECLARE A STRING VARLIABLE NAMED city
	String city;
	// DECLARE A STRING VARLIABLE NAMED state
	String state;

    Scanner scan = new Scanner (System.in);

	// compute the length and middle index of the phrase
	phraseLength = phrase.length();
	middleIndex = phraseLength / 2;

	// get the substring for each half of the phrase
	firstHalf = phrase.substring(0,middleIndex);
	secondHalf = phrase.substring(middleIndex, phraseLength);

	// get middle 3 characters
	// ASSIGN middle3 THE MIDDLE 3 CHARACTER OF THE PHRASE USING THE SUBSTRING
	// METHOD (HINT SUBSTRING IS A METHOD OF THE phrase OBJECT
	middle3 = phrase.substring(middleIndex -1, middleIndex +2);

	// concatenate the firstHalf at the end of the secondHalf
	switchedPhrase = secondHalf.concat(firstHalf);
	// REPLACE ALL BLANK CHARACTERS IN switchedPhrase WITH AN *, STORE THE 
	// RESULTS BACK IN switchedPhrase
	switchedPhrase = switchedPhrase.replace(" ", "*");
	
	System.out.println(switchedPhrase);

	// print information about the phrase
	System.out.println();
	System.out.println ("Original phrase: " + phrase);
	System.out.println ("Length of the phrase: " + phraseLength +
			    " characters");
	System.out.println ("Index of the middle: " + middleIndex);
	System.out.println ("Character at the middle index: " + 
			    phrase.charAt(middleIndex));
	// PRINT “Middle 3 characters: ” + middle3 TO CONSOLE
	System.out.println("Middle 3 characters: " + middle3);
	System.out.println ("Switched phrase: " + switchedPhrase);


	// prompt for and read in the hometown city and state
	System.out.print ("Enter your hometown city: ");
	city = scan.nextLine();
	System.out.print ("Enter your hometown state: ");
	state = scan.nextLine();

	// CONVERT city TO LOWERCASE
	city = city.toLowerCase();
	// CONVERT state TO UPPERCASE
	state = state.toUpperCase();
	// PRINT state + city + state TO THE CONSOLE
	// OR PRINT state.concat(city.concat(state))
	System.out.println(state + city + state);
	System.out.println();
    }
}

