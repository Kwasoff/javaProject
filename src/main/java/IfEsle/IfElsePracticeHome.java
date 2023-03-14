package IfEsle;

public class IfElsePracticeHome {
    public static void main(String[] args) {

        int age = 14;

        if (age >= 18){
            System.out.println("vote");
        }
        else if (age > 0 && age < 18){
            System.out.println("wait");
        }
        else
            System.out.println("get sober first");




        char letter = '@';
        if (!Character.isAlphabetic(letter)){
            System.out.println("not a letter");
        }
        else if (letter == 'a' || letter == 'o' || letter == 'e' || letter == 'i' || letter == 'u'
        || letter == 'A' || letter == 'O' || letter == 'E' || letter == 'I' || letter == 'U'){
            System.out.println("vowel");
        }
        else
            System.out.println("consonant");

    }
}
