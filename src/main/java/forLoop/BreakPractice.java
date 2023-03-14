package forLoop;

import java.util.Scanner;

public class BreakPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        int a1 = sc.nextInt();

        System.out.println("enter second number");
        int a2 = sc.nextInt();

        int sum = a1 + a2;
        for (int x = 0; x <= sum; x++) {
            if (x > 45) {
                break;
            }
            System.out.println(x);
        }





    }
}
