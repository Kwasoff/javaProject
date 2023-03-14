package practice;

import java.util.Scanner;

public class IsDivisable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int q1 = sc.nextInt();

        System.out.println("Enter second number");
        int q2 = sc.nextInt();

        if (q1 % q2 == 0){
            System.out.println("divisible");
        }
        else
            System.out.println("not divisible");




    }
}
