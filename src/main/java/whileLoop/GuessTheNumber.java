package whileLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int randomNumber = new Random().nextInt(1, 100);

        Scanner sc = new Scanner(System.in);

        int input;

        do{

            System.out.println("print your number");
            input = sc.nextInt();

            if (input == randomNumber){
                System.out.println("coool! you win");
            }
            else if (input <= 0 || input > 100) {
                System.out.println("invalid input");
            }
            else if (input < randomNumber) {
                System.out.println("too low");
            }
            else if (input > randomNumber) {
                System.out.println("too high");
            }

        }while (input != randomNumber);











    }
}
