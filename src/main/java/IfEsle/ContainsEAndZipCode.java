package IfEsle;

import java.util.Scanner;

public class ContainsEAndZipCode {
    public static void main(String[] args) {

        Scanner qwer = new Scanner(System.in);

        System.out.println("enter word");
        String sd23 = qwer.next();

        if (sd23.contains("e")){
            System.out.println(sd23.indexOf('e'));
        }
        else
        System.out.println("doesn't contain 'e' ");


        Scanner q1 = new Scanner(System.in);

        System.out.println("enter zip code");
        int zip = q1.nextInt();

        if ((zip + "").length() == 5 && !(zip + "").contains("9") && !(zip + "").startsWith("0")){
            System.out.println("zip code is valid");
        } else
        System.out.println("invalid zip code");










    }
}
