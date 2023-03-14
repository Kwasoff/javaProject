package switchStatement;

public class IntroToSwitch {
    public static void main(String[] args) {

        int num = 3;
        switch (num){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("number is not from 1 to 5");
        }

        //=======================================================================================

        String qw = "three";
        switch (qw){
            case "one":
                System.out.println(1);
                break;
            case "two":
                System.out.println(2);
                break;
            case "three":
                System.out.println(3);
                break;
            case "four":
                System.out.println(4);
            case "five":
                System.out.println(5);
            default:
                System.out.println("invalid number");
        }

        String asd = "three";

        if (asd.equalsIgnoreCase("one")){
            System.out.println(1);
        }
        else if (asd.equalsIgnoreCase("two")){
            System.out.println(2);
        }
        else if (asd.equalsIgnoreCase("three")) {
            System.out.println(3);
        }
            else if (asd.equalsIgnoreCase("four")){
                System.out.println(4);
            }
            else if (asd.equalsIgnoreCase("five")){
            System.out.println(5);
        }
                else
            System.out.println("invalid number");




    }
}
