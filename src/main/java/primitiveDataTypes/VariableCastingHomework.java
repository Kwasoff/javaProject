package primitiveDataTypes;

public class VariableCastingHomework {

    public static void main(String [] args){

        byte byteNum1 = 37;
        short shortNum1 = -100;
        int int_Num_1 = 333777;
        long $longNum1 = 12333656773478L;

        float floatNum1 = 45.565f;
        double doubleNum1 = 23244.434;
        //=======================BYTE===============

        byteNum1 = (byte)shortNum1;
        System.out.println(byteNum1);

        byteNum1 = (byte)int_Num_1;
        System.out.println(byteNum1);

        byteNum1 = (byte)$longNum1;
        System.out.println(byteNum1);

        byteNum1 = (byte)floatNum1;
        System.out.println(byteNum1);

        byteNum1 = (byte)doubleNum1;
        System.out.println(byteNum1);

        //=======================SHORT=========================

        shortNum1 = byteNum1;
        System.out.println(shortNum1);

        shortNum1 = (short)int_Num_1;
        System.out.println(shortNum1);

        shortNum1 = (short)$longNum1;
        System.out.println(shortNum1);

        shortNum1 = (short)floatNum1;
        System.out.println(shortNum1);

        shortNum1 = (short)doubleNum1;
        System.out.println(shortNum1);

        //=====================INT==================================

        int_Num_1 = byteNum1;
        System.out.println(int_Num_1);

        int_Num_1 = shortNum1;
        System.out.println(int_Num_1);

        int_Num_1 = (int)$longNum1;
        System.out.println(int_Num_1);

        int_Num_1 = (int)floatNum1;
        System.out.println(int_Num_1);

        int_Num_1 = (int)doubleNum1;
        System.out.println(int_Num_1);

        //=================LONG====================

        $longNum1 = byteNum1;
        System.out.println($longNum1);

        $longNum1 = shortNum1;
        System.out.println($longNum1);

        $longNum1 = int_Num_1;
        System.out.println($longNum1);

        $longNum1 = (long)floatNum1;
        System.out.println($longNum1);

        $longNum1 = (long)doubleNum1;
        System.out.println($longNum1);

        //==============FLOAT============================

        floatNum1 = byteNum1;
        System.out.println(floatNum1);

        floatNum1 = shortNum1;
        System.out.println(floatNum1);

        floatNum1 = int_Num_1;
        System.out.println(floatNum1);

        floatNum1 = $longNum1;
        System.out.println(floatNum1);

        floatNum1 = (float)doubleNum1;
        System.out.println(floatNum1);

        //======================DOUBLE==========================

        doubleNum1 = byteNum1;
        System.out.println(doubleNum1);

        doubleNum1 = shortNum1;
        System.out.println(doubleNum1);

        doubleNum1 = int_Num_1;
        System.out.println(doubleNum1);

        doubleNum1 = $longNum1;
        System.out.println(doubleNum1);

        doubleNum1 = floatNum1;
        System.out.println(doubleNum1);








    }

}
