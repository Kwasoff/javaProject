package primitiveDataTypes;

public class PracticeVariableDeclaration {

    public static void main(String [] args){

        /*
        multiline comment part. i can type anything

        1. Declare variable(create variable)
        2. Assign value to variable (put value inside variable)
        3. Reassign value to variable (put new value to the same variable)



        */

        //====== single line comment

        byte myByte;
        byte _anotherByte;

        myByte = 5;
        myByte = 10;
        System.out.println(myByte);

        myByte = 20;
        System.out.println(myByte);

        _anotherByte = 100;
        System.out.println(_anotherByte);

        //=================================

        short myShort1 = -32000;
        System.out.println(myShort1);

        myShort1 = -31456;
        System.out.println(myShort1);


        short myShort2 = -400;
        System.out.println(myShort2);

        myShort2 = -300;
        System.out.println(myShort2);


        short myShort3 = 0;
        System.out.println(myShort3);

        myShort3 = 1;
        System.out.println(myShort3);

        short myShort4 = 45;
        System.out.println(myShort4);

        myShort4 = 50;
        System.out.println(myShort4);


        short myShort5 = 31500;
        System.out.println(myShort5);

        myShort5 = 31600;
        System.out.println(myShort5);

        //================================================

        int myInt1 = -234466;
        System.out.println(myInt1);

        myInt1 = -1232343;
        System.out.println(myInt1);


        int myInt2 = -324345;
        System.out.println(myInt2);

        myInt2 = -342434;
        System.out.println(myInt2);

        int myInt3 = 47577;
        System.out.println(myInt3);

        myInt3 = 2343345;
        System.out.println(myInt3);

        int myInt4 = 346784588;
        System.out.println(myInt4);

        myInt4 = 234334;
        System.out.println(1234);

        int myInt5 = 123123;
        System.out.println(myInt5);

        myInt5 = 3245;
        System.out.println(myInt5);

        myInt5 = myInt4;
        System.out.println(myInt5);

        myInt5 = myInt4 = myInt3 = myInt2 = myInt1;
        System.out.println(myInt5);


        //============================================================================

        long myLong1 = -1233546567;
        System.out.println(myLong1);

        myLong1 = -123445555;
        System.out.println(myLong1);


        long myLong2 = -2344354;
        System.out.println(myLong2);

        myLong2 = -344355;
        System.out.println(myLong2);

        long myLong3 = 123455467;
        System.out.println(myLong3);

        myLong3 = 1232343;
        System.out.println(myLong3);

        long myLong4 = 123456789087654L;
        System.out.println(myLong4);

        myLong4 = 132345677654323456L;
        System.out.println(myLong4);

        long myLong5 = 1233456789974L;
        System.out.println(myLong5);

        myLong5 = myInt5;
        System.out.println(myLong5);

        //==================================

        byte byteNumber = 10;
        short shortNumber = 2;
        int intNumber = 40;
        long longNumber = 35500;

        longNumber = byteNumber;
        /*
        byteNumber can not fit shortNumber because byte is smaller than short. we are not watching numbers!!! only size of containers matter
         */


        // CASTING - is used to store larger variable values into smaller variable values
        intNumber = (int)longNumber;

        byteNumber = (byte)intNumber;

        shortNumber = (byte)longNumber;
        System.out.println(shortNumber);

        longNumber = 2000;
        shortNumber = (short)longNumber;
        System.out.println(shortNumber);

        shortNumber = -100;
        byteNumber = (byte)shortNumber;
        System.out.println(byteNumber);

        longNumber = 5;
        byteNumber = (byte)longNumber;
        System.out.println(byteNumber);

        intNumber = 32000;
        shortNumber = (short)intNumber;
        System.out.println(shortNumber);

        intNumber = 127;
        shortNumber = (byte)intNumber;
        System.out.println(shortNumber);

























    }
}
