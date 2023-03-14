package practice;

import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {

        Scanner q = new Scanner(System.in);

        System.out.println("enter 1st String");
        String str1 = q.nextLine();

        System.out.println("enter 2nd String");
        String str2 = q.nextLine();

        if (str1.equals(str2)){
            System.out.println("equal");
        }
        else
            System.out.println("not equal");


    }
}
