package IfEsle;

public class IntroToIfElse {
    public static void main(String[] args) {

    int a = 10;
    int b = 5;
        System.out.println("I WILL COMPARE A AND B BELOW");

        if (a > b){
            System.out.println("a is more than b");
        }

        else {
            System.out.println("a is less than b");
        }

        System.out.println("I've already compared a and b");// outside ifElse




        int number1 = 100;
        int number2 = 50;

        if (number1 / number2 == 2){
            System.out.println("YES, two!");
        }

        else {
            System.out.println("Not two!");
        }


        String elon = "Tesla SpaceX Paypal Twitter";

        if(elon.contains("Paypal")){
            System.out.println("He owned Paypal");
        }
        else {
            System.out.println("He owned Facebook");
        }


        int a1 = 44;
        int a2 = 444;

        if(a1>=a2){

            System.out.println("go right");
        }
        else{
            System.out.println("go left");
        }

        if (a1<a2){
            System.out.println("good");
        }
        else{
            System.out.println("bad");
        }

        String q1 = "Chicago is windy city";
        if(q1.contains("sunny")){
            System.out.println("I will live here");
        }
        else{
            System.out.println("I will leave");
        }

        if(q1.endsWith("town")){
            System.out.println("I don't like it");
        }
        else{
            System.out.println("It's cool");
        }

        if(q1.isEmpty()){
            System.out.println("Check it");
        }
        else{
            System.out.println("Everything is ok");
        }

        if(q1.isBlank()){
            System.out.println("123");
        }
        else{
            System.out.println("111");
        }









    }
}
