package binarySearch;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
	
	final int[] ARRAY = {1, 2, 5, 6, 7, 8, 10, 11, 12, 13};
	int start = 0;
	int end;
	int middle;
	int target;

//	Getting target value to search for
	Scanner myObj = new Scanner(System.in);
	System.out.println("Enter integer between 1 and 13: ");
	target = myObj.nextInt();
	myObj.close();
	
	end = ARRAY.length - 1;
	
//  the algorithm >:3
	while (true) {
		middle = (start + end) / 2;
		
		if(target == ARRAY[middle]) {
			System.out.println("The target of " + target + " was found at the index " + middle);
			break;
		}else if(target < ARRAY[middle]) {
			end = middle;
		}else if(target > ARRAY[middle]) {
			start = middle;
		}
		
		if((middle + 1) == end || middle == 0){
			System.out.println("Target not found in array");
			break;
		}
	}
	
//end
	}
}
