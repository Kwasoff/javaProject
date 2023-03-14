package switchStatement;

public class SwitchHomework {
    public static void main(String[] args) {

        char a = '@';

        switch (a){

            case '!':
                System.out.println("exclamation mark");
                break;
            case '?':
                System.out.println("question mark");
                break;
            case '%':
                System.out.println("modulus");
                break;
            case '#':
                System.out.println("hash");
                break;
            case '*':
                System.out.println("asterisk");
                break;
            case '@':
                System.out.println("at");
                break;
            case '$':
                System.out.println("dollar sign");
                break;
            default:
                System.out.println("another symbol");


        }
    }
}
