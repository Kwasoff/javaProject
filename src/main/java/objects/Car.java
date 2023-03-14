package objects;

public class Car {

    String brand;
    String model;
    String color;
    int year;
    int price;

    public void drive(){
        System.out.println("brand and model: " + brand + " " + model);
    }

    public void stop (){
        System.out.println("The year of my car is: " + year);
    }

    public void playMusic (){
        System.out.println("Rock'n'Roll " + color + " only " + price);
    }

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand = "Mercedes";
        car1.model = "cla";
        car1.color = "white";
        car1.year = 2020;
        car1.price = 30000;


        Car car2 = new Car();
        car2.brand = "BelAz";
        car2.model = "15432";
        car2.color = "yellow";
        car2.year = 2023;
        car2.price = 250000;



        car1.playMusic();

        car2.drive();

        car1.stop();










    }



}
