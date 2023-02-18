//package emailApplication;
//
//import java.util.Scanner;
//
////import static emailApplication.EmailApplication.EmailApplication.*;
//
//public class EmailApplicationMain {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        boolean exit = false;
//
//        // create some sample users
//        createUser("user1", "password1");
//        createUser("user2", "password2");
//
//        while (!exit) {
//            System.out.println("1. Login");
//            System.out.println("2. Create Account");
//            System.out.println("3. Exit");
//            System.out.print("Enter your choice: ");
//
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // consume the newline character
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter your username: ");
//                    String username = scanner.nextLine();
//                    System.out.print("Enter your password: ");
//                    String password = scanner.nextLine();
//
//                    if (login(username, password)) {
//                        System.out.println("Login successful.");
//                        mainMenu(scanner);
//                    } else {
//                        System.out.println("Invalid username or password.");
//                    }
//                    break;
//                case 2:
//                    System.out.print("Enter your username: ");
//                    username = scanner.nextLine();
//                    System.out.print("Enter your password: ");
//                    password = scanner.nextLine();
//                    createUser(username, password);
//                    System.out.println("Account created successfully.");
//                    break;
//                case 3:
//                    exit = true;
//                    break;
//                default:
//                    System.out.println("Invalid choice.");
//            }
//        }
//        scanner.close();
//    }
//}
