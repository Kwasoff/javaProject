package objects;

public class Student {
    String name;
    int age;
    String major;
    String email;
    String phone;

    public void read (){
        System.out.println(name + " is reading");
    }

    public void attendClass (){
        System.out.println(name + " is attending " + major);
    }

    public void printInfo(){
        System.out.println("student's name is " + name + " and student is " + age + " years old");
        System.out.println("student studies at " + major);
        System.out.println("student's contract details (email: " + email + " , phone: " + phone + ")");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }








}
