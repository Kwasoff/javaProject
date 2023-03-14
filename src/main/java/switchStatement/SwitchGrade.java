package switchStatement;

import java.util.Scanner;

public class SwitchGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter grade");
        String grade = sc.next().toUpperCase();

        switch (grade){
            case "A":
                System.out.println("excellent");
                break;
            case "B":
                System.out.println("well done");
                break;
            case "C":
                System.out.println("still ok");
                break;
            case "D":
                System.out.println("passed");
                break;
            case "F":
                System.out.println("try again");
                break;
            default:
                System.out.println("invalid grade");

        }







    }
}
