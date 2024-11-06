import java.util.HashMap;
import java.util.Map;

public class Maps {
    
    public static void main(String[] args) {
        
        // employee IDs hashmap with key:value name:id
        // the values used in the diamond needs to be java wrapper classes
        // and not primitive types, ex: Integer instead of int
        HashMap<String, Integer> empIds = new HashMap<>();

        // mapping the key and the value to its key
        empIds.put("John", 1);
        empIds.put("Carl", 2);
        empIds.put("Jerry", 3);
        empIds.put("Sonya", 4);

        // prints everything
        System.out.println(empIds);
        // prints a specific value using its key
        System.out.println(empIds.get("Carl"));
        // checks if theres a key in the hashmap
        System.out.println(empIds.containsKey("Jorge"));
        // checks if theres a value in the hashmap
        System.out.println(empIds.containsValue(3));
        // overwrite or create a existing value
        empIds.put("John", 100);
        // replace the value if it exist
        empIds.replace("Richard", 10); // doesnt exist
        // write a value if it doesnt exist yet
        empIds.putIfAbsent("Steve", 5);
        // remove a key value in the hashmap
        empIds.remove("Jerry");

    }

}
