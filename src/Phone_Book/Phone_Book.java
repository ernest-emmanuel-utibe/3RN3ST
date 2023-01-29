package Phone_Book;

public class Phone_Book {
    public void displayReceipt(String name, String phoneNumber,
                               String address, String email) {
        displayLine(53);
        System.out.printf("|Name: %-45s|%n", name);
        displayLine(53);
        System.out.printf("|Address: %-42s|%n", address);
        displayLine(53);
        System.out.printf("|Phone number: %-37s|%n", phoneNumber);
        displayLine(53);
        System.out.printf("|Email: %-44s|%n", email);
        displayLine(53);
    }

    public void displayLine(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
