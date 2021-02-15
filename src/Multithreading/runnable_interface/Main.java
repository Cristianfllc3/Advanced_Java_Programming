
package Multithreading.runnable_interface;

/**
 *
 * @author bethan
 */
public class Main {

    public static void main(String[] args) {

        //A second way ot running a thread in java it is with a interface
        Thread thread1 = new Thread(new RunnableExample());
        thread1.start();
        Thread thread2 = new Thread(new RunnableExample());
        thread2.start();
        Thread thread3 = new Thread(new RunnableExample());
        thread3.start();


    }

}
