package objects;

public class SocialMediaUser {

    String username;
    String password;
    String email;
    String firstName;
    String lastName;
    int age;

    public void setUsername(String username) {

        if (username.length() <= 16 && !username.contains(" ")) {
            System.out.println("valid username");
            this.username = username;
        } else
            System.out.println("invalid username");



    }

    public void setPassword(String password) {
        if (password.length() >= 8 && password.length() <= 16 && password.matches(".*[A-Z].*")
        && password.matches(".*\\d.*") && password.matches(".*[a-z].*")) {
            System.out.println("valid password");
            this.password = password;
        } else
            System.out.println("invalid password");
    }


    public boolean login(String inputUsername, String inputPassword) {
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Successfully loged in");
            return true;
        }
        System.out.println("invalid input");
        return false;
    }

    public void setEmail(String email) {
        if (email.contains("@") && email.contains(".") && email.length() >= 11 && email.length() <= 32) {
            System.out.println("valid email");
            this.email = email;
        } else
            System.out.println("invalid email. try one more time");
    }

    public void resetPassword(String newPassword) {
        setPassword(newPassword);
        setPassword("reset successfully complete");
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            System.out.println("valide age");
            this.age = age;
        } else
            System.out.println("invalid age");
    }

    public boolean isAdult(int age) {
        if (age >= 18) {
            System.out.println("cool! u r an adult");
            return true;
        }
        System.out.println("cool! u r still young");
        return false;


    }
}