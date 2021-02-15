/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading.thread_class;

/**
 *
 * @author betha
 */
public class Main {
    
    public static void main(String[] args) {

        //System.out.println(Thread.activeCount());
        ThreadExample thread1 = new ThreadExample();
        thread1.setName("First thread");
        thread1.start();

        ThreadExample thread2 = new ThreadExample();
        thread2.setName("Second thread");
        thread2.start();
        //System.out.println(Thread.activeCount());

        
    }
    
}
