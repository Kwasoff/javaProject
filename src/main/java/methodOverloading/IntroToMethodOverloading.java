package methodOverloading;

public class IntroToMethodOverloading {
    /*
    method name should be unique!!!
     */
    public int getAreaOfRectangle(int length, int width){
        return length * width;
    }

    public int getAreaOfRectangle(long length, long width){
        return (int)(length * width);
    }

    public int getAreaOfRectangle(double length, double width){
        System.out.println(9.4 + "fpg");
        return (int)(length * width);
    }


    public int getPerimeterOfSquare (int side1, int side2){
        return (side1 + side2) * 2;
    }

    public int getPerimeterOfSquare (long side1, long side2){
        return (int)(side1 + side2) * 2;
    }

    public int getPerimeterOfSquare (double side1, double side2){
        return (int)(side1 + side2) * 2;
    }







}
