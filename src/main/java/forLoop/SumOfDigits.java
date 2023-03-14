package forLoop;

public class SumOfDigits {
    public static void main(String[] args) {

        int sum = 0;
        for (int a = 1234; a > 0; a /= 10 ){
            sum += a % 10;
        }
        System.out.println(sum);
    }
}
