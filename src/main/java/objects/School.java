package objects;

public class School {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "Leo";
        student1.phone = "1234567890";
        student1.email = "leo@gmail.com";
        student1.age = 18;
        student1.major = "law";

        Student student2 = new Student();
        student2.name = "Nick";
        student2.phone = "123213242";
        student2.email = "nick2gmail.com";
        student2.age = 18;
        student2.major = "Economy";


        student1.read();
        student2.read();


        student1.attendClass();

        student1.printInfo();





    }


}
