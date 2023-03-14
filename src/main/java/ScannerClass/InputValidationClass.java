package ScannerClass;

import java.util.Scanner;

public class InputValidationClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");
        int num = sc.nextInt();

        if (num >= 1 && num <= 10){
            System.out.println("Valid input");
        }
        else
            System.out.println("Invalid input");







    }
}
