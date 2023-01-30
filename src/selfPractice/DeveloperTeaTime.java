package selfPractice;
import java.util.Scanner;

public class DeveloperTeaTime {
    public static void itIsDeveloperTeaTime() {
        System.out.println("It is tea time");
        System.out.println("Tpe in any random number and press enter to start developer tea time: ");
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        System.out.println("It's developer tea time");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to your new job...");

        itIsDeveloperTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");

        itIsDeveloperTeaTime();

        System.out.println("Get promoted");
    }
}
