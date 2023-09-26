import java.util.ArrayList;

public class DynamicArrayExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        // Add elements to the dynamic array
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);

        // Access elements by index
        int elementAtIndex = dynamicArray.get(1);
        System.out.println("Element at index 1: " + elementAtIndex);

        // Modify elements by index
        dynamicArray.set(1, 25);

        // Remove an element by value
        dynamicArray.remove(Integer.valueOf(10));

        // Traverse and print elements in the dynamic array
        System.out.print("Dynamic Array elements: ");
        for (Integer element : dynamicArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Check if the dynamic array is empty
        boolean isEmpty = dynamicArray.isEmpty();
        System.out.println("Is the dynamic array empty? " + isEmpty);

        // Get the size of the dynamic array
        int arraySize = dynamicArray.size();
        System.out.println("Dynamic array size: " + arraySize);
    }
}
