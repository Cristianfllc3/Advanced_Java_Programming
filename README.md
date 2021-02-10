# Advanced_Java_Programming  
  
**GENERIC IN JAVA CHAPTER**  

**#package Generics;** ---------------------------  
**class GenericsExample**  
Explain why use List<type>  
    
**class GenericMethods**  
Example how to use a generic List with type <T>  
public static <T> List<T> arrayToList(T[] array, List<T> list)  
     
**class Varargs**    
Example how to use, private static void printShoppingList(String... items), to add n args.  
  Does varargs offer a kind of poor man's polymorphism?  
  (stackoverflow) I guess that's more like overloading than polymorphism.  
  
  **#package substitution_principle;**  --------------------------------  
  **class Main** 
  Substitution principle allow pass a different objet in a methods that wait other.  
  //It not apply in List<type>  

**#package wildcards;**  
**class Main**  
It is possible use wildcards for sub-classes List <? extends class> ex: method(List<? extends Type> type)  
It is possible use wildcards for super-classes ex: method(List<? super Type> type)     

**Collections**
Facts to select one, "ordering, duplicates, speed and memory."
Iterable > Collection > Set, List, Queue, 
  Set: unorder, no duplicates
  List: duplicates allowed, order is significant
  Queue: First in, first out
  Map (this not extends but it is included in the collection pack): Key value pairs, 
  Docs: https://www.javatpoint.com/collections-in-java and https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collections.html
