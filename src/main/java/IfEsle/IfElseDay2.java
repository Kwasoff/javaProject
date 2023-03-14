package IfEsle;

public class IfElseDay2 {
    public static void main(String[] args) {

        int day = 5;
        if (day == 1){
            System.out.println("Monday");
        }
        else if (day == 2){
            System.out.println("Tuesday");
        }
         else if (day == 3){
            System.out.println("Wednesday");
        }
         else if (day == 4){
            System.out.println("Thursday");
        }
         else if (day == 5){
            System.out.println("Friday");
        }
         else if (day == 6){
            System.out.println("Saturday");
        }
         else if (day == 7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("invalid day");
        }

        String d1 = "monday";
        if (d1.equalsIgnoreCase("Monday")){
            System.out.println(1);
        }
        else if (d1.equalsIgnoreCase("Tuesday")){
            System.out.println(1);
        }
        else if (d1.equalsIgnoreCase("Wednesday")){
            System.out.println(1);
        }
        else if (d1.equalsIgnoreCase("Thursday")){
            System.out.println(1);
        }
        else if (d1.equalsIgnoreCase("Friday")){
            System.out.println(1);
        }
        else if (d1.equalsIgnoreCase("Saturday")){
            System.out.println(1);
        }
        else if (d1.equalsIgnoreCase("Sunday")){
            System.out.println(1);
        }
        else{
            System.out.println("doesn't match");
        }

        //===================================================================

        byte time = 22;
        if (time >= 9 && time <= 17){
            System.out.println("WORK HOURS");
        }
        if (time >= 7 && time <= 9 || time >=18 && time <= 19 ){
            System.out.println("COMMUTE HOURS");
        }

        if (time >= 6 && time <=8){
            System.out.println("BREAKFAST TIME");
        }
        if (time >= 12 && time <= 13){
            System.out.println("LUNCH TIME");
        }
        if (time >= 20 && time <= 22){
            System.out.println("DINNER TIME");
        }
        if (time >= 22 && time <= 24){
            System.out.println("LATE HOURS");
        }
        if (time >= 0 && time <= 6){
            System.out.println("SLEEP TIME");
        }
        if (time < 0 || time > 24) {
            System.out.println("INVALID TIME");
        }









    }
}
