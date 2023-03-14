package strings;

public class StringCharAt {
    public static void main(String[] args) {

        String welcomeSign = "Hello everyone! Welcome to Chicago";
        char c = welcomeSign.charAt(14);
        System.out.println(c);

        char cc = welcomeSign.charAt(2);
        System.out.println(cc);

        char ccc = welcomeSign.charAt(0);
        System.out.println(ccc);



        System.out.println(welcomeSign.charAt(welcomeSign.length() - 1));// last letter...length starts with 1...charAt starts with 0..so it is -1









    }
}
