package switchStatement;

public class SwitchAgeGradeBoot0228 {
    public static void main(String[] args) {

        int age = 16;
        switch (age){

            case (16):
                System.out.println("you are under 18");
                break;
            case (18):
                System.out.println("you are eligible for vote");
                break;
            case (65):
                System.out.println("you are senior");
                break;
            default:
                System.out.println("give a valid age");
       }

       char grade = 'b';
        switch (Character.toUpperCase(grade)){
            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
            case 'C':
                System.out.println("well done");
                break;
            case 'D':
                System.out.println("passed");
                break;
            case 'F':
                System.out.println("try again");
                break;
            default:
                System.out.println("invalid grade");
        }
        System.out.println("your grade is " + grade);



    }
}
