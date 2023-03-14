package forLoop;

import java.util.Scanner;

public class HomeAssignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        boolean boo = false;
        do{

            System.out.println("enter a positive number");
            a = sc.nextInt();

        }while (a <= 0);

        for (int b = 1; b < a; b++){
            if (b % 3 == 0 && b % 5 != 0){
                System.out.println(b);
                boo = true;
            }
        }
            if (!boo){
                System.out.println("no such integers");
            }


    }
}
