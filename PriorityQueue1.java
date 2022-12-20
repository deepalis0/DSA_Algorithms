import java.util.Collections;
import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueue1 {
    // In Java, a Heap is represented by a Priority Queue

    // Construct an empty Min Heap
    static PriorityQueue<Integer> minHeap = new PriorityQueue<>();


    // Construct an empty Max Heap
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    // Construct a Heap with initial elements.
// This process is named "Heapify".
// The Heap is a Min Heap
    static PriorityQueue<Integer> heapWithValues= new PriorityQueue<>(Arrays.asList(3, 1, 2, 14, 19, 10));

    public static void main(String[] args)
    {
        minHeap.add(12);
        minHeap.add(13);
        minHeap.add(2);
        System.out.println(minHeap.poll());//removal
        System.out.println(minHeap.peek());//read
        System.out.println(minHeap.poll());

        maxHeap.add(13);
        maxHeap.add(100);
        System.out.println(maxHeap.poll());//remove
        System.out.println(maxHeap.peek());//read the value from top
        System.out.println(minHeap.size());//size of heap

        System.out.println(heapWithValues);


    }
}
