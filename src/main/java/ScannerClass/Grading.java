package ScannerClass;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Grade");
        int grade = sc.nextInt();

        if (grade < 0 || grade > 100){
            System.out.println("Invalid input");
        }
        else if (grade >= 0 && grade <= 20) {
            System.out.println("bad, study everything again");
        } else if (grade >= 21 && grade <= 40) {
            System.out.println("ok, study more");
        } else if (grade >= 41 && grade <= 60) {
            System.out.println("good, study more");
        } else if (grade >= 61 && grade <= 80) {
            System.out.println("very good, keep up");
        } else if (grade >= 81 && grade <= 95) {
            System.out.println("perfect, good job");
        } else if (grade >= 96 && grade <= 100) {
            System.out.println("exceptional, proud of you");
        }

        }
    }
