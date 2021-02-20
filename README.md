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

**ADVANCED DATA STRUCTURES CHAPTER**   

**Collections**  
Facts to select one, "ordering, duplicates, speed and memory."  
Iterable > Collection > Set, List, Queue,   
  Set: unorder, no duplicates    
  List: duplicates allowed, order is significant  
  Queue: First in, first out    
  Map (this not extends but it is included in the collection pack): Key value pairs,  
  Docs: https://www.javatpoint.com/collections-in-java and https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collections.html  
  
  **#package Data_structures**-------------------------------  
  **class LinkedListExample**   
  The main advantage of the list is that it is very quick add and delete elements in the list.  
  Ex: LinkedList<String> mylist  = new LinkedList();  
    
  **class Store (queue)**  
  Queue are used like queue in real life  
   Ex: LinkedList<Customer> queue = new LinkedList();  
  
  **class HashMapExample**  
  HashMap not allow duplicate key so if we add an element with the same key, add the new element  
  HashMap<String, Integer> phoneBook = new HashMap<>();  
  phoneBook.put("Bob", 123456);  
    
  **class LinkedHashMapExample**  
  One of the differences with HashMap is that LinkedHashMap keep the same order that the elements were put on the Hashmap.  
    Ex: LinkedHashMap<String, Integer> phonebook = new LinkedHashMap(4,0.75f, true);  
        //The constructor could have 3 parameters  
        //1 - Initial capacity of the map ex: 4  
        //2 - Load factor the value for default is 0.75f, that means that if the list is 75% full it increase 1 element.  
        //3 - Ordering mode (true or false)  
  
**FUNCTIONAL PROGRAMING CHAPTER**    
**package Functional_programing.functionalinterfaceexample;**  
**class Main and interface GreetingMessage**  
Explain: What is a functional interfaces? / It is a interface with one abstract method.  
and introduce Lambdas exp  
  
**package Functional_programing.lambdaexample;**  
**class Main, interface GreetingMessage and interface MessagePrinter**  
//Lambdas help to write shorter functional interfaces, avoiding boil plates  
   Interface f = (Class objet) -> {  
            System.out.println("First Lambdas example !");  
            //method into the class  
        };
        f.method(<T> t);
 //Old way  
    Interface i = new Interface() {  
     @Override  
      public void method (String s) {  
                System.out.println("Hello " + s);  
            }  
        };  
        i.method("string");  
    
**package Functional_programing.methodreferencesexample;**    
**class Main, interface Shapes and class Square**  
Sometimes, however, a lambda expression does nothing but call an existing method. In those cases, it better use method references  
https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html  

**package Functional_programing.streamexample;**  
**class Library and class Book**  
        //Stream are considerate internal iterators  
        //Stream have 2 kind of methods lazy(n*) and eager (just 1 at the end) methods  
        System.out.println("With stream");  
        books.stream().filter(book -> {  
            return book.getAuthor().startsWith("J");  
                }  
        ).filter(book -> {  
                    return book.getTitle().startsWith("E");  }  
  
        //It is possible do it with for each but it is less optimized  
        //This kind of iterations are considerate external iterations  
                //hard to write parallel iterations  
                //More difficult to read   
        System.out.println("With For each");  
        for (Book book: books ) {  
            if (book.getAuthor().startsWith("J") && book.getTitle().startsWith("E") ){  
                System.out.println(book.toString());  }  }  ).forEach(System.out::println);  

**package Functional_programing.parallelstreamsexample;**  
**class Library and class Book**  
It is really really easy to add parallel programing, well in the basic :)  
It is best for large dataset, it is possible that stream have a better performance in small data set.  
              System.out.println("With parallelStream");  
          books.parallelStream().filter(book -> {  
              return book.getAuthor().startsWith("J");  
          }).forEach(System.out::println);  
          
**MODULAR PROGRAMMING IN JAVA**  
For use a class into a other module, it is necessary add in the module-info.java (module) requires o exports  

Ex: The class custumer use a class Scheduler into a module bookingsystem  
module customer {requires bookingsystem;}  
module bookingsystem {exports scheduling;}  

**OTHER IDEAS**
 static int factorial(int n) {
     return (n == 1) ? 1 : n*factorial(n-1);

    }
