package Generics;

import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s1 = scan.next();
        String s2 = scan.nextLine();
        String s = s1 +""+ s2;

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}