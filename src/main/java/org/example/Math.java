 package org.example;

import java.util.Scanner;
public class Math {
    public static Scanner keyboard;

    public static void main(String[] args) {
     keyboard = new Scanner(System.in);
        System.out.println("Въведи височината: ");

        int a = keyboard.nextInt();

        while ( a <= 0 ) {
            System.out.println("Въведи полужително число!");
            a = keyboard.nextInt();
        }
        System.out.println("Въведи широчината: ");

                int b = keyboard.nextInt();

               while ( b <= 0) {
                   System.out.println("Въведи полужително число");
                   b = keyboard.nextInt();
               }

               int perimeter = 2 * (a + b);
               int area = a * b;
                System.out.println("Perimeter is: " + perimeter );
                System.out.println("Area is " + area);

    }

}
