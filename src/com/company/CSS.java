package com.company;  /* For importing com.company package */
import java.io.File;   /* Used to import File Class */
import java.io.FileNotFoundException;   /* Used to import FileNotFoundException Class */
import java.util.Scanner;   /* Used to import Scanner Class */

/*
 * This class is created to read the CSS.CSV file which contains  questions and answers for CSS quiz
 */


public class CSS {
    int total;
    String name = "CSS.CSV";  /* to import CSV File  */
    File aka = new File (name);
    int constant = 0;
    public int css() {          /* a new method is created */
        try{                            /* Implementing Try Catch */
            Scanner A = new Scanner(aka);
            while (A.hasNext()) {       /* Declaring While Condition */
                String data = A.nextLine();
                String[] split = data.split(",");
                System.out.println();
                /* Taking Values in an array */
                System.out.println(split[0]);
                System.out.println(split[1]);
                System.out.println(split[2]);
                System.out.println(split[3]);
                System.out.println(split[4]);
                int answer = Integer.parseInt(split[5]);
                Option a = new Option();
                int set = a.value();
                if (set == answer) {         /* Declaring If Else Condition */
                    System.out.println("Correct");
                    System.out.println();
                    constant++;
                } else {
                    System.out.println("Wrong answer, the correct answer is " + split[answer]);
                    System.out.println();
                }
                total++;
            }
            A.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return constant;
    }
}


