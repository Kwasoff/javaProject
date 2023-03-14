package whileLoop;

public class WhileLoop {
    public static void main(String[] args) {

        int a = 1;
        while (a <= 10){
            System.out.println(a);
            a++;
        }

        int b = 1;
        while (b <= 100){
           if (b % 2 == 0) {
               System.out.println(b); }
            b++;

        }
        int c = 1;
        while (c <= 10){
            System.out.println("Good morning everyone!");
            c++;
        }

        for (int num = 1; num <= 10; num++){
            System.out.println("Good morning everyone!");
        }

        int q = 100;
        while (q >= 1){
            if (q % 2 != 0){
                System.out.println(q);
            }
            q--;
        }

        for (int r = 100; r >= 1; r--) {
            if (r % 2 != 0) {
                System.out.println(r);
            }
        }

        int qwe = 1;
        while (qwe <= 31){
            System.out.println(qwe + " January 2023");
            qwe++;
        }

        for (int rer = 1; rer <= 31; rer++){
            System.out.println(rer + " January 2023");
        }

        int www = 30;
        int sss = 2;
        boolean isTrue = true;

        while (sss < www) {
            if (www % sss == 0) {
                isTrue = false;
            }
            sss++;
        }
            if (isTrue){
                System.out.println("number is prime");
            }
            else
                System.out.println("number is not prime");









    }


}
