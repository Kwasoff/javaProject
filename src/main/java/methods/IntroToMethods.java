package methods;

public class IntroToMethods {

    static void voidMethod(){
        System.out.println("inside void method");
    }

    static int sum (int a, int b){
        return a + b;
    }




    public static void main(String[] args) {
        voidMethod();


        int result = sum (10,5);
        System.out.println(result);


    }

    int getPerimeterOfTriangle(int sideA, int sideB, int sideC){
        return sideA + sideB + sideC;
    }

    int getLengthOfString (String str){
        return str.length();
    }











}
