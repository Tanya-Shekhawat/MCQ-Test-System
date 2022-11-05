package com.company;      /* For importing com.company package */
import java.util.Scanner;      /* Used to import Scanner Class */

/*
 * This class is created to select csv file set for quiz
 */

public class Quizset {
    int set;
    public int takeFile() {     /* a new method is created */
        System.out.println("Choose Your Multiple Choice Question Set. The Options are : ");
        System.out.println("\n1. Java");
        System.out.println("2. CSS");
        System.out.println("3. HTML");
        System.out.println(" (1, 2 or 3) : ");
        Scanner m= new Scanner(System.in);
        set = m.nextInt();
        if (set != 1 && set != 2 && set != 3) {
            takeFile();
        }
        return set;
    }
}

