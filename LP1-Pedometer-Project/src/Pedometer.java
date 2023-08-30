//A program that takes from the user, the number of steps walked in a day, as well as the days date, and prints to the terminal a message stating how many miles the user has walked as well as
//the amount of calories burned from walking on that particular day.

//Getting access to scanner class
import java.util.Scanner;

//Using a class to store final return values in order to be able to get multiple values from one method :3
final class PedometerReturnValues {    
    String final_date;
    int final_miles;
    int final_calories;
}    
    
class Main {
    
    //creating method for calculations and storing final values
    public static PedometerReturnValues pedometerCalculator(String date, double steps) {
        //Declaring Constant variables :3 
        final int STEPS_PER_MILE = 2000;
        final int CALS_LOST_PER_MILE = 65;

        //Convert steps into miles and then change its type from double to int
        double days_miles = steps / STEPS_PER_MILE;
        int int_days_miles = (int)days_miles;

        //get how many calories lost and then change its type from double to int
        double days_calories = days_miles * CALS_LOST_PER_MILE;
        int int_days_calories = (int)days_calories;

        //create object from PedometerReturnValues class and store new values in said object
        PedometerReturnValues pedometer_return_vaules = new PedometerReturnValues();
        pedometer_return_vaules.final_miles = int_days_miles;
        pedometer_return_vaules.final_calories = int_days_calories;
        pedometer_return_vaules.final_date = date;

        //return pedometer_return_values object
        return pedometer_return_vaules;
    }
    
    public static void main(String[] args) {
        //Using scanner class to get user input
        Scanner user_input = new Scanner(System.in);
        
        //Getting the date from da user >:3
        System.out.print("Input the current date: ");
        String user_date = user_input.nextLine();

        //Getting the amount of steps ran by user
        System.out.print("Input the steps ran today(Please don't use spaces or commas): ");
        double daily_steps = user_input.nextDouble();
        
        //Closing scanner object
        user_input.close();
        
        //putting the return value of pedometerCalculator into a variable
        PedometerReturnValues final_values = pedometerCalculator(user_date, daily_steps);

        //Formating and printing final message to the terminal.
        String final_message = String.format("On %s, you walked %d, and burned %d calories! Good Job!! :D", final_values.final_date, final_values.final_miles, final_values.final_calories);
        System.out.println(final_message); 
        }
    }