import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with String keys and Integer values
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Insert key-value pairs
        hashMap.put("apple", 5);
        hashMap.put("banana", 3);
        hashMap.put("cherry", 7);

        // Retrieve values by key
        Integer appleValue = hashMap.get("apple");
        Integer grapeValue = hashMap.get("grape");

        System.out.println("Value for 'apple': " + appleValue);  // Output: Value for 'apple': 5
        System.out.println("Value for 'grape': " + grapeValue);  // Output: Value for 'grape': null

        // Remove a key-value pair
        hashMap.remove("banana");

        // Print the contents of the HashMap
        System.out.println("HashMap contents: " + hashMap);  // Output: HashMap contents: {cherry=7, apple=5}
    }
}
