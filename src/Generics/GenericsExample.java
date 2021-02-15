package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        int v = 0x2222;
        int m = 0x000F;
        System.out.println(v&m);


       /* // Example without Generics
        List names = new ArrayList();
        names.add("Cristian");
        String name = (String) names.get(0);
        System.out.println("First name " + name);
        //names.add(7);

        // Example with Generics
        List<String> namesG = new ArrayList<>();
        namesG.add("Cristian");
        String nameG = namesG.get(0);
        System.out.println("First name " +nameG);
        //namesG.add(7);
        //This throws an error because the list is cast to <String>,
        //Without generic it is necessary cast each element of the list "(String) names.get(0);"*/
    }

}