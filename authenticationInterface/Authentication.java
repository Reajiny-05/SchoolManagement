package authenticationInterface;

import java.util.Scanner;
import object1.Students;
import object1.User;

public interface Authentication {
    
    // Now takes parameters, as it should
    public abstract boolean login(String username, String password);

    public static User signUp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName = sc.nextLine();
        System.out.println("Enter email: ");
        String email = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();

        // Create new Student object using the constructor that accepts all fields
        Students newAccount = new Students(userName, password, email);

        System.out.println("Account created successfully!\n");

        return newAccount;
    }
}
