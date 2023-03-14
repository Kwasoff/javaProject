package IfEsle;

public class IfIf {

    public static void main(String[] args) {
        String weather = "warm and rainy";

        if (weather.equals("cold")){
            System.out.println("cold, stay home!");
        }
        else if (weather.equals("hot")){
            System.out.println("hot, stay home");
        }
        else if (weather.equals("warm")){
            System.out.println("rainy, stay home");
        }
        else {
            System.out.println("party hard!");// party hard! because non of ifs are true
        }

        //------------------------------------------------

        System.out.println("IF IF IF IF IF IF ");

        if (1 < 2) {
            System.out.println("one is less than two");
        }

        if (1 < 3){
            System.out.println("one is less than three");
        }
        if (1 < 4){
            System.out.println("one is less than four");// it wil print everything  because it's different IFs...no else
        }














    }
}
