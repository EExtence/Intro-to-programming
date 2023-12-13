import java.util.Arrays;

public class WierdExceptions {
        public static void main(String[] args) {
                HOWDY myobj1 = new HOWDY();
                System.out.println(myobj1.message);

                int[] array = {1, 2, 3, 4, 5};
                ReversedArray.reverseArray(array);
                System.out.println(Arrays.toString(array));
        }
};

class HOWDY {
        String message = "Hi :3";
}