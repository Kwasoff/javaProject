package objects;

public class Rectangle {

    int width;
    int height;

    public void area(){
        System.out.println("area of the rectangle (width * height) is " + width * height);
    }

    public void perimeter(){
        System.out.println("perimeter of the rectangle (height * 2 + width * 2) is " + (height * 2 + width * 2));
    }


    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        rectangle1.height = 5;
        rectangle1.width = 7;

        rectangle1.area();
        rectangle1.perimeter();




    }


}
