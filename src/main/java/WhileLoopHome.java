import java.util.Scanner;

public class WhileLoopHome {
    public static void main(String[] args) {

//        for (int a = 1; a <= 15; a++){
//            if (a % 2 ==0){
//                continue;
//            }
//            System.out.println(a);
//        }
//
//        for (int b = 1; b <= 25; b++){
//            if (b > 20){
//                break;
//
//            }
//            System.out.println(b);
//        }
//
        Scanner sc = new Scanner (System.in);

        System.out.println("enter valid login");
        String str1 = "";

                while (str1.isBlank()){
            System.out.print("enter valid login");
            str1 = sc.nextLine();
                    }

        System.out.println("enter valid password");





    }

}
