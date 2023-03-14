package arithmethicOperators;

public class IntroToModulus {

    public static void main(String[] args) {

        /*
        % - modulus returns you the remainder after division

         */

        int a = 12;
        int b = 5;
        int c = a % b; //2
        System.out.println(c);

        System.out.println(100 % 30);//10 ======> ostatok posle deleni9
        System.out.println(100 % 20);//0=======> = 5 without remainder

        System.out.println(12.6 % 3);

        System.out.println(25 % 10);//5
        System.out.println(90 % 40);//10
        System.out.println(90 % 20);//10
        System.out.println(5 % 4);//1

        /*
        even numbers can be divided by 2
        odd can't be divided by 2
        */

        System.out.println(7 % 2);//1 =====> odd
        System.out.println(8 % 2);//0 =====>even


    }
}
