package ScannerClass;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Enter first number");
        Double num1 = user.nextDouble();

        System.out.println("Enter arithmetic operator: / * + - %");
        String arithmeticOperator = user.next();

        System.out.println("Enter second number");
        double num2 = user.nextDouble();

        if (arithmeticOperator.equals("/") && num2 > 0){
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
        else if (arithmeticOperator.equals("*")){
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        }
        else if (arithmeticOperator.equals("+")){
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
        else if (arithmeticOperator.equals("-")){
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        }
        else if (arithmeticOperator.equals("%")){
            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        }
        else
            System.out.println("The operator is invalid, please enter / * + - %");






    }
}
