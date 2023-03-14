package Batch2Assignments;

import java.util.Scanner;

public class Batch2AssignmentsString {
    public static void main(String[] args) {

        String q = "This is a random string for testing purposes";
        System.out.println(q.length());

        System.out.println(q.charAt(1));

        System.out.println(q.charAt(q.length()-1));

        System.out.println(q.replace('o', 'i'));

        System.out.println(q.replace(" ", ""));

        System.out.println(q.substring(10,16));

        System.out.println(q.toUpperCase().charAt(16) + "" + q.toUpperCase().charAt(15) + q.toUpperCase().charAt(14) +
                q.toUpperCase().charAt(13) + q.toUpperCase().charAt(12) + q.toUpperCase().charAt(11) +
                q.toUpperCase().charAt(10));







    }

}
