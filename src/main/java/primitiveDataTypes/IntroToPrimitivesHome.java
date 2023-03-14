package primitiveDataTypes;

public class IntroToPrimitivesHome {

    public static void main(String [] args){

    byte byte1 = -128;
    byte byte2 = 1;
    byte byte3 = 127;

    System.out.println(byte1);
    System.out.println(byte2);
    System.out.println(byte3);

    byte1 = -40;
    System.out.println(byte1);

    byte3 = 100;
    System.out.println(byte3);

    //====================================================================================

    short short1 = -32000;
    short short2 = 32000;

    System.out.println(short1);
    System.out.println(short2);

    short1 = -15000;
    System.out.println(short1);

    short2 = 100;
    System.out.println(short2);

        //==================================================================================

        int int1 = -20000001;
        int int2 = 2111222333;

        System.out.println(int1);
        System.out.println(int2);

        int1 = -325467;
        System.out.println(int1);

        //================================================================================

        long long1 = 1347646578768476L;
        System.out.println(long1);

        long1 = 34745756473573L;
        System.out.println(long1);

        //================================================================================

        float fractionalNum1 = 1.5F;
        float fractionalNum2 = 12.1133f;

        System.out.println(fractionalNum1);
        System.out.println(fractionalNum2);

        fractionalNum1 = 11.44f;
        System.out.println(fractionalNum1);

        fractionalNum2 = 3456.3844934f; //=====> QUESTION NUMBER 1---- okrugl9et (8 decimals)
        System.out.println(fractionalNum2);

        //=================================================================================

        double frNumber1 = 1234.1234567890000;
        double frNumber2 = 34354535.43243423454645;

        System.out.println(frNumber1);
        System.out.println(frNumber2);


        frNumber1 = 345.8756;
        System.out.println(frNumber1);

        frNumber2 = 666666.1111111118;
        System.out.println(frNumber2);

        frNumber2 = 666666.11111111118; //=====> QUESTION NUMBER 2--- cut 8 (16 decimals)
        System.out.println(frNumber2);

        //====================================================================================================

        boolean isTrue = true;
        System.out.println(isTrue);

        boolean isHere = false;
        System.out.println(isHere);

        //=========================================================================================

        char char1 = 'I';
        char char2 = 'o';

        System.out.println(char1);
        System.out.println(char2);


        char1 = 'R';
        System.out.println(char1);

        char2 = ' ';
        System.out.println(char2);

        char char3 = '@';
        System.out.println(char3);

        //==================================================================================

        String text = "Hello Codewise";
        String hello = new String("Hello world");

        System.out.println(text);
        System.out.println(hello);

        text = "Hello Chicago";
        System.out.println(text); //=========> QUESTION NUMBER 3

        hello = "12345";
        System.out.println(hello);

        //==========CONCATENATION=========

        String typing = "Hello everybody";
        int dot = 123;

        System.out.println(typing);
        System.out.println(dot);

        String newText = typing + dot;
        System.out.println(newText);




    }
}
