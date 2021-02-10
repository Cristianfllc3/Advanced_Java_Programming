
package Data_structures.linkedhashmapexample;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author bethan
 */
public class LinkedHashMapExample {
    
    public static void main(String[] args) {

        //One of the differences with HashMap is that LinkedHashMap keep the same order that the elements are put on the Hashmap.
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap(4,0.75f, true);
        //The constructor could have 3 parameters
        //1 - Initial capacity of the map ex: 4
        //2 - Load factor the value for default is 0.75f, that means that if the list is 75% full it increase 1 element.
        //3 - Ordering mode (true or false)
        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 98765);
        phonebook.put("Brenda", 123123); 
        phonebook.put("Gary", 22222); 
        System.out.println("Kevin's number: " + phonebook.get("Kevin"));
               
        System.out.println("\nList of contacts in phonebook:");
        for(Map.Entry<String, Integer> entry: phonebook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    
}
