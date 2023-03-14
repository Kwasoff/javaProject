package Batch2Assignments;

import java.util.Scanner;

public class Batch2AssignmentSwitchDayOfWeek {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a day of week");
        String day = sc.next().toLowerCase();


        switch (day){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("Weekday");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid input");
        }








    }



}
