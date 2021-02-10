
package Functional_programing.functionalinterfaceexample;

/**
 *
 * @author bethan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        

        //What is a functional interfaces?
        //It is a interface with one abstract method.
        //The annotation @FunctionalInterface in class GreetingMessage validate the norm of functional interface
        //A functional interface is an interface that contains only one abstract method. They can have only one functionality to exhibit.
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }

        };
        gm.greet("Cristian");

        GreetingMessage gmm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Yes it is you: "+ name);
            }
        };

        gmm.greet("Cristian");

    }//end main

    
}
