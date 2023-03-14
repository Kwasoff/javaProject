package objects;

public class SocialMediaApp {
    public static void main(String[] args) {

        SocialMediaUser user1 = new SocialMediaUser();
        SocialMediaUser user2 = new SocialMediaUser();

        user1.setUsername("Angelina");
        user2.setUsername("Jenny123 ");

        user1.setPassword("1angelinaX");

        user1.login("Angelina", "1angelinaX");

        user2.setEmail("qw@gmail.com");

        user1.setAge(23);

        user1.isAdult(23);

        user1.resetPassword("Angel121");

        user1.login("Angelina", "Angel121");











    }
}
