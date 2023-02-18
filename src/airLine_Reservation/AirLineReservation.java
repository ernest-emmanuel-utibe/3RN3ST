package airLine_Reservation;
import java.util.Scanner;

public class AirLineReservation {
    private static final int NUMBER_OF_SEATS = 10;
    private static boolean[] seats = new boolean[NUMBER_OF_SEATS];

    static void checkAvailability() {
        System.out.print("Enter the seat number you want to check: ");
        int seatNumber = getValidSeatNumber();
        if (seats[seatNumber - 1]) {
            System.out.println("Seat " + seatNumber + " is not available.");
        } else {
            System.out.println("Seat " + seatNumber + " is available.");
        }
    }

    static void bookSeat() {
        System.out.print("Enter the seat number you want to book: ");
        int seatNumber = getValidSeatNumber();
        if (seats[seatNumber - 1]) {
            System.out.println("Seat " + seatNumber + " is not available.");
        } else {
            seats[seatNumber - 1] = true;
            System.out.println("Seat " + seatNumber + " booked successfully.");
        }
    }

    static void cancelReservation() {
        System.out.print("Enter the seat number you want to cancel: ");
        int seatNumber = getValidSeatNumber();
        if (!seats[seatNumber - 1]) {
            System.out.println("Seat " + seatNumber + " is not reserved.");
        } else {
            seats[seatNumber - 1] = false;
            System.out.println("Reservation for seat " + seatNumber + " cancelled successfully.");
        }
    }

    private static int getValidSeatNumber() {
        Scanner scanner = new Scanner(System.in);
        int seatNumber;
        do {
            seatNumber = scanner.nextInt();
            if (seatNumber < 1 || seatNumber > NUMBER_OF_SEATS) {
                System.out.print("Invalid seat number. Please enter a valid seat number: ");
            }
        } while (seatNumber < 1 || seatNumber > NUMBER_OF_SEATS);
        return seatNumber;
    }
}
