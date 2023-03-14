package primitiveDataTypes;

public class IntroToPrimitives {

    public static void main(String [] args){

        int age = 27;
        int number = 100;

        System.out.println(age);
        System.out.println(number);

        age = 28;

        System.out.println(age);

        //===============================================================

        byte myByte1 = 36; // declaring/creating variable
        byte myByte2 = -117;
        byte myByte3 = 127;
        byte myByte4 = -128;

        myByte1 = 50; // reassigning value
        System.out.println(myByte1); // 50

        myByte1 = 40;
        System.out.println(myByte1);

        myByte2 = 1;
        System.out.println(myByte2);

        myByte3 = 37;
        System.out.println(myByte3);

        myByte4 = 0;
        System.out.println(myByte4);


        short iceCreamPerDay = 5000;
        short iceCreamPerWeek = 25000;
        //short iceCreamPerMonth = 100000; // will not work because more than 32000

        System.out.println(iceCreamPerDay);
        System.out.println(iceCreamPerWeek);


        int numberOfFollowers = 1300;

        numberOfFollowers = 300000;
        numberOfFollowers = 2130000000;

        System.out.println(numberOfFollowers);

        long creditCard1 = 1111222233334444L;
        long creditCard2 = 123445463445566L;


    }


}
