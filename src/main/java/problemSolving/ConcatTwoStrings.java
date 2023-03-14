package problemSolving;

import java.util.Scanner;

public class ConcatTwoStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter first word");
        String str1 = sc.next();

        System.out.println("enter second word");
        String str2 = sc.next();

        str2 = str2.toLowerCase();
        String str3 = str2.substring(0,1).toUpperCase();


        System.out.println(str1.toLowerCase() + str3 + str2.substring(1));

        System.out.println(str1.toUpperCase().charAt(0) + str1.substring(1) + str2.toUpperCase().charAt(0) + str2.substring(1));

        System.out.println(str1.toUpperCase() + " " + str2.toLowerCase() + " " + str2.toLowerCase() + " " + str1.toUpperCase());

        System.out.println(str1.toUpperCase().replace("A", "") + " " + str2.toUpperCase().replace("A", ""));

        System.out.println(str1.toUpperCase().charAt(0) + str1.toLowerCase().substring(1,2) + str2.toUpperCase().charAt(0) + str2.toLowerCase().substring(1,2) );

        System.out.println(str1.toUpperCase().charAt(str1.length()-2) + str1.toLowerCase().substring(str1.length()-1) + str2.toUpperCase().charAt(str1.length()-1) + str2.toLowerCase().substring(str1.length()-0));

        System.out.println(str1.toUpperCase().charAt(0) + "" + str2.toUpperCase().charAt(0));

    }
}
