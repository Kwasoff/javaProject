package forLoop;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int limit = 40;
        for (int a = 0; a <= num; a++){

            if (a > 40){
                break;
            }
            System.out.println(a);
        }
        System.out.println("After loop");













    }
}
