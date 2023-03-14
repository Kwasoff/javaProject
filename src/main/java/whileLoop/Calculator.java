package whileLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
           int num1;
           int num2;
           String trueAgain;

        do{
            System.out.println("Enter first number");
            num1 = sc.nextInt();

            System.out.println("enter arithmetical operator +-*/");
            String oper = sc.next();

            System.out.println("enter second number");
            num2 = sc.nextInt();

            if (oper.equals("+")){
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            }
            else if (oper.equals("-")){
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            }
            else if (oper.equals("*")){
                System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
            }
            else if (oper.equals("/")){
                System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
            }
            else
                System.out.println("Invalid input");

            System.out.println("Do you wanaa try again? yes/no");

            trueAgain = sc.next();

            if (trueAgain.equalsIgnoreCase("yes")){
                System.out.println("sure");
            }
            else if (trueAgain.equalsIgnoreCase("no"))
                System.out.println("Bye!");



        }while (!trueAgain.equalsIgnoreCase("no"));








    }
}
