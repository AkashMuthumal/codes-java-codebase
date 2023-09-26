import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue of integers
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue (add) elements to the back of the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Peek at the front element without removing it
        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        // Dequeue (remove) elements from the front of the queue
        while (!queue.isEmpty()) {
            int dequeuedElement = queue.poll();
            System.out.println("Dequeued: " + dequeuedElement);
        }

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        // Get the size of the queue
        int queueSize = queue.size();
        System.out.println("Queue size: " + queueSize);
    }
}
