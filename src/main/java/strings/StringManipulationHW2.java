package strings;

public class StringManipulationHW2 {
    public static void main(String[] args) {

        //1. Check if a given String ends with a specific substring------------------------------
        String s1 = "Chelsea is the pride of London";
        System.out.println("Checking if the String doesn't end with 'Chicago': " + !s1.endsWith("Chicago"));//true

        //2. Extract a substring from a given String starting from a specific index----------------

        System.out.println("Extracting 'Chelsea' from the String: " + s1.substring(s1.indexOf("C"), s1.indexOf(" is")));//Chelsea

        //3.Replace all occurrences of a specific substring in a given String---------------------------

        s1 = s1.replace('C', 'X');
        s1 = s1.replace('h', 'X');
        s1 = s1.replace('e', 'X');
        s1 = s1.replace('l', 'X');
        s1 = s1.replace('s', 'X');
        s1 = s1.replace('a', 'X');
        s1 = s1.replace('i', 'X');
        s1 = s1.replace('t', 'X');
        s1 = s1.replace('p', 'X');
        s1 = s1.replace('r', 'X');
        s1 = s1.replace('d', 'X');
        s1 = s1.replace('o', 'X');
        s1 = s1.replace('f', 'X');
        s1 = s1.replace('L', 'X');
        s1 = s1.replace('n', 'X');

        System.out.println("Replacing all occurrences to 'X': " + s1);

        //4.Retrieve the substring between two specific indexes in a given String.

        String s2 = "Deeeeeeetroooit Basketball";

        System.out.println(s2.substring(s2.indexOf("De"), s2.indexOf(" B")) + " " + s2.substring(s2.indexOf("De"), s2.indexOf(" B")) + " " + s2.substring(s2.indexOf("B")) + " " + s2.substring(s2.indexOf("B")));

        //5. Find the index of the last character in a given String--------------------

        int indexOfLast = s2.length()-1;
        System.out.println("The index of the last character is " + indexOfLast);

        //6. Check if a given String starts with a specific substring----------------------------------

        System.out.println("Checking if a given String starts with 'Detroit': " + s2.startsWith("Detroit"));//false

        //7. Replace the first occurrence of a specific character in a given String-----------------------

        System.out.println("Replacing the first occurrence 'D' to 'B': " + s2.replace('D', 'B'));

        //8. Retrieve the index of the nth occurrence of a specific character in a given String---------------------

        int index1 = s2.indexOf('B');
        System.out.println("Index of 'B' is " + index1);//16

        int index2 = s2.indexOf('L');
        System.out.println("Index of 'L' is " + index2);//-1

        //9. Remove all whitespace characters from a given String---------------------------------------

        System.out.println("Removing all whitespace characters: " + s2.replace(" ", ""));

        //10. Convert all the characters in a given String to uppercase--------------------------------

        System.out.println("Converting all the characters to uppercase: " + s2.toUpperCase());














    }
}
