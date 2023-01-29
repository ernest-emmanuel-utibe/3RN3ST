package Phone_Book;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

public class Write_Phone_Book {
    public static void main(String[] args) throws FileNotFoundException {
        try(Formatter output = new Formatter("receipt.text")) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("%s%n", "Enter your name, address, telephone number and email");
            while (scanner.hasNext()) {
                output.format("%-15s%-35s%-15s%s%n", scanner.nextLine(),
                        scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            }
        }
        catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            e.printStackTrace();
        }
    }
}
