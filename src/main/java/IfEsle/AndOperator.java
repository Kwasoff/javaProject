package IfEsle;

public class AndOperator {
    public static void main(String[] args) {

        if (2 < 3){
            System.out.println("hello");
        }
        if (5 < 10){
            System.out.println("hello");
        }

        // both in one statement

        if(2 < 3 && 5 < 10){
            System.out.println("bye bye");// only if both are true, it works
        }

        if(false && true){
            System.out.println("potato");// 1 of them is false....it doesn'n work
        }

        //=======================================================================

        String userName = "sunshine123";
        String password = "moonlight456!true";
        String actualEmail = "sunshine123@gmail.com";

        String enteredUsername = "sunshine123";
        String enteredPassword = "moonlight456!true";
        String enteredEmail = "sunshine123@gmail.com";


        if( enteredUsername.equals(userName) && enteredPassword.equals(password) && enteredEmail.equals(actualEmail)){
            System.out.println("logged in");
        }
        /*
        if (enteredUsername.equals(userName) && !enteredPassword.equals(password)){
        System.out.println("incorrect password, try again");
        }

        if (!enteredUsername.equals(userName)){
            System.out.println("username doesn't exist");
            }
         */


        else if(!enteredUsername.equals(userName) && enteredEmail.equals(actualEmail) && password.equals(enteredPassword)){
            System.out.println("recover username");
        }
        else if (enteredUsername.equals(userName) && enteredEmail.equals(actualEmail) && !enteredPassword.equals(password)){
            System.out.println("recover password");
        }
        else if (enteredUsername.equals(userName) && !enteredEmail.equals(actualEmail) && enteredPassword.equals(password)){
            System.out.println("recover email");
        }
        else{
            System.out.println("go fuck yourself, you are awesome");
        }









    }
}
