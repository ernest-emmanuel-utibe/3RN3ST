package Chapter2To4;

class HeartRateTest {
    public static void main(String[] args) {

        HeartRate heartRate = new HeartRate("Patience", "Ime", "June", 23, 1998, 30
                , 345.0, 567.0, 478.0, 2022);

        System.out.println("Data of Patience Imeh\n");
        System.out.printf("My First name is %s%n", heartRate.getFirstName());
        System.out.printf("My Last name is %s%n", heartRate.getLastName());
        System.out.printf("My Month of birth is %s%n", heartRate.getMonthOfBirth());
        System.out.printf("My Day of birth is %s%n", heartRate.getDayOfBirth());
        System.out.printf("My Year of birth is %d%n", heartRate.getYearOfBirth());
        System.out.printf("My Current age is %d%n", heartRate.getAge());
        System.out.printf("My Maximum Heart Rate is %.2f%n", heartRate.getMaximumHeartRate());
        System.out.printf("My Maximum Target Heart Rate is %.2f%n", heartRate.getMaximumTargetHeartRange());
    }
}