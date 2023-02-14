package loops.arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a to-do item (or 'q' to quit): ");
            String input = scanner.nextLine();

            if (input.equals("q")) {
                break;
            }
            list.add(input);
            System.out.println("Added: " + input);
        }
        System.out.println("Your to-do list: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }
}
