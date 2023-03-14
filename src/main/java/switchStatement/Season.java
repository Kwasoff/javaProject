package switchStatement;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of a month");
        int month = sc.nextInt();

        if (month == 1 || month == 2 || month == 12){
            System.out.println("winter");
        }
        else if (month == 3 || month == 4 || month == 5){
            System.out.println("spring");
        }
        else if (month == 6 || month == 7 || month == 8){
            System.out.println("summer");
        }
        else if (month == 9 || month == 10 || month == 11){
            System.out.println("autumn");
        }


        switch (month){
            case 1,2,12:
                System.out.println("winter");
                break;
            case 3,4,5:
                System.out.println("spring");
                break;
            case 6,7,8:
                System.out.println("summer");
                break;
            case 9,10,11:
                System.out.println("autumn");
                break;
        }






    }
}
