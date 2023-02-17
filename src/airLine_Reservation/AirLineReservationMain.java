package airLine_Reservation;
import java.util.Scanner;

public class AirLineReservationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("1. Check seat availability");
            System.out.println("2. Book a seat");
            System.out.println("3. Cancel a reservation");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkAvailability();
                    break;
                case 2:
                    bookSeat();
                    break;
                case 3:
                    cancelReservation();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}
