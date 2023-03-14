package forLoop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter String");
        String str = sc.nextLine();

        String reversestr = "";
        for (int a = str.length() - 1; a >=0 ; a--){
            reversestr += str.charAt(a);

        }
        System.out.println(reversestr);
    }
}
