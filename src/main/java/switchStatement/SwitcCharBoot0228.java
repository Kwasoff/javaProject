package switchStatement;

public class SwitcCharBoot0228 {
    public static void main(String[] args) {

        char q = 'a';
        switch (Character.toUpperCase(q)){
            case 'A':
            case 'O':
            case 'E':
            case 'U':
            case 'I':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");

        }







    }
}
