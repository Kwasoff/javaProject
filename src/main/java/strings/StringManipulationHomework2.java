package strings;

public class StringManipulationHomework2 {
    public static void main(String[] args) {

       //1------------------------------------------------
        String a1 = "Hello world";
        System.out.println("The index of w is " + a1.indexOf('w'));

        //2-----------------------------------------------

        String a2 = "Hello";
        System.out.println("The first letter is " + a2.charAt(0));

        //3---------------------------------------------------

        String a3 = "HELLO";
        System.out.println("String to lowercase: " + a3.toLowerCase());

        //4----------------------------------------------------

        String a4 = "hello";
        System.out.println("String to UPPERCASE: " + a4.toUpperCase());

        //5------------------------------------------------------

        System.out.println(a4.equals(a2));//false

        //6---------------------------------------------------------

        String a5 = "the quick brown fox";

        String c1 = a5.substring(0,3);
        System.out.println(c1);
        String d1 = c1.toUpperCase().charAt(0) + c1.substring(1);
        System.out.println(d1);

        String c2 = a5.substring(4,9);
        System.out.println(c2);
        String d2 = c2.toUpperCase().charAt(0) + c2.substring(1);
        System.out.println(d2);

        String c3 = a5.substring(10,15);
        System.out.println(c3);
        String d3 = c3.toUpperCase().charAt(0) + c3.substring(1);
        System.out.println(d3);

        String c4 = a5.substring(16);
        System.out.println(c4);
        String d4 = c4.toUpperCase().charAt(0) + c4.substring(1);
        System.out.println(d4);

        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4);

        //7----------------------------------------
        char l1 = a2.charAt(4);
        char l2 = a2.charAt(3);
        char l3 = a2.charAt(2);
        char l4 = a2.charAt(1);
        char l5 = a2.charAt(0);
        System.out.println(l1 + "" + l2+ l3 + l4+ l5);

        //8-----------------------------------------????????????????????????????????????????
        String a6 = "Hello World";

        char v1 = a6.charAt(1);
        char v2 = a6.charAt(4);
        char v3 = a6.charAt(7);

        int w1 = v1 = 1;
        int w2 = v2 = 1;
        int w3 = v3 = 1;
        int numberOfVowels = w1 + w2 + w3;
        System.out.println(numberOfVowels);

        //9--------------------------------------------

        String b1 = "World";
        System.out.println(a2.concat(b1));

        //10----------------------------------------------

        System.out.println(a4.equalsIgnoreCase(a3));//true

        //11----------------------------------------------

        System.out.println(a6.length());

        //12------------------------------------------------

        System.out.println("The third character of 'Hello' is " + a2.charAt(2));

        //13-------------------------------------------------------------

        System.out.println("The index of the first occurence of the letter l in 'Hello World' is " + a6.indexOf('l'));

        //14--------------------------------------------------------------------

        String b4 = new String("hello");
        System.out.println(a4.equals(b4));//true
        System.out.println(a4 == b4);//false

        //15------------------------------------------------------------------

        System.out.println(a4.equals(a3));//false
        System.out.println(a4 == a3);//false

        //16------------------------------------------------------------------

        String a7 = "HELLO WORLD";
        System.out.println(a7.toLowerCase());

        //17------------------------------------------------------------------

        String a8 = "hello world";
        System.out.println(a8.toUpperCase());

        //18------------------------------------------------------------------

        System.out.println(a6.replace('l', 'r'));

        //19th is the same as 6th
















    }
}
