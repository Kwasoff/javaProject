package strings;

public class StringEqualsHomework {
    public static void main(String[] args) {

        String hello1 = "Hello World!";
        String hello2 = "Hello world!";
        String hello3 = new String("HelloWorld!");

        System.out.println(hello1.equalsIgnoreCase(hello2));//true
        System.out.println(hello1.equals(hello3));//false
        System.out.println(hello1.equals(hello2));//false

        System.out.println(hello1.toLowerCase().equals(hello2.toLowerCase()));//true
        System.out.println(hello1.toUpperCase().equals(hello3.toUpperCase()));//false




    }

}
