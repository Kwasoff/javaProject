package practice;

import java.util.Scanner;

public class ToLOwercase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter string");
        String str = sc.nextLine();

        str = str.toLowerCase();
        System.out.println("lowercased string: " + str);
    }
}
