package practice;

import java.util.Scanner;

public class PositiveNegativeNumbers {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");

        int q1 = sc.nextInt();

        System.out.println("enter second number");
        int q2 = sc.nextInt();


        if (q1 > 0 && q2 >0){
            System.out.println("both are positive");
                    }
        else if (q1 == 0 || q2 == 0){
            System.out.println("either is zero");
        }
        else if (q1 < 0 && q2 < 0){
            System.out.println(" both are negative");
        }
        else
            System.out.println(" one is positive, one is negative");





    }
}
