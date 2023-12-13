import java.util.*;

public class ReverseArray {
        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                // Step 1: Prompt the user to enter the number of values
                System.out.print("Enter the number of values: ");
                int n = scanner.nextInt();

                // Step 2: Create an array
                int[] arrayValues = new int[n];

                // Step 3: Create a Stack
                Stack<Integer> stackValues = new Stack<>();

                // Step 4: Create a Queue
                Queue<Integer> queueValues = new LinkedList<>();

                // Step 5: Prompt the user to enter values
                System.out.println("Enter values:");

                // Step 6: Store entered values in each collection
                for (int i = 0; i < n; i++) {
                        int value = scanner.nextInt();
                        arrayValues[i] = value;
                        stackValues.push(value);
                        queueValues.offer(value);
                }

                // Step 7: Display each collection in forward order
                System.out.println("\nThe values in the Array collection are now: " + Arrays.toString(arrayValues));
                System.out.println("The values in the Stack collection are now: " + stackValues);
                System.out.println("The values in the Queue collection are now: " + queueValues);

                // Step 8: Reverse the values in each collection
                reverseArray(arrayValues);
                Stack<Integer> tempStack = reverseStack(stackValues);
                reverseQueue(queueValues);

                // Step 9: Display each of the reversed collections
                System.out.println("\nReversed Array values: " + Arrays.toString(arrayValues));
                System.out.println("Reversed Stack values: " + tempStack);
                System.out.println("Reversed Queue values: " + queueValues);

                scanner.close();

        }

        // Reverse Array
        private static void reverseArray(int[] arr) {
                int length = arr.length;
                for (int i = 0; i < length / 2; i++) {
                        int temp = arr[i];
                        arr[i] = arr[length - i - 1];
                        arr[length - i - 1] = temp;
                }
        }

        // Reverse Stack
        private static Stack<Integer> reverseStack(Stack<Integer> stack) {
                Stack<Integer> tempStack = new Stack<>();
                while (!stack.isEmpty()) {
                        tempStack.push(stack.pop());
                }
                return tempStack;
        }

        // Reverse Queue
        private static void reverseQueue(Queue<Integer> queue) {
                Stack<Integer> tempStack = new Stack<>();
                while (!queue.isEmpty()) {
                        tempStack.push(queue.poll());
                }
                while (!tempStack.isEmpty()) {
                        queue.offer(tempStack.pop());
                }
        }
}
