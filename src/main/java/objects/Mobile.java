package objects;

public class Mobile {

    String model;
    int price;
    String memory;

    public void ring() {
        System.out.println(model + " is ringing");
        }
        public void turnOn(){
            System.out.println("price of the phone is " + price);
        }

        public void turnOff(){
            System.out.println("I would like to get " + memory + " memory");
        }


    public static void main(String[] args) {

        Mobile apple = new Mobile();

        apple.model = "13 pro";
        apple.price = 1000;
        apple.memory = "1 TB";


        apple.ring();

        apple.turnOn();

        apple.turnOff();


    }






    }




