package strings;

public class IntroToStrings {
    public static void main(String [] args){

      String firstName = "John";
      String lastName = "Jones";

        System.out.println(firstName);
        System.out.println(lastName);

        firstName = "Adam";
        System.out.println(firstName);

        lastName = "Sandler";
        System.out.println(lastName);

        //==================================================================

        String myName = "Ihar";
        System.out.println(myName);

        String myLastName = "Zanka";
        System.out.println(myLastName);

        byte myAge = 32;
        System.out.println(myAge);

        String myAddress = "2239 n Western ave";
        System.out.println(myAddress);

        long myMobile = 3125813907L;
        System.out.println(myMobile);

        String myFriendName = "Isa";
        System.out.println(myFriendName);

        String myCity = "Chicago";
        System.out.println(myCity);

        System.out.println(myName + " " + myLastName);

        System.out.println("My name is " + myName + " " + myLastName + ", " + "I'm " + myAge + " " + "years old");
        System.out.println("I live in " + myCity);

        short myBuilding = 2239;
        char north = 'n';
        String myStreet = "Western";
        String typeOfMyStreet = "ave";
        System.out.println("My address is " + myBuilding + " " + north + " " + myStreet + " " + typeOfMyStreet );

        char me = 'I';
        String pas1 = "love ";
        String pas2 = "Rock'n'Roll";
        System.out.println(me + " " + pas1 + pas2);

        String fruit1 = "apple";

        String fruit2 = new String("banana");

        String city = "London";
      System.out.println(city);

      String city2 = new String ("New York");
      System.out.println(city2);


      //======================================================================================

      System.out.println(city.length());// 6 letters L O N D O N
      /*
      length () method returns us the numbers of characters (chars)
       */
      System.out.println(city2.length());//8 ...7 letters + space

      System.out.println("the length of London is " + city.length());

      System.out.println("Ihar".length());//4

      String school = "Codewise";
      school = "Codeshark";
      System.out.println(school);

      /*
      equals() method compares values of two Strings
       */
      String fr1 = "apple";
      String fr2 = "apple";
      String fr3 = "Apple";

      boolean isSame = fr1.equals(fr2);
      System.out.println(isSame);// true

      // == usually use it with numbers
      isSame = fr1.equals(fr3);
      System.out.println(isSame);//false

      fr1 = "banana";
      fr2 = "orange";
      System.out.println("Is banana same as orange? " + fr1.equals(fr2));

      boolean isSame2 = !fr1.equals(fr2);//not equals
      System.out.println(isSame2);//true



      int cucumber = 5;
      int tomato = 10;

      int empty = cucumber;//5
      cucumber = tomato;//10
      tomato = empty;//5


      System.out.println("cucumber: " + cucumber);
      System.out.println("tomato: " + tomato);


      int aa = 5;
      int bb = 10;
      int cc = aa;

      aa += aa;
      bb -= cc;



      String state1 = "California";
      String state2 = "Illinois";
      String state3 = "Florida";
      String state4 = "ILlinois";
      String state5 = "florida";

      boolean same = !state1.equals(state2);
      System.out.println(same);//true

      boolean same1 = state2.equalsIgnoreCase(state4);// ignoring upper and lower cases
      System.out.println(same1);//true

      boolean same2 = state3.equals(state5);
      System.out.println(same2);//false

      boolean same3 = state5.equals(state1);
      System.out.println(same3);//false

      boolean same4 = !state4.equals(state3);
      System.out.println(same4);//true





















    }
}
