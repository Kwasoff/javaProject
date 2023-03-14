package arithmethicOperators;

public class AssignmentEqualOperators {

    public static void main(String [] args){

        /*

        = assignment operator (when you give value to variable)

        == equal equal operator (compares two variables if they equal or not)

        != not equal operator (compares if two variables are not equal)

         */

        int number1 = 10;//=====>assignment
        int number2 = 8;
        System.out.println(number1 == number2);// false

        System.out.println(100 == 100);// true

        boolean isEqual = 100 == 100 + 1;//=====>false
        System.out.println(isEqual);

        boolean isEven = 80 % 2 == 0;// if number can be divided by 2
        System.out.println(isEven);//true

        isEven = 4%2==1;//false

        isEven = 1424354632430L % 2 == 0;//===>true
        System.out.println(isEven);


        System.out.println(30 %7 != 0);









    }
}
