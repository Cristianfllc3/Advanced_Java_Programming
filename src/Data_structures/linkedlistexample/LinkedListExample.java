
package Data_structures.linkedlistexample;

import java.util.LinkedList;

/**
 *
 * @author bethan
 */
public class LinkedListExample {
    //The main advantage of the list is that it is very quick add and delete elements in the list.
    //LinkedList consume more memory than arrayList (because each entry have reference)
    public static void main(String[] args) {
        LinkedList<String> mylist  = new LinkedList();
        mylist.add("A");
        mylist.add("B");
        mylist.add("C");
        System.out.println(mylist);

        mylist.remove("B");
        System.out.println(mylist);
        
    }

    
}
