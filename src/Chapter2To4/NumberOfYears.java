package Chapter2To4;

import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {
        double year, minute, day;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of minutes:  ");
        minute = scanner.nextDouble();

        year = minute / 525600;
        year = (int) year;

        day = (minute - year * 525600);
        day = (int) day;

        System.out.println("These are " + year + " years, " + day + "days");
    }
}
