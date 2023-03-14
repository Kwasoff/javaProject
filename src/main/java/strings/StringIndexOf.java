package strings;

public class StringIndexOf {
    public static void main(String[] args) {

        String ad = "Buy two, get one for free!";
        int index = ad.indexOf('g');
        System.out.println(index);//9
        int index1  = ad.indexOf('t');
        System.out.println(index1);//4

        index = ad.indexOf('o');// first o
        index = ad.indexOf('o', 7);// start from 7 letter

        System.out.println(index);//13....second o






    }
}
