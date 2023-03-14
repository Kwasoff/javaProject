package whileLoop;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {


       Scanner sc = new Scanner(System.in);

       String str, reverse = "";
       boolean isPalindrome;

       do{
           System.out.println("enter String");
           str = sc.next();

           for (int a = str.length() - 1; a >= 0; a--){
               reverse += str.charAt(a);
           }
           isPalindrome = reverse.equalsIgnoreCase(str);
           if (isPalindrome){
               System.out.println("palindrome");
           }
           else
               System.out.println("not a palindrome");
           reverse = "";


       }while(!isPalindrome);








    }
}
