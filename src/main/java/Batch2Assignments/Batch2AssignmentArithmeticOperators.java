package Batch2Assignments;

public class Batch2AssignmentArithmeticOperators {
    public static void main(String[] args) {

        int a = 100;
        int b = 20;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + a * b);
        System.out.println("a / b = " + a / b);

        System.out.println("square of a: " + a * a + " and square of b: " + b * b);

        System.out.println(Math.pow(7,4));

        int c = 132;
        int hundreds = c / 100;
        int tens = (c % 100) / 10;
        int ones = c % 10;

        System.out.println("hundreds " + hundreds);
        System.out.println("tens " + tens);
        System.out.println("ones " + ones);

        System.out.println("sum of digits " + (hundreds + tens + ones));

        System.out.println("reverse " + ones + tens + hundreds);






    }
}
