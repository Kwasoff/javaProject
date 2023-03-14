package Batch2Assignments;

import java.util.Scanner;

public class PracticeForLoops {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter your number");

        int number = sc1.nextInt();
        int factorial = 1;
        for (int x = number; x >= 1; x--){
            factorial *= x;

        }
        System.out.println(factorial);
        //============================================================
        System.out.println();
        //2===========================================================
        long sumXXX = 0;
        for (int xxx = 12345; xxx > 0; xxx /= 10){
            sumXXX += xxx % 10;
        }
        System.out.println(sumXXX);

        //============================================================
        System.out.println();
        //3===============================================

    for (int a = 99; a >= 1; a -=2){
        System.out.println(a);
    }
    //==================================================
        System.out.println();
    //4================================================

        for (int b = 1; b <= 31; b++){
            System.out.println(b + " March 2023");
        }

        //=========================================================
        System.out.println();
    //5=========================================================

        for (int c = 50; c >= 1; c--){
            if (c % 8 == 0){
                System.out.println(c);
            }

        }






}
}