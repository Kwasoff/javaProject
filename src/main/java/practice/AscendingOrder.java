package practice;

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {

        Scanner q = new Scanner(System.in);

        System.out.println("Enter 1st num");
        int a = q.nextInt();

        System.out.println("Enter 2nd num");
        int b = q.nextInt();

        System.out.println("Enter 3rd num");
        int c = q.nextInt();



        if ( a > b && b > c ){
            System.out.println(" a, b, c");
        }
        else if (b > a && a > c){
            System.out.println("b, a, c");
        }
        else if (c > a && a > b) {
            System.out.println("c, a, b");
        }
        else if (c > b && b > a){
            System.out.println("c, b, a");
        }
        else if (b > c && c > a){
            System.out.println("b, c, a");
        }
        else
            System.out.println("equal numbers present");





    }
}
