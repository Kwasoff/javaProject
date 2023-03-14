package methodOverloading;

public class AreaOfTriangle {

    public double getAreaOfTriangle (int base, int height){
        return 1/2 * base * height;
    }

    public double getAreaOfTriangle(int a, int b, int c){
        int semiPerimeter = (a + b + c) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }



}
