import java.util.*;

public class ReversedArray {
        static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
                // making the array
                int[] arrayValues = arrayGen();

                // reversing the array
                reverseArray(arrayValues);

                //printing array values
                System.out.println("Reversed array:" + Arrays.toString(arrayValues));
        }

        public static void reverseArray(int[] arr) {
                int length = arr.length;
                for (int i = 0; i < length / 2; i++) {
                        int temp = arr[i];
                        arr[i] = arr[length - i - 1];
                        arr[length - i - 1] = temp;
                }
        }

        private static int[] arrayGen() {
                // Getting size of array
                System.out.println("Give me a number(This will be the size of the array): ");
                int arrayLength = scan.nextInt();
                
                // Generating array
                int[] arrayValues = new int[arrayLength];
                
                System.out.println("Now give the values stored in the array: ");
                // Storing array values
                for (int i = 0; i < arrayLength; i++) {
                        int value = scan.nextInt();
                        arrayValues[i] = value;
                }

                // printing and returning array
                System.out.println("Initial array:" + Arrays.toString(arrayValues));
                return arrayValues;
        }
}