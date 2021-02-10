/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_structures.queueexample;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author betha
 */
public class Store {
    
    public static void main(String[] args) {                
        //Queue are used like queue in real life
        LinkedList<Customer> queue = new LinkedList();
        queue.add(new Customer("Juan"));
        queue.add(new Customer("Maria"));
        queue.add(new Customer("Pepe"));
        queue.add(new Customer("Lola"));
        System.out.println(queue);
        serve(queue);
        System.out.println(queue);

    }
    static void serve(LinkedList<Customer> queue){
       Customer c =  queue.poll();
        c.serve();
        //System.out.println(queue);
    }
    
}
