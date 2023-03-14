package strings;

public class StringTrim {
    public static void main(String[] args) {
        /*
        trim() method removes empty spaces from both ends of the String
         */

        String batch = "      Batch 2 is cool       ";
        System.out.println(batch);

        batch = batch.trim();
        System.out.println(batch);

        System.out.println(batch.contains("cool"));//true

        batch = batch.concat("Bena");//batch + "Bena"
        System.out.println(batch);







    }
}
