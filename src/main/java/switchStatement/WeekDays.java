package switchStatement;

public class WeekDays {
    public static void main(String[] args) {

        int day = 5;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("invalid day");

        }
        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("weekday");
                break;
            case 6, 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("invalid");


        }

        char letter = 'A';
        switch (Character.toUpperCase(letter)){
            case 'A', 'O', 'I', 'E', 'U':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }





    }
}