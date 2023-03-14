package forLoop;

public class PracticeForHome {
    public static void main(String[] args) {


        int q;
        for (q = 0; q < 100; q++) {
            System.out.println(q);
        }
        System.out.println();

        int s;
        for (s = 0; s <= 20; s++){
            System.out.println(s);
        }
        System.out.println();
        int apple;
        for (apple = 1; apple <= 20; apple++){
            System.out.println(apple + " apples");
        }
        System.out.println();

        int x;
        int y;
        for (x = 2, y = 1; y <= 10; y++){
            System.out.println(x + " * " + y + " = " + x * y);
        }

        System.out.println();

        String str = "Java is fun";
        int we;
        for (we = 1; we < 6; we++){
            System.out.println(str);
        }

        System.out.println();

        int v;
        for (v = 10; v > 0; v--){
            System.out.println("The value of v is: " + v);
        }

        System.out.println();

        int m;
        for (m = 10; m >= 0; m = m - 2){
            System.out.println("The value of m is: " + m);
        }

        System.out.println();

        int num;
        for (num = 1; num <= 15; num = num + 2) {
            System.out.println("The value of num is: " + num);
        }

        System.out.println();

        int mm;
        int sum = 0;
        for (mm = 1; mm <= 10; mm++) {
            System.out.println("The value of mm is: " + mm);

            sum += mm;
        }
            System.out.println("The sum of first 10 numbers is: " + sum);



    }
}
