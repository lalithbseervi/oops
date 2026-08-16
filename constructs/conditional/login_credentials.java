package constructs.conditional;

public class login_credentials {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";
        String input_username = "something";
        String input_password = "wrong password";

        if (input_username == username && input_password == password) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials. Login failed.");
        }   
    }
}
