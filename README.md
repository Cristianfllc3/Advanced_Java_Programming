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
