
package Functional_programing.lambdaexample;


/**
 *
 * @author bethan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        gm.greet("Cristian");

        //Lambdas help to write shorter functional interfaces, avoiding boil plates
        GreetingMessage gm2 = (String name) -> {
            System.out.println("Hello "+ name);
        };
        gm2.greet("Cristian");

        //Other example
        MessagePrinter mp = () -> {
            System.out.println("First Lambdas example !");
        };
        mp.printMessage();

    }
    
}