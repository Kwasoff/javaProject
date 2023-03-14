package methodOverloading;

public class ArithmeticOperations {

    public int sum(int a, int b){
        return a + b;
    }

    public int sum(int a, int b, int c){
        return a + b + c;
    }

    public int average(int a, int b, int c, int d){
        return (a + b + c + d) / 4;
    }

    public int average(int a, int b, int c, int d, int f, int g){
        return (a + b + c + d + f + g) / 6;
    }


}
