package primitiveDataTypes;

public class PracticeDoubleFloat {

    public static void main(String [] args){

        /*
        float and double are variables that store decimal numbers
        double is larger than float
        double is the most precise(точный) variable
        Java thinks that all decimal numbers are double
        to make sure float is float put F/f in the end
        both double and float can store whole numbers as well
         */

        double priceOfBread = 4.99;
        double priceOfApples = 3.994444444444444444444444444444444444444444;
        System.out.println(priceOfApples);

        priceOfBread = 223232343454545.234556;
        System.out.println(priceOfBread);

        priceOfBread = 358855.234;
        System.out.println(priceOfBread);

        priceOfApples = 44.66;
        System.out.println(priceOfApples);

        priceOfApples = 1234567.1111111111;
        System.out.println(priceOfApples);

        byte byte1 = 2;
        short short1 = 5;
        int int1 = 7;
        long long1 = 345;
        float float1 = 3545.64F;
        double double1 = 2343;

        float1 = (float)double1;
        double1 = float1;

        double1 = long1;
        long1 = (long)double1;
        System.out.println(long1);

        float float2 = 34.567F;
        System.out.println(float2);

        double double2 = 1232323.343324; //======= 7 digits before dot
        System.out.println(double2);

        double2 = 44.45;

        float2 = (float)double2;
        System.out.println(float2);


        float float3 = 234345.1f;
        System.out.println(float3);

        double double3 = 113322.3435445;
        System.out.println(double3);

        double3 = float3;
        System.out.println(double3);

        float3 = (float)double3;
        System.out.println(float3);

        float float4 = 1111.111f;
        System.out.println(float4);

        double double4 = 3456;
        System.out.println(double4);

        long long12 = 3243455456L;
        System.out.println(long12);

        long12 =(long)double4; //=======double is the biggest number
        System.out.println(long12);

        float4 = 2133234.434f; //=======rounding up (okrygl9et)
        System.out.println(float4);

        float4 = (float)double4;
        System.out.println(float4);

        double4 = 3553.123;//========== it just cuts fractional numbers
        long12 = (long)double4;

        System.out.println(long12);

        float float5 = 123324.3423f;
        System.out.println(float5);

        double double5 = 1234567.1234567891;
        /*
        17 digits => java rounds up
        7 numbers before dot is max. ==== 8 numbers before dot ===> it shows crazy result with E
        10 digits => max after dot

         */
        System.out.println(double5);



        float float6 = 343.3545564f;
        float float7 = 11111.23245f;
        float float8 = 11111.344453f;
        float float9 = 3434455.444f;
        float float10 = 3.3f;
        float float11 = 4444.4444f;




















    }




}
