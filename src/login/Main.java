package login;

import java.util.*;

class login {
    private String usermail;
    private String password;

    public login(String usermail, String password) {
        this.usermail = usermail;
        this.password = password;
    }

    public String getUsermail() {
        return this.usermail;
    }

    public String getPassword() {
        return this.password;
    }

}

public class Main {
    public static void main(String[] args) {
        int count = 0;
        ArrayList<login> usermail = new ArrayList<login>();
        Scanner sc = new Scanner(System.in);

        usermail.add(new login("admin1", "123456"));
        usermail.add(new login("admin2", "654321"));

        int choice;
        do {
            System.out.println("RESTAURANT MENU SYSTEM");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.print("Enter your usermail: ");
                    String usermail1 = sc1.nextLine();
                    System.out.print("Enter your password: ");
                    String password1 = sc1.nextLine();

                    for (login login : usermail) {
                        if (login.getUsermail().equals(usermail1) && login.getPassword().equals(password1)) {
                            count++;
                            System.out.println("Login successfully!");
                        }
                    }
                    if (count == 0) {
                        System.out.println("Login failed!");
                    }

                    break;
                case 2:
                    System.out.println("Register");
                    Scanner sc2 = new Scanner(System.in);
                    System.out.print("Enter your usermail: ");
                    String usermail2 = sc2.nextLine();
                    System.out.print("Enter your password: ");
                    String password2 = sc2.nextLine();

                    usermail.add(new login(usermail2, password2));
                    break;

                default:
                    break;
            }
        } while (choice != 3);

    }
}
