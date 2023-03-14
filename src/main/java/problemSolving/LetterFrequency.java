package problemSolving;

import java.util.Scanner;

public class LetterFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word");
        String str = sc.next();

        for (int a = 0; a < str.length(); a++){
            int counter = 0;
            for (int b = 0; b < str.length(); b++){
                if (str.charAt(a) == str.charAt(b)){
                    counter++;
                }
            }
            System.out.println(str.charAt(a) + ": " + counter);
        }





    }
}
