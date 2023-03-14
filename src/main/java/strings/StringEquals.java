package strings;

public class StringEquals {
    public static void main(String[] args) {

        String country = "USA";
        String country2 = "USA";
        String country3 = new String("USA");// new String was created

        System.out.println(country == country2);//true...same object
        System.out.println(country == country3);//false
        System.out.println(country2 == country3);//false

        System.out.println(country.equals(country2));//true....value is same
        System.out.println(country2.equals(country3));//true




    }
}
