
package customers;


import scheduling.Scheduler;

/**
 *
 * @author Bethan
 */
public class Customer {
    
    public static void main(String[] args) {
        //Module help to maintain flexibility and support of the structure of the project
        //Working with multiples modules
        Scheduler scheduler = new Scheduler();
        scheduler.bookHaircut("Harry", "Monday");
        scheduler.bookHaircut("Jill", "Friday");
        
    }
    
}

