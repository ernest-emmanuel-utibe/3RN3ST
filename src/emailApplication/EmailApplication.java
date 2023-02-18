//package emailApplication;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//public class EmailApplication {
//    private static List<User> users = new ArrayList<>();
//    private static User currentUser;
//
//    private static void mainMenu(Scanner scanner) {
//        boolean exit = false;
//
//        while (!exit) {
//            System.out.println("1. Send Email");
//            System.out.println("2. Receive Emails");
//            System.out.println("3. Logout");
//            System.out.print("Enter your choice: ");
//
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // consume the newline character
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
//                    EmailApplication email = new EmailApplication(currentUser., recipient, subject, message);
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
//    }
//
//    static boolean login(String username, String password) {
//        for (User user : users) {
//            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
//                currentUser = user;
//                return true;
//            }
//        }
//        return false;
//    }
//
//    static void createUser(String username, String password) {
//        User user = new User(username, password);
//        users.add(user);
//    }
//
//    private static void sendEmail(Email email) {
//
//    }
//}
//
