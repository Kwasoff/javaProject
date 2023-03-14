package methods;

public class PracticeMethods {

    public static int mult (int a, int b){
        return a * b;
    }

    public String str1 (String str2){
        return str2.toLowerCase();
    }

    public  double div (int a, int b){
        return (double) a / b;
    }

    public static boolean isPalindrome (String str1){
        str1 = str1.toLowerCase().replace(" ", "");
        for (int q = 0; q < str1.length() / 2; q++){
            if (str1.charAt(q) != str1.charAt(str1.length()-1-q)){
                return false;
            }
        }
        return true;
    }

    public double muu (double d){
        return d * 100;
    }

    public static boolean isConsonant (char chara){
        chara = Character.toLowerCase(chara);
        if (Character.isAlphabetic(chara) && (chara != 'a' && chara != 'e' && chara != 'i' && chara != 'u' && chara != 'o')){
            return true;
        }
        return false;
    }

    public boolean dif (int a, int b){
        if (Math.abs(a - b) == 5){
            return true;
        }
        return false;
    }

    public boolean email (String em){
        if (em.contains("@") && em.contains(".")){
            return true;
        }
        return false;
    }

    public boolean isPrime (int a){
        for (int q = 2; q < a; q++){
            if (a % q == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean sameParity (int a, int b){
        return (a % 2 == b % 2);
    }


















}
