package Chapter5to7;
import java.util.Scanner;
public class SportsRecommenderApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double temp = input.nextDouble();

        String recommendation = sportsRecommender(temp);
        System.out.println(recommendation);

        input.close();
    }


    public static String sportsRecommender(double tempCelsius) {
        if (tempCelsius >= 20 && tempCelsius <= 30) {
            return "It's lovely weather for sports today!";
        } else if (tempCelsius > 10 && tempCelsius <= 40) {
            return "It's reasonable weather for sports today.";
        } else {
            return "Please exercise with care today, watch out for the weather!";
        }
    }
}
