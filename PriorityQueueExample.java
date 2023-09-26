import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a priority queue of integers (min-heap)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Offer (add) elements to the priority queue
        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(20);

        // Peek at the highest-priority element without removing it
        int topElement = priorityQueue.peek();
        System.out.println("Top element: " + topElement);

        // Poll (remove) elements from the priority queue in priority order
        while (!priorityQueue.isEmpty()) {
            int polledElement = priorityQueue.poll();
            System.out.println("Polled: " + polledElement);
        }

        // Check if the priority queue is empty
        boolean isEmpty = priorityQueue.isEmpty();
        System.out.println("Is the priority queue empty? " + isEmpty);

        // Get the size of the priority queue
        int queueSize = priorityQueue.size();
        System.out.println("Priority queue size: " + queueSize);
    }
}
