import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQ {

    public static void main(String[] args)

    {
        Queue <Integer> q = new PriorityQueue<Integer>();


           System.out.println(q.isEmpty());

           q.offer(12);
           q.offer(89);
           q.offer(15);
           q.offer(33);
           q.offer(29);

           System.out.println(q);

           System.out.println(q.isEmpty());

           q.poll();
           q.poll();

           System.out.println(q);

    }
    
}
