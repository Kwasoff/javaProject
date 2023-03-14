package forLoop;

public class PracticeLoop {
    public static void main(String[] args) {

        for (int a = 10; a >= 1; a--){
            System.out.println("The value of a is: " + a);
        }
        System.out.println();

        for (int c = 10; c >= 0; c -= 2){
            System.out.println("The value of c is: " + c);
        }
        System.out.println();

        for ( int r = 1; r <= 15; r += 2){
            System.out.println("The value of r is: " + r);
        }
        System.out.println();

        int sum = 0;
        for (int d = 1; d <= 10; d++){
            System.out.println("The value of d is: " + d);

            sum = sum + d;
        }
        System.out.println("The sum is: " + sum);

        System.out.println();

        int s = 0;
        for (int t = 0; t <= 100; t += 2){
            System.out.println(t);
            s = s + t;
        }
        System.out.println("sum " + s);





    }
}
