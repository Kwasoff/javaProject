package whileLoop;

import java.util.Scanner;

public class HomeworkFactorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        int b = 1;
        int factorial = 1;

        do{
            System.out.println("enter positive number");
            a = sc.nextInt();

        }while (a <= 0);

        while (b <= a) {
            factorial *= b;
            b++;
        }
            System.out.println("factorial of input = " + factorial);






    }
}
