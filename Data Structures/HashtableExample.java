import java.util.HashMap;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        // Create a new HashMap instance
        Map<String, Integer> hashtable = new HashMap<>();

        // Add key-value pairs to the hashtable
        hashtable.put("Alice", 25);
        hashtable.put("Bob", 30);
        hashtable.put("Charlie", 28);
        hashtable.put("David", 35);

        // Retrieve values by key
        System.out.println("Age of Alice: " + hashtable.get("Alice"));
        System.out.println("Age of Bob: " + hashtable.get("Bob"));

        // Check if a key exists in the hashtable
        String searchKey = "Eve";
        if (hashtable.containsKey(searchKey)) {
            System.out.println("Age of " + searchKey + ": " + hashtable.get(searchKey));
        } else {
            System.out.println(searchKey + " not found in the hashtable.");
        }

        // Iterate over the keys and values in the hashtable
        System.out.println("Iterating over the hashtable:");
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Remove a key-value pair from the hashtable
        String removeKey = "Charlie";
        if (hashtable.containsKey(removeKey)) {
            hashtable.remove(removeKey);
            System.out.println(removeKey + " removed from the hashtable.");
        } else {
            System.out.println(removeKey + " not found in the hashtable.");
        }
    }
}
