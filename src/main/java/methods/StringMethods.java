package methods;

public class StringMethods {

    static boolean compareStrings(String str1, String str2){
        if (str1.equals(str2)){
            return true;
        }
        return false;
    }

    static String concatenated (String aaa, String bbb){
        return (aaa + bbb).toUpperCase();
    }

    static int concat (String s1, String s2){
        return (s1 + s2).length();
    }

    public static boolean ifTrue (int a){
        if (a % 2 == 0){
            return true;
        }
        return false;
    }


    public static boolean divisibleByTen (int b){
        return b % 10 == 0;
    }


    public static void multTable (int c){
        for (int d = 1; d <=10; d++){
            System.out.println(c + " * " + d + " = " + (c * d));
        }
    }


    public static int larger (int a1, int a2){
        if (a1 > a2){
            return a1;
        }
        return a2;

    }


    public static int average (int a, int b, int c, int d){
        return (a + b + c + d) / 4;
    }

    public static int sumOfNumbers(int s){
        int sum = 0;
        for (int a = 1; a <= s; a++){
            sum += a;
        }return sum ;
    }










    public static void main(String[] args) {
        boolean isSame = compareStrings("hello", "hellllooooo");// false
        System.out.println(isSame);

        System.out.println(concatenated("hello", "world"));

        System.out.println(concat("qwe", "rty"));

        multTable(5);

        System.out.println(average(2,4,6,8));

        System.out.println(sumOfNumbers(5));
    }
}
