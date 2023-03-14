package Batch2Assignments;

import java.util.Scanner;

public class Batch2AssignmentIfElseAndLogicalOperators {
    public static void main(String[] args) {

        /*
        #1 Write a Java program that asks the user to enter a character and checks if it is a vowel or
           consonant using if-else statement.
                 */

        Scanner q = new Scanner(System.in);

        System.out.println("enter a character");
        String w = q.next();

        if (w.equalsIgnoreCase("a") || w.equalsIgnoreCase("o") || w.equalsIgnoreCase("i")
        || w.equalsIgnoreCase("e") || w.equalsIgnoreCase("u")){
            System.out.println("vowel");
        }
        else
            System.out.println("consonant");

        //====================================================================================================

        /*
        #2 Write a Java program that asks the user to enter a grade and checks if it is A, B, C, D or F
        using if-else statement.
                 */

        Scanner qw2 = new Scanner(System.in);

        System.out.println("enter a grade number");
        int str2 = qw2.nextInt();

        if (str2 >= 90 && str2 <= 100){
            System.out.println("A. Perfect");
        }
        else if (str2 >= 80 && str2 <= 89){
            System.out.println("B. Well done");
        }
        else if (str2 >= 70 && str2 <= 79){
            System.out.println("C. Good");
        }
        else if (str2 >= 59 && str2 <= 69){
            System.out.println("D. Passed");
        }
        else if (str2 < 59){
            System.out.println("F. Try again");
        }
        else
            System.out.println("invalid grade");

        //===============================================================================================

        /*
        #3 Write a Java program that takes a character as input and checks if it is uppercase or lowercase
        using if-else statement and logical operators.
                 */

        char err3 = 65 ;

        if (err3 >=65 && err3 <=90){
            System.out.println("uppercase");
        }
        else if (err3 >= 97 && err3 <= 122){
            System.out.println("lowercase");
        }
        else
            System.out.println("invalid number");

        //============================================================================================
        /*
        #4 Write a Java program that asks the user to enter their age and checks if they are eligible
        to vote or not using if-else statement.
         */

        Scanner scr = new Scanner(System.in);

        System.out.println("enter your age");
        int age = scr.nextInt();

        if (age >= 18){
            System.out.println("eligible to vote");
        }
        else
            System.out.println("not eligible to vote");

//        ===============================================================================================

        /*
        #5 Write a Java program that asks the user to enter two strings and checks if they are equal or not
        using if-else statement.

         */

        Scanner scn2 = new Scanner(System.in);

        System.out.println("enter first String");
        String s1 = scn2.nextLine();

        System.out.println("enter second String");
        String s2 = scn2.nextLine();

        if (s1.equals(s2)){
            System.out.println("Strings are equals");
        }
        else
            System.out.println("Strings are not equals");








    }
}
