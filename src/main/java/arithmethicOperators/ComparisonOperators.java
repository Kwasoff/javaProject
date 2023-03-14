package arithmethicOperators;

public class ComparisonOperators {
    public static void main(String[] args) {

        /*
        Comparison operators are used to compare 2 values
        > more than
        < less than
        >= more or equal
        <= less or equal
        == equal
        != not equal
         */

        byte p1 = 5;
        byte p2 = 10;
        System.out.println(p1>p2);//false
        System.out.println(p1<p2);//true

        System.out.println(p1>=p2);//false
        System.out.println(p1<=p2);//true
        System.out.println(p1==p2);//false
        System.out.println(p1!=p2);//true

        //==================================
        byte a1 = 1;
        byte a2 = 4;
        System.out.println(a1);
        System.out.println(a2);

        short b1 = 1000;
        short b2 = 1599;

        System.out.println(b1);
        System.out.println(b2);

        int c1 = 2023423454;
        int c2 = 83243434;

        System.out.println(c1);
        System.out.println(c2);

        long d1 = 213323434565L;
        long d2 = 2424234443L;

        System.out.println(d1);
        System.out.println(d2);


        System.out.println(a1<b1);
        System.out.println(a2>=b2);

        boolean r1 = a1<b1;
        System.out.println(r1);
        boolean r2 = a2>=b2;
        System.out.println(r2);

        System.out.println(a1!=b2);
        System.out.println(a2>b1);

        boolean q1 = a1!=b2;
        System.out.println(q1);
        boolean q2 = a2>b1;
        System.out.println(q2);

        System.out.println(a1==c1);
        System.out.println(a2!=c2);

        System.out.println(a1==c2);
        System.out.println(a2>=c1);

        System.out.println(d1>a1);
        System.out.println(d2!=a2);

        System.out.println(d1!=a2);
        System.out.println(d2<a1);

        System.out.println(d1<c1);
        System.out.println(d2==c2);

        System.out.println(d1==c2);
        System.out.println(d2!=c1);



        /*

        CONCATENATION works with
         */

        System.out.println(1+2+ "hello");//3hello
        System.out.println("hello" + 1+ 2);//hello12

        System.out.println("hello" + 3 + true);//hello3true

        System.out.println((1 + 2 == 3) + "hello" + 4 * 5);//===truehello20


    }
}
