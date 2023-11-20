package pedometer_calculator;
//A program that takes from the user, the number of steps walked in a day, as well as the days date, and prints to the terminal a message stating how many miles the user has walked as well as
//the amount of calories burned from walking on that particular day.

//Getting access to scanner class
import java.util.Scanner;

     
class Main {
    
    public static void main(String[] args) {
    	
    	//Using scanner class to get user input
        Scanner user_input = new Scanner(System.in);
        
        //Getting the date from da user >:3
        System.out.print("Input the current date: ");
        String final_date = user_input.nextLine();

        //Getting the amount of steps ran by user
        System.out.print("Input the steps ran today(Please don't use spaces or commas): ");
        double steps = user_input.nextDouble();
    	
    	//Declaring Constant variables :3 
        final int STEPS_PER_MILE = 2000;
        final int CALS_LOST_PER_MILE = 65;
        
        //Convert steps into miles and then change its type from double to int
        double daysmiles = steps / STEPS_PER_MILE;
        int final_miles = (int)daysmiles;

        //get how many calories lost and then change its type from double to int
        double days_calories = daysmiles * CALS_LOST_PER_MILE;
        int final_calories = (int)days_calories;
        
        //Closing scanner object
        user_input.close();


        //Formating and printing final message to the terminal.
        String final_message = String.format("On %s, you walked %d miles, and burned %d calories! Good Job!! :D", final_date, final_miles, final_calories);
        System.out.println(final_message); 
        }
    }
