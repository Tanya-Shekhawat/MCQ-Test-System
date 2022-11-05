package com.company;  /* For importing com.company package */

/*
 * This is the Main class. The program can be executed only from here.
 */


public class Main {
    public static void main(String []args){  /* main method */


        Username setname =new Username();

        String name =setname.takeName();
         Quizset loadfile = new Quizset();
        int file = loadfile.takeFile();
        if (file==2){
            CSS mcq = new CSS();
            int constant =mcq.css();
            int total = mcq.total;
            int wrongans = total-constant;
            int percentage =(constant*100)/total;
            System.out.println(name+", you answered\n"+constant+ " " + "questions right \n"+wrongans+" "+ "questions wrong \nYour score is"+" " + percentage +"%");
            if (percentage>=90)
            {
                System.out.println("Congratulations You have qualified the Exam and are eligible for next round");
            }
            else
            {
                System.out.println("Oops!! you aren’t eligible for next round");
            }

        }
        else if (file==1)
        {
            Java mcq = new Java();
            int constant =mcq.java();
            int total = mcq.total;
            int wrongans = total-constant;
            int percentage =(constant*100)/total;
            System.out.println(name+", you answered\n"+constant+ " " + "questions right \n"+wrongans+" "+ "questions wrong \nYour score is"+" " + percentage +"%");
            if (percentage>=90)
            {
                System.out.println("Congratulations You have qualified the Exam and are eligible for next round");
            }
            else
            {
                System.out.println("Oops!! you aren’t eligible for next round");
            }
        }
        else if (file==3)
        {
            HTML mcq = new HTML();
            int constant =mcq.html();
            int total = mcq.total;
            int wrongans = total-constant;
            int percentage =(constant*100)/total;
            System.out.println(name+", you answered\n"+constant+ " " + "questions right \n"+wrongans+" "+ "questions wrong \nYour score is"+" " + percentage +"%");
            if (percentage>=90)
            {
                System.out.println("Congratulations You have qualified the Exam and are eligible for next round");
            }
            else
            {
                System.out.println("Oops!! you aren’t eligible for next round");
            }
        }


    }
}
