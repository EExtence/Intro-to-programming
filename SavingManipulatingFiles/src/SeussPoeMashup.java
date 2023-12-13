// IMPORT THE java.io.* CLASS
// IMPORT THE java.util.Scanner CLASS
import java.io.*; 
import java.util.Scanner;


public class SeussPoeMashup {
	
	// DECLARE A PRIVATE STATIC SCANNER OBJECT NAMED greenEggsFileScan
	private static Scanner greenEggsFileScan;
	// DECLARE A PRIVATE STATIC SCANNER OBJECT NAMED ravenFileScan
	private static Scanner ravenFileScan;
	// DECLARE A PRIVATE STATIC PRINTWRITER OBJECT NAMED outputFile
	private static PrintWriter outputFile ;
	
	public static void main(String[] args) {
		
		// CREATE STRING VARIABLES FOR THE PATHS TO THE GreenEggsAndHam.txt, Raven.txt, 
		// AND TheRavensGreenEggs.txt THAT YOU HAVE DOWNLOADED FROM THE FILES TAB IN CANVAS
		// CALL THESE VARIABLES: greenEggsFilePath,  ravenFilePath, AND outputFilePath RESPECTIVELY
		// ASSIGN THE VARIABLES THE FILE PATHS OF THE LOCATIONS OF THE FILES ON YOU COMPUTER 
		// (INCLUDING THE FILE NAME AND FILE EXTENTION). DON'T FORGET TO USE ESCAPE CHARACTERS 
		// FOR THE BACKSLASHES:
		// FOR EXAMPLE: "C:\\Users\\user\\Desktop\\GreenEggsAndHam.txt"
		String greenEggsFilePath = "/Users/eleanorextence/Desktop/School/Fall2023/Intro-to-programming/SavingManipulatingFiles/files/GreenEggsAndHam.txt";
		String ravenFilePath = "/Users/eleanorextence/Desktop/School/Fall2023/Intro-to-programming/SavingManipulatingFiles/files/Raven.txt";
		String outputFilePath = "/Users/eleanorextence/Desktop/School/Fall2023/Intro-to-programming/SavingManipulatingFiles/files/outputTxtFile.txt";


		// SUROUND THE FOLLOWING WITH A TRY CATCH AND CLASS THE closeFiles() METHOD, AS WELL
		// AS PROMPT THE USER THAT SOMETHING HAS GONE WRONG. USE THE EXECEPTION OBJECT TO 
		// HELP DISPLAY THE MESSAGE:
		try {	
			// CREATE A NEW FILE OBJECT NAMED greenEggsFile AND PASS 
			// greenEggsFilePath TO ITS CONSTRUCTOR
			File greenEggsFile = new File(greenEggsFilePath);			

			// CREATE A NEW FILE OBJECT NAMED ravenFile AND PASS 
			// ravenFilePath TO ITS CONSTRUCTOR
			File ravenFile = new File(ravenFilePath);
			
			// INSTANTIATE greenEggsFileScan PASSING greenEggsFile TO ITS CONSTRUCTOR
			greenEggsFileScan = new Scanner(greenEggsFile);			
			// INSTANTIATE ravenFileScan PASSING ravenFile TO ITS CONSTRUCTOR
			ravenFileScan = new Scanner(ravenFile);	
			// INSTANTIATE outputFile PASSING outputFilePath TO ITS CONSTRUCTOR
			outputFile = new PrintWriter(outputFilePath);
								
			// Prompt the user that the files are being read
			System.out.println("Reading files");
			
			
			// CREATE A WHILE LOOP THAT CHECKS IF BOTH greenEggsFileScan AND
			// ravenFileScan HAVE A NEXTLINE (HINT: USE THE hasNextLine() method 
			// OF THE SCANNER CLASS)
			// WHILE BOTH SCANNER OBJECT HAVE A NEXT LINE:
			// 1) CREATE A STRING VARIABLE (greenEggsLine) FOR THE greenEggsFileScan 
			// SCANNER OBJECT, THAT STORES THE NEXT LINE OF THE SCANNER OBJECT
			// 2) CREATE A STRING VARIABLE (ravenLine) FOR THE ravenFileScan SCANNER 
			// OBJECT, THAT STORES THE NEXT LINE OF THE SCANNER OBJECT
			// 4) PRINT THE greenEggsLine VARIABLE TO THE outputFile OBJECT
			// 5) PRINT THE ravenLine VARIABLE TO THE outputFile OBJECT

			while (greenEggsFileScan.hasNextLine() && ravenFileScan.hasNextLine() ) {
					
				String greenEggsLine = greenEggsFileScan.nextLine();
				String ravenLine = ravenFileScan.nextLine();
				outputFile.println(greenEggsLine);
				outputFile.println(ravenLine);
					
			}
					
			closeFiles();	
			System.out.println("The Raven's Green Eggs has been written");
		
		// CLOSE THE TRY CATCH STATEMENT			
		} catch(IOException exception) {
			System.out.println("IOException thrown: " + exception.getMessage());
		}
	
	}
	
	private static void closeFiles() {
	
		// CLOSE THE greenEggsFileScan (HINT: USE THE CLOSE METHOD FROM THE SCANNER CLASS)
		greenEggsFileScan.close();	
		// CLOSE THE ravenFileScan (HINT: USE THE CLOSE METHOD FROM THE SCANNER CLASS)
		ravenFileScan.close();
		// CLOSE THE outputFile (HINT: USE THE CLOSE METHOD FROM THE PRINTWRITER CLASS)
		outputFile.close();
	}
}
