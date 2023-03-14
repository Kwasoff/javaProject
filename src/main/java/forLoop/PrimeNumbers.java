package forLoop;

public class PrimeNumbers {
    public static void main(String[] args) {

        int a = 23;
        boolean isPrime = true;

        for (int v = 2; v < a; v++){
            if (a % v == 0) {
                isPrime = false;
                break;
            }
            }
            if (isPrime){
                System.out.println("number is prime");
            }
            else
                System.out.println("number is not prime");


    }
}
