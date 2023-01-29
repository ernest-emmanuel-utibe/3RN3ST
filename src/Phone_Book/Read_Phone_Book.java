package Phone_Book;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Read_Phone_Book {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(Paths.get("receipt.txt"))) {
            Phone_Book receipt = new Phone_Book();
            while (input.hasNext()) {
                receipt.displayReceipt(input.next(), input.next(), input.next(), input.next());
                //System.out.println();
            }
        } catch (SecurityException | NoSuchElementException | IOException e) {
            System.out.print("");
        }
    }
}
