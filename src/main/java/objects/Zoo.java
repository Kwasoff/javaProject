package objects;

public class Zoo {

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.type = "rhino";
        animal1.isMammal = true;
        animal1.isCarnivore = false;
        animal1.age = 25;
        animal1.environment = "savanna";


        Animal animal2 = new Animal();
        animal2.type = "humpback whale";
        animal2.isMammal = true;
        animal2.isCarnivore = true;
        animal2.age = 100;
        animal2.environment = "ocean";


        animal1.eat();

        animal2.sleep();

        animal1.play();







    }

}
