package Functional_programing.methodreferencesexample;

/**
 *
 * @author bethan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
            * Kinds of Method References
            There are four kinds of method references:
                    Kind	                        Example
                    Reference to a static method	/ ContainingClass::staticMethodName
                    Reference to an instance method of a particular object	/ containingObject::instanceMethodName
                    Reference to an instance method of an arbitrary object of a particular type	/ ContainingType::methodName
                    Reference to a constructor	/ ClassName::new
        *https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html
        *
        * */

        // Sometimes, however, a lambda expression does nothing but call an existing method. In those cases, it's often clearer to refer to the existing method by name.
        // Method references enable you to do this (line up); ::
        Square s = new Square(4);

        Shapes shapes = (Square square) -> {
            return square.calculateArea();
        };
        System.out.println("Area with Lambda: " + shapes.getArea(s));

        //METHOD REFERENCE ---------
        Shapes shapes2 = Square :: calculateArea;
        System.out.println("Area with Lambda: " + shapes2.getArea(s));
        //---------------

        //Old way, were it is necessary implement the abstract methods of Shapes
        Shapes sh = new Shapes() {
            @Override
            public int getArea(Square square) {
                return square.calculateArea();
            }
        };
        System.out.println("Area like old way: " + sh.getArea(s));


    }

}
