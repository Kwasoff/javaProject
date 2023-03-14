package IfEsle;

public class HomeworkIfElse {
    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 7;
        int n3 = 1;
        if (n1 == n2 || n1 == n3 || n2 == n3) {
            System.out.println("Two of the numbers are equal");
        } else
            System.out.println("None of the numbers are equal");

        //=====================================================================

        int number = 15;
        if (number % 3 == 0 || number % 5 == 0) {
            System.out.println("Multiple of 3 or 5");
        } else
            System.out.println("Not a multiple of 3 or 5");

        //======================================================================

        int num1 = 13;
        int num2 = 23;
        if ((num1 + num2) % 2 == 0) {
            System.out.println("Even");
        } else
            System.out.println("Odd");

        //====================================================================

        int numberToCheck = 21;
        int NumberOfDevisors = 0;

        for (int devisor = 1; devisor <= numberToCheck; devisor++){
            if (numberToCheck % devisor == 0){
                NumberOfDevisors++;//my logic: there are only devisors: 1 and number itself...if there are more devisors => number is not prime
            }

        }
        if (NumberOfDevisors == 2){
        System.out.println("prime number");
    }
        else
        System.out.println("not prime");














    }
}
