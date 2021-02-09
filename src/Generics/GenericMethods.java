package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

    static Character [] charArray= {'a', 'e', 'i', 'o', 'u'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true, false};

    public static <T> List<T> arrayToList(T[] array, List<T> list){
        for (T object: array
             ) {
            list.add(object);
        }
        return list;
    }
 /* Without generic, see above the definition of generic type <T>
 IMPORTANT: This allow keep the methods generic and delete boiler plates in the future.

 public static List arrayToList(Object[] array, List<Object> list) {
        for (Object object : array) {
            list.add(object);
        }
        return list;
    }*/
    public static void main(String[] args) {
    List<Character> charList = arrayToList(charArray, new ArrayList<>());
    List<Integer> intList = arrayToList(intArray, new ArrayList<>());
    List<Boolean> booleanList = arrayToList(boolArray, new ArrayList<>());

        System.out.println(charList);
        System.out.println(booleanList);
        System.out.println(intList );
    }
}
