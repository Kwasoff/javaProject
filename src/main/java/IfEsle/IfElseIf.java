package IfEsle;

public class IfElseIf {
    public static void main(String[] args) {

        if(2 < 5){
            System.out.println("2 is less than 5");//java prints first true only
        }
        else if(2 > 5){
            System.out.println("2 is more than 5");
        }
        else if (3 == 3){
            System.out.println("qwerty");
        }
        else {
            System.out.println("2 is equal to 5");
        }
        //-------------------------------------------------------

        if(1 > 5){
            System.out.println("good");// it will print NOTHING
        }
        //------------------------------------------------------------
        String actualPassword = "abc123";
        String enteredPassword = "ABC123";

        if(actualPassword.equals(enteredPassword)){
            System.out.println("Successfully logged in");
        }
        else{
            System.out.println("Incorrect password");
        }










    }
}
