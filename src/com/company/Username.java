package com.company;      /* For importing com.company package */
import java.util.Scanner;      /* Used to import Scanner Class */


/*
 * This class is created to take the name of the user in a variable
 */

public class Username {
    String name;
    public  String takeName() {     /* new method created */
        System.out.println("How should we call you : ");
        Scanner n = new Scanner(System.in);
        name = n.nextLine();    
        System.out.println("Welcome "+name+"\n•\tHere are some rules before you start the quiz.\n" +
                "•\tThis quiz has 3 Topics namely Java Basics, CSS, HTML.\n" +
                "•\tYou need to select any one Topic and attempt the quiz.\n" +
                "•\tFor Each correct question +10 will be awarded and for a wrong answer a 0 will be awarded.\n" +
                "•\tThere is no negative marking.\n" +
                "•\tYou will get only 1 chance to attempt each question.\n" +
                "•\tAfter completing the quiz your score will be displayed.\n" +
                "      \n" +
                "        *****All the Best for your exam*****\n ");
        return name;
    }
}
