package forLoop;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {

        for (int g = 1; g <= 10; g++){
            if (g == 5){
                continue;
            }
            System.out.println(g);
        }
        //=====================================================
        System.out.println();
        //====================================================

        for (int a = 1; a <= 100; a++){
            if (a % 2 == 0){
                continue;
            }
            System.out.println(a);
        }

        //==========================================================
        System.out.println();
        //=========================================================

        for (int v = 1; v <= 100; v++){
            if (v % 3 == 0){
                continue;
            }
            System.out.println(v);
        }
        //=========================================================
        System.out.println();
        //========================================================

        Scanner sc = new Scanner(System.in);

        System.out.println("enter negative number");
        int num1 = sc.nextInt();

        System.out.println("print positive number");
        int num2 = sc.nextInt();

        for (int b = num1; b <= num2; b++){
            if (b < 0 && b % 2 == 0){
                continue;
            }
            else if (b > 0 && b % 2 != 0){
                continue;
            }
            System.out.println(b);
        }






    }
}
