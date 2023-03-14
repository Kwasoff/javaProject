package practice;

import java.util.Scanner;

public class Replacement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your sentence");
        String str = sc.nextLine();


        System.out.println(str.replaceAll("[aieuoAIEUO]", "X"));
    }
}
