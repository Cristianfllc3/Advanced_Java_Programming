
package Data_structures.hashmapexample;

import java.util.HashMap;

/**
 *
 * @author bethan
 */
public class HashMapExample {
    
    public static void main(String[] args) {  
        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Bob", 123456);
        phoneBook.put("Steve", 987654);
        phoneBook.put("Gill", 123123);
        System.out.println(phoneBook);
        //HashMap not allow duplicate key so if we add an element with the same key, add the new element
        phoneBook.put("Bob", 654189);
        System.out.println(phoneBook);
        if(phoneBook.containsKey("Bob")){
            phoneBook.remove("Bob");
        }
        System.out.println(phoneBook);
    }
    
}
