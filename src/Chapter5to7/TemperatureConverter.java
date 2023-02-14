package Chapter5to7;
import java.util.Scanner;
public class TemperatureConverter {
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a temperature: ");
        double temperature = input.nextDouble();
        input.nextLine(); // Consume the newline character

        System.out.print("Enter the temperature scale (C or K): ");
        String scale = input.nextLine();

        if (scale.equalsIgnoreCase("C")) {
            double kelvin = celsiusToKelvin(temperature);
            System.out.println(temperature + " C = " + kelvin + " K");
        } else if (scale.equalsIgnoreCase("K")) {
            double celsius = kelvinToCelsius(temperature);
            System.out.println(temperature + " K = " + celsius + " C");
        } else {
            System.out.println("Invalid scale");
        }

        input.close();
    }
}
