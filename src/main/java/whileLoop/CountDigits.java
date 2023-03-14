package whileLoop;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int counter;

        do{
            System.out.println("Enter your String");
            String str = sc.next();
            counter = 0;

            for (int a = 0; a < str.length(); a++){
                if (str.charAt(a) == '0' || str.charAt(a) == '1' || str.charAt(a) == '2' || str.charAt(a) == '3' ||
                    str.charAt(a) == '4' || str.charAt(a) == '5' || str.charAt(a) == '6' || str.charAt(a) == '7' ||
                    str.charAt(a) == '8' || str.charAt(a) == '9'){
                    counter++;
                }

            }
            System.out.println("The entered string number of digits: " + counter);

        } while (counter != 3);

        System.out.println("you entered a String with 3 digits!");





    }
}
