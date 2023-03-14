package whileLoop;

import java.util.Scanner;

public class SumOfOddIntegers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        int b = 1;
        int sumOfOdd = 0;

        do{
            System.out.println("enter positive number");
            a = sc.nextInt();
        }while (a <= 0);

        while (b <= a){
            if (b % 2 != 0){
                sumOfOdd += b;
            }
            b++;

        }
        System.out.println("Sum of odds = " + sumOfOdd);


    }
}
