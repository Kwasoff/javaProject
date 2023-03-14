package objects;

public class Animal {

    String type;
    boolean isMammal;
    boolean isCarnivore;
    int age;
    String environment;

    public void eat(){
        System.out.println(type + " are " + isCarnivore);
    }

    public  void sleep(){
        System.out.println("Cubs of " + isMammal + " until " + age);
    }

    public void play(){
        System.out.println("the best habitat is: " + environment);
    }






}
