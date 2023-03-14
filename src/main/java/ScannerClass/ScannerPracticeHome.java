package ScannerClass;

import java.util.Scanner;

public class ScannerPracticeHome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("input first number");
        int q1 = sc.nextInt();

        System.out.println("input second number");
        int q2 = sc.nextInt();

        System.out.println("sum is " + q1 + " + " + q2 + " = " + (q1 + q2));



        Scanner sc1 = new Scanner(System.in);

        System.out.println("month");
        String month = sc1.next();

        System.out.println("Raining");
        boolean isRaining = sc1.nextBoolean();


        if (!isRaining && month.contains("June") || month.contains("July") || month.contains("August")){
            System.out.println("summer");
        }
        else
            System.out.println("still waiting");


        Scanner team = new Scanner(System.in);

        System.out.println("enter chicago team");
        String t1 = team.next();

        if (t1.equalsIgnoreCase("fire")){
            System.out.println("mls");
        }
        else if (t1.equalsIgnoreCase("bulls")){
            System.out.println("nba");
        }
        else if (t1.equalsIgnoreCase("blackhawks")){
            System.out.println("nhl");
        }
        else if (t1.equalsIgnoreCase("cubs")) {
            System.out.println("baseball");
        }
        else if (t1.equalsIgnoreCase("bears")) {
            System.out.println("nfl");
        }
        else
            System.out.println("not professional sport team");



        Scanner player = new Scanner(System.in);

        System.out.println("enter player");
        String pl = player.next();

        if (pl.equalsIgnoreCase("mudryk")){
            System.out.println("ukraine");
        }
        else if (pl.equalsIgnoreCase("mount")) {
            System.out.println("england");
        }
        else if (pl.equalsIgnoreCase("pulisic")) {
            System.out.println("usa");
        }
else
            System.out.println("idk");

    }
}
