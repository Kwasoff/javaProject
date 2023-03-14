package strings;

public class StringManipulationHomework {
    public static void main(String[] args) {

        String message = "Hello everyone, Let's do Java String exercises";
        System.out.println("The character at position 10 is " + message.charAt(10));

        System.out.println("The length of the String message is " + message.length());

        System.out.println("ALL IN UPPERCASE: " + message.toUpperCase());

        System.out.println("all in lowercase: " + message.toLowerCase());

        System.out.println("letter #5 is " + message.charAt(4));

        System.out.println("Last letter is " + message.charAt(message.length() -1));

        char firstToLowercase = message.charAt(0);
        System.out.println("First letter in lowercase: " + Character.toLowerCase(firstToLowercase));

        char lastToUpperCase = message.charAt(45);
        System.out.println("Last letter in uppercase: " + Character.toUpperCase(lastToUpperCase));








    }

}
