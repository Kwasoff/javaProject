package ScannerClass;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature");
        double temp = sc.nextInt();

        System.out.println("Raining");
        boolean isRaining = sc.nextBoolean();

        if (temp < 0){
            System.out.println("Freezing outside! Wear a heavy coat, gloves and hat");
        }
        else if (isRaining && temp >=0 && temp <= 10){
            System.out.println("chilly and rainy! Wear a raincoat, boots and a scarf ");
        }
        else if(!isRaining && temp >= 0 && temp <= 10){
            System.out.println("chilly outside! Wear a jacket, gloves and a hat");
        }
        else if (isRaining && temp >= 11 && temp <= 20){
            System.out.println("cool and rainy! Wear a light jacket, boots and a scarf");
        }
        else if (!isRaining && temp >= 11 && temp <= 20){
            System.out.println("cool outside! Wear a light jacket and comfortable shoes");
        }
        else if (isRaining && temp > 20){
            System.out.println("warm and rainy! Wear a light jacket, shorts and sandals");
        }
        else if (!isRaining && temp > 20){
            System.out.println("warm outside! Wear a t-shirt, shorts and comfortable shoes");
        }





    }

}
