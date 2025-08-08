package authenticationInterface;

import java.util.Scanner;
import object1.Students;
import object1.Teachers;
import object1.User;

public interface Authentication {
    
    // Now takes parameters, as it should
    public abstract boolean login(String username, String password);

    public static User defaultSignUp() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Are you signing up as a Student or Teacher?");
        String role = sc.nextLine().trim().toLowerCase();

        System.out.println("Enter username: ");
        String userName = sc.nextLine();
        System.out.println("Enter email: ");
        String email = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();

        User newAccount;

        if (role.equals("teacher")) {
            System.out.println("Enter course you will teach: ");
            String course = sc.nextLine();
            newAccount = new Teachers(0, email, password, userName, "0123456789", "Default Institute", course);
        } else {
            newAccount = new Students(userName, password, email);
        }

        System.out.println("Account created successfully as " + role + "!\n");

        return newAccount;
    }

}
