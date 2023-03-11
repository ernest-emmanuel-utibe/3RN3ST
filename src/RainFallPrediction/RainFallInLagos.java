package RainFallPrediction;

public class RainFallInLagos {
    static String[] months =
            {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    static double[] rainFallPerDay = {(double) 15/2, (double) 40/3, (double) 75/6, (double) 140/9, (double) 205/12,
            (double) 310/16, (double) 225/13, (double) 110/12, (double) 165/13, (double) 135/ 11, (double) 55/5, 20};

    public static double numberOfRainFall(String month, int days) {
        int index = findMonth(month);
        double rainFallPerDayInMonth = rainFallPerDay[index];


        return Math.round(rainFallPerDayInMonth * days);
    }

    public static int findMonth(String month) {
        int number = -1;
        switch (month) {
            case "January" -> number = 0;
            case "February" -> number = 1;
            case "March" -> number = 2;
            case "April" -> number = 3;
            case "May" -> number = 4;
            case "June" -> number = 5;
            case "July" -> number = 6;
            case "August" -> number = 7;
            case "September" -> number = 8;
            case "October" -> number = 9;
            case "November" -> number = 10;
            case "December" -> number = 11;
        };
        return number;
    }
}
