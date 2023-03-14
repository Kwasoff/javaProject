package arithmethicOperators;

public class CompoundOperators { //===========short cut of regular math. operators
    public static void main(String[] args) {

        int a = 5;
        a++;//a=a+1=6
        a++;
        System.out.println(a);//7

        a--;//a=a-1
        System.out.println(a);//6

        int age = 18;
        System.out.println(age++);//18
        System.out.println(age);//19 post increment

        int q = 20;
        System.out.println(++q);//21 pre increment
        System.out.println(q++);//21
        System.out.println(q);//22
        //==== --works the same


        int money = 20;

        money += 3; // money = money + 3

        System.out.println(money);//23

        money += 5;
        System.out.println(money);//28

        money -= 8;
        System.out.println(money);//20

        money *=2;// money = money * 2
        System.out.println(money);//40

        money /=4;
        System.out.println(money);//10

        money %=2;
        System.out.println(money);//0






    }
}
