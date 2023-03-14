package strings;

public class StringSubstring {
    public static void main(String[] args) {

        String message = "Hello Chicago, why are you cold and windy?";
        String city = message.substring(6,13);
        System.out.println(city);

        String question = message.substring(15);

        String welcomeSign = "Welcome to USA, our population is 140 million people, the average salary is 90k dollars" +
                "and our president is Joe Biden";

        String country = welcomeSign.substring(11, 14);
        System.out.println(country);

        String population = welcomeSign.substring(34,45);
        System.out.println(population);

        String salary = welcomeSign.substring(76, 87);
        System.out.println(salary);

        String president = welcomeSign.substring(108);
        System.out.println(president);

        String population1 = welcomeSign.substring(welcomeSign.indexOf("140"), welcomeSign.indexOf(" people"));
        System.out.println(population1);

        String salary1 = welcomeSign.substring(welcomeSign.indexOf("9"),welcomeSign.indexOf("and"));
        System.out.println(salary1);


        String phrase = "Just one positive thought in the morning can change your whole day.";
        String a1 = phrase.substring(0,4) + " a " + phrase.substring(phrase.indexOf("th"), phrase.indexOf(" in"));
        System.out.println(a1);

        String a2 = phrase.substring(phrase.indexOf("pos"), phrase.indexOf(" th")) + " " + phrase.substring(phrase.indexOf("mor"), phrase.indexOf(" can"));
        System.out.println(a2);

        String a3 = phrase.substring(phrase.indexOf("wh"), phrase.indexOf(" d")) + " " + phrase.substring(phrase.indexOf("mor"), phrase.indexOf(" can"));
        System.out.println(a3);

        String a4 = phrase.substring(phrase.indexOf("cha"), phrase.indexOf(" you")) + " " + phrase.substring(phrase.indexOf("on"), phrase.indexOf(" po")) + " " + phrase.substring(phrase.indexOf("da"), phrase.indexOf("."));
        System.out.println(a4);

        String a5 = phrase.substring(phrase.indexOf("cha"), phrase.indexOf(" you")) + " " + phrase.substring(phrase.indexOf("you"), phrase.indexOf(" wh")) + " " + phrase.substring(phrase.indexOf("th"), phrase.indexOf(" in"));
        System.out.println(a5);


       //=============================================================================================


        String str1 = "hi";
        String str2 = "bye";

        System.out.println(str1 + str2 + str2 + str1);

        System.out.println(str1 + " " + str2 + " " + str1.toUpperCase() + " " + str1.toUpperCase() + " "
                + str2.toUpperCase() + " " + str2.toUpperCase() + " " + str2 + " " + str1);


        System.out.println(str2.substring(0,1) + str1.substring(1));
        System.out.println(str1.replace('h','b'));
        System.out.println(str2.charAt(0) + "" +str1.charAt(1));

        String see = "see";
        String hear = "hear";
        System.out.println(hear.replace('h', 's'));
        System.out.println(see.substring(0,1) + hear.substring(1));
        System.out.println(see.charAt(0) + "" + hear.substring(1));
        System.out.println(see.charAt(0) + "" + hear.charAt(1) + hear.charAt(2) + hear.charAt(3));









    }
}
