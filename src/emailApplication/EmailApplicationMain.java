package emailApplication;

import java.util.List;
import java.util.Scanner;

public class EmailApplicationMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

//        // create some sample users
//        createUser("user1", "password1");
//        createUser("user2", "password2");

        while (!exit) {
            System.out.println("1. Login");
            System.out.println("2. Create Account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter your username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter your password: ");
                    String password = scanner.nextLine();

                    if (new User(username, password)) {
                        System.out.println("Login successful.");
                        mainMenu(scanner);
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                    break;
                case 2:
                    System.out.print("Enter your username: ");
                    username = scanner.nextLine();
                    System.out.print("Enter your password: ");
                    password = scanner.nextLine();
                    createUser(username, password);
                    System.out.println("Account created successfully.");
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }

    public void mainMenu(Scanner scanner) {
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Send Email");
            System.out.println("2. Receive Emails");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter the recipient's email address: ");
//                    String recipient = scanner.nextLine();
//                    System.out.print("Enter the subject: ");
//                    String subject = scanner.nextLine();
//                    System.out.print("Enter the message: ");
//                    String message = scanner.nextLine();
//
//                    Email email = new Email(User, recipient, subject, message);
//                    sendEmail(email);
//                    System.out.println("Email sent successfully.");
//                    break;
//                case 2:
//                    List<Email> emails = currentUser.getInbox();
//                    if (emails.size() == 0) {
//                        System.out.println("No new emails.");
//                    } else {
//                        for (Email e : emails) {
//                            System.out.println("From: " + e.getSender());
//                            System.out.println("Subject: " + e.getSubject());
//                            System.out.println("Message: " + e.getMessage());
//                            e.setRead(true);
//                        }
//                    }
//                    break;
//                case 3:
//                    exit = true;
//                    currentUser = null;
//                    break;
//                default:
//                    System.out.println("Invalid choice.");
//            }
//        }
        }
    }
}
