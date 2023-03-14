package whileLoop;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int counter;
        do {
            System.out.println("Enter your String");
            String str = sc.next();
            counter = 0;

            for (int a = 0; a < str.length(); a++) {

                str = str.toLowerCase();

                if (str.charAt(a) == 'a' || str.charAt(a) == 'e' || str.charAt(a) == 'i' || str.charAt(a) == 'o' ||
                        str.charAt(a) == 'u') {
                    counter++;
                }
            }
            System.out.println("The entered String vowels: " + counter);
            }
            while (counter != 10) ;



    }
}