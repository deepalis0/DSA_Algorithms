import java.util.ArrayDeque;
import java.util.Deque;


public class ArrayDeque_Demo
{
    public static void main(String[] args)
    {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(12);
        dq.add(13);
        dq.addLast(14);
        dq.addFirst(19);
        dq.add(200);
        dq.add(300);
        System.out.println(dq);

        dq.remove();//FIFO
        dq.removeLast();

        System.out.println(dq);

        dq.poll(); //FIFO
        dq.add(6);
        dq.add(7);
        System.out.println(dq);

        dq.pollFirst();//from front of DQ
        System.out.println(dq);

        dq.pollLast();//from end of DQ
        System.out.println(dq);


        //Using as Stack - LIFO
        System.out.println("-------------STACK---------------");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.addLast(12);
        stack.addLast(14);
        stack.addLast(15);

        stack.removeLast();
        stack.peekLast();
        System.out.println(stack);


        //Using as Queue - FIFO
        System.out.println("-------------QUEUE---------------");
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.addLast(12);
        queue.addLast(14);
        queue.addLast(15);

        queue.removeFirst();
        queue.peekFirst();
        System.out.println(queue);


    }

}
