package practice;

import java.util.Scanner;

public class StringToUppercase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter string");
        String str = sc.nextLine();

        str = str.toUpperCase();
        System.out.println("uppercased string: " + str);



    }

}
