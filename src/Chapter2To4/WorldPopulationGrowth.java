package Chapter2To4;

import java.util.Scanner;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double CurrentPopulation;
        double PopulationGrowthRate;
        double YearOne;
        double YearTwo;
        double YearThree;
        double YearFour;
        double YearFive;

        System.out.print("Enter current world population: ");
        CurrentPopulation = scanner.nextInt();

        System.out.print("Enter the annual world population growth rate: ");
        PopulationGrowthRate = scanner.nextInt();

        YearOne = CurrentPopulation + (CurrentPopulation * PopulationGrowthRate);

        YearTwo = YearOne + (YearOne * PopulationGrowthRate);

        YearThree = YearTwo + (YearTwo * PopulationGrowthRate);

        YearFour = YearThree + (YearThree * PopulationGrowthRate);

        YearFive = YearFour + (YearFour * PopulationGrowthRate);

        System.out.printf("The world population for year one is %f%n",YearOne);
        System.out.printf("The world population for year two is %f%n", YearTwo);
        System.out.printf("The world population for year three is %f%n", YearThree);
        System.out.printf("The world population for year four is %f%n", YearFour);
        System.out.printf("The world population for year five is %f%n", YearFive);
    }
}
