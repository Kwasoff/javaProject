package ScannerClass;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month");
        String str1 = sc.nextLine();

        if (str1.equalsIgnoreCase("December")){
            System.out.println("Winter");
        }
        else if (str1.equalsIgnoreCase("January")){
            System.out.println("winter");
        }
        else if (str1.equalsIgnoreCase("February")){
            System.out.println("winter");
        }
        else if (str1.equalsIgnoreCase("March")) {
            System.out.println("spring");
        }
            else if (str1.equalsIgnoreCase("April")) {
            System.out.println("spring");
        }
                else if (str1.equalsIgnoreCase("May")) {
                System.out.println("spring");
            }
                    else if (str1.equalsIgnoreCase("June")) {
                System.out.println("summer");
            }
                        else if (str1.equalsIgnoreCase("July")) {
                System.out.println("summer");
            }
                            else if (str1.equalsIgnoreCase("August")) {
                System.out.println("summer");
            }
                                else if (str1.equalsIgnoreCase("September")) {
                System.out.println("autumn");
            }
                                    else if (str1.equalsIgnoreCase("October")) {
                System.out.println("autumn");
            }
                                        else if (str1.equalsIgnoreCase("November")) {
                System.out.println("autumn");
            }
                                        else
                                            System.out.println("invalid input");



    }
}
