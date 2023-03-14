package strings;

public class PracticeStrings {
    public static void main(String[] args) {

        String singerName = "Michael Jackson";
        System.out.println(singerName.length());// returns number of chars
        System.out.println(singerName.endsWith("on"));// returns us boolean
        System.out.println(singerName.startsWith("Misha"));//false

        System.out.println(!singerName.isEmpty());// true
        System.out.println(singerName.toLowerCase());// michael jackson
        System.out.println(singerName);// Michael Jackson

        singerName = singerName.toUpperCase();
        System.out.println(singerName);// all uppercase


        System.out.println(singerName.charAt(0));//M
        System.out.println("" + singerName.charAt(0) + singerName.charAt(3));//MH

        System.out.println(singerName.charAt(8));
        System.out.println(singerName.indexOf("C"));//2
        System.out.println(singerName.indexOf("C", 3));//second c-----10
        System.out.println(singerName.indexOf("W"));// -1
        /*
        if we type lowercase c, it will show us -1....cause lowercase c doesn't exist
         */

      //  System.out.println(singerName.charAt(233433));// index out of bounds error

        String singerName2 = "Justin Bieber";
        boolean areTheySame = singerName2.equals(singerName);//false
        System.out.println(areTheySame);

        System.out.println(!singerName.equals(singerName2));//true
        singerName = singerName2;
        System.out.println(singerName.equals(singerName2));//true
        System.out.println(singerName == singerName2);//true







    }
}
