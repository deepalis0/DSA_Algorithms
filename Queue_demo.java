
import java.util.LinkedList;
import java.util.Queue;

public class Queue_demo {
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12); // enqueue
        queue.add(14);
        queue.add(9);
        queue.add(2);
        System.out.println(queue);
        System.out.println(queue.poll());//removal
        System.out.println(queue.peek());//@front of the queue
        System.out.println(queue.isEmpty());
        System.out.println(queue);

    }
}
