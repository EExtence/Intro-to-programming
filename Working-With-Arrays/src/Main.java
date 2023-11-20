import java.util.Queue;
import java.util.LinkedList;
public class Main {
        public static void main(String[] args) {
                Queue<Integer> q = new LinkedList<>();
                
                q.add(45);
                q.add(12);
                q.add(28);
                q.poll();
                q.poll();
                q.add(69);
                q.add(27);
                q.add(99);
                q.poll();
                q.add(24);
                q.add(85);
                q.add(16);
                q.poll();

                System.out.println(q);

                

    //end of main method
    }
}
