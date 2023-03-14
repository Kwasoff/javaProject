package practice;

import java.util.Scanner;

public class Booleans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter boolean a");
        boolean a = sc.nextBoolean();

        System.out.println("enter second boolean b");
        boolean  b = sc.nextBoolean();

        System.out.println("enter boolean c");
        boolean c = sc.nextBoolean();

        if (a == true && b == true && c == true){
            System.out.println("all are true");
        }

        else if (a == true && b == true || a == true && c == true || b == true && c == true){
                    System.out.println(" at least two are true");
                }
                else
                    System.out.println(" less than two are true");







    }
}
