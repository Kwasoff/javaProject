package strings;

public class StringReplace {
    public static void main(String[] args) {

        String word = "apple banana strawberry";
        word = word.replace('a', 'e');

        System.out.println(word);

        System.out.println(word.replace('e', 'a'));


        String countries = "Italia Columbia Croatia";
        System.out.println(countries.replace("ia", "republic"));// possible to replace chars and strings


        String foods = "hot lentil soup, hot plov, cold kompot, cold ice-cream, warm pasta, warm pizza";

        foods = foods.replace("hot", "tasty");
        System.out.println(foods);
        foods = foods.replace("cold", "cool");
        System.out.println(foods);
        foods =foods.replace("warm", "italian");
        System.out.println(foods);

        String letters = "fwfjwkbvhebtub ugrutnbrtub";
        letters = letters.replace('f', 'a');
        letters = letters.replace('b', 'a');
        letters = letters.replace('w', 'a');
        letters = letters.replace('j', 'a');
        letters = letters.replace('k','a');
        letters = letters.replace('t', 'a');
        letters = letters.replace('v', 'a');
        letters = letters.replace('h', 'a');
        letters = letters.replace('u', 'a');
        letters = letters.replace('g', 'a');
        letters = letters.replace('r', 'a');
        letters = letters.replace('n', 'a');

        System.out.println(letters);// aaaaaaaaaaaaa aaaaaaaaaaaa



    }
}
