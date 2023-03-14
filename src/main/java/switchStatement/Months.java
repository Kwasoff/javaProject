package switchStatement;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number of month 1 - 6");

        int month = sc.nextInt();

        if (month == 1){
            System.out.println("january");
        }
        else if (month == 2){
            System.out.println("february");
        }
        else if (month == 3){
            System.out.println("march");
        }
        else if (month == 4){
            System.out.println("april");
        }
        else if(month == 5){
            System.out.println("may");
        }
        else if (month == 6){
            System.out.println("june");
        }
        else
            System.out.println("invalid number");


        switch (month){
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            default:
                System.out.println("invalid number");
        }




    }
}
