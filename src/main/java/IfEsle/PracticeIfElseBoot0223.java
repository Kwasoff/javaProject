package IfEsle;

public class PracticeIfElseBoot0223 {
    public static void main(String[] args) {

        int a = -31;
        int b = 10;
        if (a % 2 == 0 && b % 2 == 0){
            System.out.println("both even");
        }
        else if (a % 2 != 0 && b % 2 != 0){
            System.out.println("both odd");
        }
        else if (a % 2 != 0 && b % 2 ==0 || a % 2 == 0 && b % 2 !=0){
            System.out.println("One is even, one is odd");
        }
        else{
            System.out.println("you decide");
        }

        int v = 40;
        int w = 20;
        int q = 0;
        if ( v == 0 || w == 0 || q == 0) {
            System.out.println("go fuck yourself");}

        else if( v % w == 0 && v % q == 0){
            System.out.println(v);
        }
        else if (w % v == 0 && w % q ==0){
            System.out.println(w);
          }
        else if (q % v == 0 && q % w == 0) {
            System.out.println(q);
        }
        else{
            System.out.println("learn math");
        }

        //===================================================Triangle
        int a1 = 20;
        int a2 = 20;
        int a3 = 30;

        if (a1 == 0 || a2 == 0 || a3 == 0){
            System.out.println("it,s not a triangle");
        }
        else if (a1 + a2 <= a3 || a1 + a3 <= a2 || a2 + a3 <= a1 ){
            System.out.println("The sum of the lengths of any two sides is not greater than or equal to the length of the third side");
        }
        else if (a1 == a2 && a1 == a3 && a2 == a3){
            System.out.println("equilateral");
        }
        else if (a1 == a2 || a1 == a3 || a2 == a3){
            System.out.println("isosceles");
        }
        else{
            System.out.println("scalene");
        }

        /*
        Write a Java program that takes a person's age and a person's gender (as a char: 'M' for male, 'F' for
        female) as input and outputs whether they are eligible for retirement based on the following criteria:
        - If the person is male and their age is 65 or older, they are eligible for retirement.
        - If the person is female and their age is 60 or older, they are eligible for retirement.
        - If the person is neither male nor female, or their age is less than the retirement age, they are not
            eligible for retirement.
         */

        char gender = 'M';

        int age = 64;

        if (gender == 'M' && age >= 65 || gender == 'F' && age >= 60){
            System.out.println("eligible for retirement");
        }
        else {
            System.out.println("not eligible for retirement");
        }

        //================================================================================================

        /*Write a Java program that takes three integers as input and outputs whether at least two of them are
         even or at least two of them are odd. Use if-else conditions with logical OR (||) and logical AND (&&)
         operators.

         */
        int z1 = 10;
        int z2 = 16;
        int z3 = 33;
        if (z1 % 2 == 0 && z2 % 2 == 0 || z1 % 2 == 0 && z3 % 2 == 0 || z2 % 2 == 0 && z3 % 2 == 0){
            System.out.println("at least two of them are even");
        }
        else{
            System.out.println("at least two of them are odd");
        }

        //=================================================================================================
        /*
        Write a Java program that takes a person's age and income as input and outputs their tax rate based
        on the following criteria:
        - If the person's income is less than or equal to $20,000, their tax rate is 10%.
        - If the person's income is greater than $20,000 but less than or equal to $50,000, their tax rate is 20%.
        - If the person's income is greater than $50,000, their tax rate is 30%.
        - If the person's age is 65 or older and their income is less than or equal to $30,000, their tax rate is 5%.
        - If the person's age is 65 or older and their income is greater than $30,000, their tax rate is 10%.
         */

        int age2 = 21;
        int income = 10000;
        if (age2 < 21){
            System.out.println("go to school");
        }
        else if (income <= 20000){
            System.out.println("tax rate is 10%");
        }
        else if (age2 < 65 && income > 20000 && income <= 50000){
            System.out.println("tax rate is 20%");
        }
        else if (age2 < 65 && income > 50000){
            System.out.println("tax rate is 30%");
        }
        else if (age2 >= 65 && income <= 30000){
            System.out.println("tax rate is 5%");
        }
        else if (age2 >= 65 && income > 30000){
            System.out.println("tax rate is 10%");
        }






    }

}
