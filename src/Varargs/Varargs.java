
package Varargs;

/**
 *
 * @author bethan/Cristian
 */
public class Varargs {
    
    public static void main(String[] args) {
        String imem1 = "Apples";        
        String item2 = "Oranges";
        String item3 = "Pears";
        printShoppingList(imem1, item2, item3);
        printShoppingList("Bread", "Milk", "Eggs", "Bananas");
    }

    //The String... is varargs this allow us to use n argument in the method without the necessity of pass 1, 2 or n elements into the args.
    private static void printShoppingList(String... items) {
        System.out.println("SHOPPING LIST");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + ": " + items[i]);
        }
        System.out.println();
    }

  /* This methods are not necessary if we create a methods with varargs
  private static void printShoppingList(String a, String b){
        System.out.println("SHOPPING LIST");
        System.out.println("1. "+a);
        System.out.println("2. "+b);
    }
*/
    
}
