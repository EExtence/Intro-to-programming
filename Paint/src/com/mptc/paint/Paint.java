package com.mptc.paint;

import java.util.Scanner;

public class Paint {
//**********************************************************
//  Paint.java Determine how much paint is needed to paint the walls 
//  of a room given its length, width, and height
//**********************************************************
public static void main(String[] args) {
	final int COVERAGE = 350;  //paint covers 350 sq ft/gal
	final int DOOR_AREA = 20;  
	// DECLARE A CONSTANT INTEGER NAMED WINDOW_AREA AND SET IT EQUAL TO 15
    final int WINDOW_AREA = 15;
	Scanner scan = new Scanner(System.in);

	// DECLARE INTEGER VARIABLES WITH THE FOLLOWING NAMES:
    	// length, width, height, numDoors, AND numWindows;
        int length;
        int width;
        int height; 
        int numDoors;
        int numWindows;
	// DECLARE DOUBLE VARIABLES WITH THE FOLLOWING NAMES:
    	// totalSqFt AND paintNeeded;
        double totalSqFt;
        double paintNeeded;
    // PROMPT THE USER TO "Enter the length of the room: " BY WRITING
	// TO THE CONSOLE
    System.out.print("Enter the length of the room: ");
    length = scan.nextInt();
	// READ THE USER'S INTEGER INPUT INTO THE length VARIABLE USING THE
	// scan.nextInt() METHOD CALL

    	//Prompt for and read in the width of the room
	System.out.print ("Enter the width of the room: ");
	width = scan.nextInt();

    	//Prompt for and read in the height of the room
	System.out.print ("Enter the height of the room: ");
	height = scan.nextInt();

	// Prompt for and read in the number of doors and windows
	System.out.print ("How many doors are in the room? ");
	numDoors = scan.nextInt();

	System.out.print ("How many windows are in the room? ");
	numWindows = scan.nextInt();

	scan.close();
    	//Compute the total square feet to be painted--think
    	//about the dimensions of each wall
	totalSqFt = (2*(length * width) + 2*(length * height) + 2*(width * height));

	// Subtract off the area of the windows and doors
	totalSqFt = totalSqFt - ((numDoors * DOOR_AREA) + (numWindows * WINDOW_AREA));
 
    	//Compute the amount of paint needed
	paintNeeded = totalSqFt / COVERAGE;

    	//Print the length, width, and height of the room and the
    	//number of gallons of paint needed.
	System.out.println();
	System.out.println (paintNeeded + " gallons of paint are needed to "
			    + "paint a room " + width + " feet wide by ");
	System.out.println(length + " feet long by " + height + " feet high with "
		   + numDoors + " doors and " + numWindows + " windows.");
}
}

