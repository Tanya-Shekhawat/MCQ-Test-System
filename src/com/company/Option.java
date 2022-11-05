package com.company;      /* For importing com.company package */
import java.util.Scanner;      /* Used to import Scanner Class */


/*
 * This class is created to check whether the option received is correct or not
 */

public class Option {
int z;
public  int value() {
    System.out.println("\nYour Choice ; ");
    Scanner c = new Scanner(System.in);     /* New Instance Created called 'c' */
    String choice = c.next();
    System.out.println();
    switch (choice) {
        case "a", "A" -> {          /* Declaring switch cases and initializing em all ladder */
            z = 1;
            return z;
        };
        case "b", "B" -> {
            z = 2;
            return z;
        }
        case "c", "C" -> {
            z = 3;
            return z;
        }
        case "d", "D" -> {
            z = 4;
            return z;
        }
        default -> {
            System.out.println("Invalid Input");
            value();
        }
    }
    return z;
}
}










