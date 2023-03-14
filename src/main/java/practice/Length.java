package practice;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {

        Scanner q = new Scanner(System.in);

        System.out.println("enter first String");
        String q1 = q.next();

        System.out.println("enter second String");
        String q2 = q.next();

        if (q1.length() > q2.length()){
            System.out.println(q1 + ":" + q1.length());
        }
        else if (q2.length() > q1.length()) {
            System.out.println(q2 + ":" + q2.length());
        }
        else
            System.out.println(q1 + " " + q2);


    }
}
