package IfEsle;

public class IfElseHomework {
    public static void main(String[] args) {

        //1.==================================================================================
        int a1 = -40;

        if (a1 > 0){
            System.out.println("positive");
        }
        else if (a1 == 0){
            System.out.println("zero");
        }
        else{
            System.out.println("negative");
        }
        //2.==================================================================================

        /*
        2. Write a program that  checks whether the year is a leap year or not. A year is a leap
        year if it is divisible by 4 but not divisible by 100, or if it is divisible by 400. The
        program should print out a message indicating the result.
         */

        int year = 2023;
        if (year % 4 ==0 && year != 100 || year % 400 == 0){
            System.out.println(" leap year");
        }
        else {
            System.out.println("it's not leap year");
        }
        //==================================================================================

        /*
        int num1 = 3;
        int num2 = 123;
        3. Write a program that checks which int is larger. The program should print out a message indicating the result.
         */
        int num1 = 3;
        int num2 = 123;
        if (num1 > num2){
            System.out.println("num1 is bigger than num2");
            }
        else if (num2 > num1){
            System.out.println("num2 is bigger than num1");
        }
        else{
            System.out.println("num1 and num2 are equal");
        }
        //===================================================================================
        /*
        double tempInFahrenheit = 77.3;

        4. Write a program that checks whether the temperature is below freezing (32 degrees
        or lower), above boiling (212 degrees or higher), or in between. The program should
        print out a message indicating the result.

         */
        double tempInFahrenheit = 77.3;
        if (tempInFahrenheit <= 32){
            System.out.println("weather is below freezing");
        }
        else if (tempInFahrenheit >= 212){
            System.out.println("above boiling");
        }
        else{
            System.out.println("in between");
        }
        //=======================================================================================
        /*
        byte month = 6;
        5. Write a program that checks the months and tells which season it is (winter, spring,
        summer, or fall). Assume that winter starts in December, spring starts in March,
        summer starts in June, and fall starts in September. The program should print out a
        message indicating the result.
         */

        byte month = 13;
        if ( month > 0 && month <= 2 || month == 12){
            System.out.println("winter");
        }
        else if (month > 2 && month <=5){
            System.out.println("spring");
        }
        else if (month >= 6 && month < 9 ){
            System.out.println("summer");
        }
        else if (month >= 9 && month < 12){
            System.out.println("winter");
        }
        else{
            System.out.println("you are Martian");
        }
    }
}
