package problemSolving;

public class ReverseWord {
    public static void main(String[] args) {

        String str = "banana";
        String reverse = "";

        for (int a = str.length()-1; a >= 0; a--){
            reverse += str.charAt(a);
        }
        System.out.println(reverse);

    }
}
