package Batch2Assignments;

import java.util.Scanner;

public class Batch2AssignmentSwitchCasePerimeterArea {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("input width of square");

        int width = sc.nextInt();

        System.out.println("input Perimeter/Area/Both you wanna know");
        String areaOrPerimeter = sc.next();

        switch (areaOrPerimeter){
            case "Perimeter":
                System.out.println("Perimeter of the square is: " + width * 4);
                break;
            case "Area":
                System.out.println("Area of the square is: " + width * width);
                break;
            case "Both":
                System.out.println(("Perimeter of the square is: " + width * 4) + " and " +
                        ("Area of the square is: " + width * width));
                break;
            default:
                System.out.println("Invalid input");
        }






    }
}
