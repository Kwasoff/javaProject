package practice;

import java.util.Scanner;

public class AndOrOperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter first boolean");
        boolean q1 = sc.nextBoolean();

        System.out.println("enter second boolean");
        boolean q2 = sc.nextBoolean();

        if (q1 == true && q2 == false) {
            System.out.println(" q1 - true, q2 - false");
        }
        else if (q1 == false && q2 == true){
            System.out.println("q1 - false, q2 - true");
        }
        else if (q1 == true && q2 == true){
            System.out.println("both true");
        }
        if (q1 == true || q2 == true){
            System.out.println("either q1 or q2 is true");
        }
        else if (q1 == false && q2 == false){
            System.out.println("both are false");
        }








    }

}
