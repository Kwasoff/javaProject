package forLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any word");

        String str1 = sc.nextLine().replace(" ", "");
        boolean isPalindrome = true;

        String reverseWord = "";

        for (int a = str1.length()-1; a >= 0; a--){

            reverseWord += str1.charAt(a);
            if (str1.equalsIgnoreCase(reverseWord)){
                isPalindrome = true;
            }
            else
                isPalindrome = false;
        }

        if (isPalindrome){
            System.out.println("the word is a palindrome");
        }
        else
            System.out.println("the word is NOT a palindrome");




    }
}
