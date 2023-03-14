package practice;

import java.util.Scanner;

public class MaxInt {
    public static void main(String[] args) {

        Scanner q = new Scanner(System.in);

        System.out.println("1st number");
        int a = q.nextInt();

        System.out.println("2nd number");
        int b = q.nextInt();

        System.out.println("3rd number");
        int c = q.nextInt();

        if (a > b && a > c){
            System.out.println("a");
        }
        else if (b > a && b > c){
            System.out.println("b");
        }
        else if (c > a && c > b){
            System.out.println("c");
        }
        else
            System.out.println("no biggest");






    }

}
