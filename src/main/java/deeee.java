public class deeee {
    public static void main(String[] args) {

       String str = "deffed";
       boolean isPalindrome = true;

       for (int q = 0; q < str.length() / 2; q++){
           if (str.charAt(q) != str.charAt(str.length() - 1 - q)){
               isPalindrome = false;
           }
       }
        System.out.println(isPalindrome);
    }
}
