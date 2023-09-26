import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek at the top element without removing it
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Pop and print elements from the stack
        while (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println("Popped: " + poppedElement);
        }

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Get the size of the stack
        int stackSize = stack.size();
        System.out.println("Stack size: " + stackSize);
    }
}
