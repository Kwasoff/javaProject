package problemSolving;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("enter your string");

        String str = sc.nextLine();
        str = str.replace(" ", "");

        String reverse = "";

        boolean isPalindrome = true;

        for (int a = str.length() - 1; a >= 0; a--) {
            reverse += str.charAt(a);
        }

            if (reverse.equalsIgnoreCase(str)){
                isPalindrome = true;
            }
            else{
                isPalindrome = false;
            }


        if (isPalindrome){
            System.out.println("palindrome");
        }
        else System.out.println("not a palindrome");

        //=============================================================================
        String word = "madam";

        int length = word.length();
        boolean isPalindrome1 = true;

        for (int i = 0; i < length / 2; i++){
            if (word.charAt(i) != word.charAt(length-1-i)){
                isPalindrome1 = false;
            }
        }
        System.out.println(isPalindrome1);







    }
}