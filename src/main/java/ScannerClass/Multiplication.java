package ScannerClass;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// object of my scanner class

        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        System.out.println("Enter third number");
        int num3 = sc.nextInt();

        System.out.println("Multiplication: " + num1 * num2 * num3);





    }
}
