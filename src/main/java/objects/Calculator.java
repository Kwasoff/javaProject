package objects;

public class Calculator {

    public int add(int x, int y){
        return x + y;

    }

    public int subtract(int x, int y){
        return x - y;
    }

    public int multiply(int x, int y){
        return x * y;
    }

    public double divide(int x, int y){
        if (y == 0){
            System.out.println("ERROR: division by zero");
        }
        return (double)x / y;
    }

    public int modulus (int x, int y){
        return x % y;
    }

    public int factorial (int x){
        int factorial = 1;
        for (int q = 1; q <= x; q++){
           factorial *= q;
        }
        return factorial;
    }

    public int squareRoot(int x){
        return x * x;
    }


    public static void main(String[] args) {


    Calculator calculator = new Calculator();

        int sum = calculator.add(2,3);
        System.out.println("The sum is: " + sum);

        int difference = calculator.subtract(6,8);
        System.out.println("The difference is: " + difference);

        int product = calculator.multiply(5,6);
        System.out.println("The product is: " + product);

        double quotient = calculator.divide(6,2);
        System.out.println("The quotient is: " + quotient);

        int remainder = calculator.modulus(10,3);
        System.out.println("The remainder is: " + remainder);

        int factorial = calculator.factorial(5);
        System.out.println("The factorial is: " + factorial);

        int squareRoot = calculator.squareRoot(4);
        System.out.println("The square root is: " + squareRoot);


    }


}
