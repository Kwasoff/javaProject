package whileLoop;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        int counter = 0;
        int numberOfNumbers = 0;

        while (true) {
            System.out.println("enter positive number");
            a = sc.nextInt();
            if (a == 0) {
                continue;
            } else if (a < 0) {
                break;
            }
            counter += a;
            numberOfNumbers++;
        }
            System.out.println("Sum of numbers: " + counter);
            System.out.println("Average: " + counter / numberOfNumbers);

    }
}
