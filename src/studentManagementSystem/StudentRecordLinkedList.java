package studentManagementSystem;

import java.util.Scanner;

public class StudentRecordLinkedList {
    public static void main(String[] args) {
        StudentRecordManagement humanResources = new StudentRecordManagement();
        Record record = new Record();
        record.setIdNumber(1890);
        record.setContactNumber(+1);
        record.setName("Ernest");
        record.setEmailAddress("er123nest@gmail");
        record.setHomeAddress("Lagos");

        humanResources.add(record);

        Scanner input = new Scanner(System.in);
        int option = 0;

        do {
            menu();
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("What is the Student's id number?: ");
                    int idNumber = input.nextInt();

                    System.out.print("What is the Student's contact number?: ");
                    int contactNumber = input.nextInt();
                    input.nextLine();

                    System.out.print("What is the Student's name?: ");
                    String name = input.nextLine();

                    System.out.print("What is the Student's email address?: ");
                    String emailAddress = input.nextLine();

                    System.out.print("What is the Student's home address?: ");
                    String homeAddress = input.nextLine();

                    record = new Record(name, idNumber, contactNumber, emailAddress, homeAddress);
                    humanResources.add(record);
                    System.out.println(record.toString());
                    break;


                case 2:
                    System.out.print("What is the Student id number?: ");
                    int deleteId = input.nextInt();
                    humanResources.delete(deleteId);
                    break;

                case 3:
                    System.out.print("What is the Student id number?: ");
                    int deleteIdNo = input.nextInt();
                    humanResources.update(deleteIdNo, input);

                case 4:
                    System.out.print("What is the Student id?: ");
                    int bookId = input.nextInt();

                    if (!humanResources.find(bookId)) {
                        System.out.println("Student id does not exist\n");
                    }
                    break;

                case 5:
                    humanResources.display();
                    break;

                case 9:
                    System.out.println(
                            "\nThank you for using the app. Goodbye!\n");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nInvalid input\n");
                    break;
            }
        }
        while (option != 9);
    }
    public static void menu() {
        System.out.println("MENU");
        System.out.println("1. Add Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Update Student");
        System.out.println("4. Search Student");
        System.out.println("5. Display Student");
        System.out.println("9. Exit Program");
        System.out.println("Enter your selection");
    }
}
