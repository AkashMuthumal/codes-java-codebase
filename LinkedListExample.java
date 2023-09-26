import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a linked list of integers
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the end of the list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Add an element to the front of the list
        linkedList.addFirst(5);

        // Remove an element from the end of the list
        linkedList.removeLast();

        // Traverse and print elements in the list
        System.out.print("Linked List elements: ");
        for (Integer element : linkedList) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Check if the linked list is empty
        boolean isEmpty = linkedList.isEmpty();
        System.out.println("Is the linked list empty? " + isEmpty);

        // Get the size of the linked list
        int listSize = linkedList.size();
        System.out.println("Linked list size: " + listSize);
    }
}
