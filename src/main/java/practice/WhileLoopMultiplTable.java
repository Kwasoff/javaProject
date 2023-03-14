package practice;

import java.util.Scanner;

public class WhileLoopMultiplTable {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        System.out.println("input");
        int a = sc.nextInt();
        int b = 1;
        while (b <= 10){
            System.out.println(a + " * " + b + " = " + a * b);
            b++;
        }











    }
}
