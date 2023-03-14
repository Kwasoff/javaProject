package ScannerClass;

import java.util.Scanner;

public class SpeedingClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Speed");
        int speed = sc.nextInt();
        sc.nextLine();

        System.out.println("day of stop");
        String dos = sc.nextLine();


        System.out.println("day of birth");
        String dob = sc.nextLine();



        if (speed <= 60){
            System.out.println("no ticket");
        }
        if (speed > 60 && speed <=80 && !dos.equalsIgnoreCase(dob)){
            System.out.println("small ticket");
        }
        else if (speed > 60 && speed <=80 && dos.equalsIgnoreCase(dob)){
            System.out.println("smaller ticket");
        }
        if (speed > 80 && speed <= 100 && !dos.equalsIgnoreCase(dob)){
            System.out.println("medium ticket");
            }
        else if (speed > 80 && speed <= 100 && dos.equalsIgnoreCase(dob)){
            System.out.println("Smaller than medium ticket");
        }
        if (speed > 100 && !dos.equalsIgnoreCase(dob)){
            System.out.println("big ticket");
        }
        else if (speed > 100 && dos.equalsIgnoreCase(dob)){
            System.out.println("smaller than big ticket");
        }





    }
}
