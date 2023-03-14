package strings;

public class StringManipulationHW {
    public static void main(String[] args) {

        //1--------------------------------------

        String str1 = "Hello, Universe!";
        char ch = 'o';
        System.out.println("String contains a specific character 'o': " + str1.contains("o"));//true

        //2----------------------------------------

        String str2 = "Hello, World!";
        int start = 7;
        int end = 12;
        System.out.println("Extracting the substring with index (7, 12): " + str2.substring(start, end));

        //3-------------------------------------------

        String str3 = "Good morning World";
        System.out.println(str3.indexOf('W'));
        System.out.println("Extracting letter 'W': " + str3.substring(13,14));

        //4---------------------------------------------------

        String str4 = "                I love coding            ";
        System.out.println("Removing extra white spaces from both ends: " + str4.trim());

        //5-------------------------------------------------------

        String str5 = "Learn as if you will live forever, live like you will die tomorrow";
        String o1 = str5.substring(13,14);
        System.out.println(o1);

        String o2 = str5.substring(27,28);
        System.out.println(o2);

        String o3 = str5.substring(46,47);
        System.out.println(o3);

        String o4 = str5.substring(59,60);
        System.out.println(o4);

        String o5 = str5.substring(61,62);
        System.out.println(o5);

        String o6 = str5.substring(64,65);
        System.out.println(o6);

        System.out.println(str5.replaceAll("o", ""));//removing all "o" to ""







    }
}
