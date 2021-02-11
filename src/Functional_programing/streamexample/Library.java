/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functional_programing.streamexample;

import java.util.ArrayList;

/**
 *
 * @author betha / Cristian
 */
public class Library {

    public static void main(String[] args) {

        //Stream are considerate internal iterators
        //.stream() use a interface o collection stream
        //Stream have 2 kind of methods lazy(n*) and eager (just 1 at the end) methods
        ArrayList<Book> books = populateLibrary();
        System.out.println("With stream");
        books.stream().filter(book -> {
            return book.getAuthor().startsWith("J");
                }
        ).filter(book -> {
                    return book.getTitle().startsWith("E");
                }
        ).forEach(System.out::println);

        //Duda pq no se puede utilizar method reference?
        // Es que es solo cuando llama a un metodo?
        //books.stream().filter(book :: getAuthor().startsWith("J"));

        //It is possible do it with for each but it is less optimized
        //This kind of iterations are considerate external iterations
                //hard to write parallel iterations
                //More difficult to read
        System.out.println("With For each");
        for (Book book: books ) {
            if (book.getAuthor().startsWith("J") && book.getTitle().startsWith("E") ){
                System.out.println(book.toString());
            }
        }

    }

    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList();
        books.add(new Book("Alice Walker", "The Color Purple"));
        books.add(new Book("Alice Walker", "Meridian"));
        books.add(new Book("Toni Morrison", "Beloved"));
        books.add(new Book("Toni Morrison", "Jazz"));
        books.add(new Book("Toni Morrison", "Paradise"));
        books.add(new Book("John Steinbeck", "The Grapes of Wrath"));
        books.add(new Book("John Steinbeck", "East of Eden"));
        books.add(new Book("Kazuo Ishiguro", "The Remains of the Day"));
        books.add(new Book("Kazuo Ishiguro", "Never Let Me Go"));
        books.add(new Book("Kazuo Ishiguro", "The Buried Giant"));
        books.add(new Book("Jane Austen", "Pride and Prejudice"));
        books.add(new Book("Jane Austen", "Emma"));
        books.add(new Book("Jane Austen", "Persuasion"));
        books.add(new Book("Jane Austen", "Mansfield Park"));
        books.add(new Book("Chinua Achebe", "Things Fall Apart"));
        books.add(new Book("Chinua Achebe", "No Longer at Ease"));
        books.add(new Book("Chinua Achebe", "Home and Exile"));
        return books;
    }

}
