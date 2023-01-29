package Chapter2To4;

class HealthProfileTest {
    public static void main(String[] args) {

        HealthProfile healthProfile = new HealthProfile("ERNEST", "INYANG INYANG UWEM", "MALE", "AUGUST",
                "MONDAY", 1975, 525, 0x98, 55);

        System.out.printf("My First Name is %s%n", healthProfile.getFirstName());
        System.out.printf("My Last Name is %s%n", healthProfile.getLastName());
        System.out.printf("Age is: %d%n", healthProfile.getAge());
        System.out.printf("Year is %d%n", healthProfile.getYear());
        System.out.printf("Weight is %.2f%n", healthProfile.getWeight());
        System.out.printf("Height is %d%n", healthProfile.setHeight());
        System.out.printf("BMI is %.2f%n ", healthProfile.getBodyMassIndex());
        System.out.printf("Maximum Heart Rate is %d%n", healthProfile.getMaximumHeartRate());
        System.out.printf("Maximum Target Heart Rate is %.2f%n", healthProfile.getMaximumTargetHeartRate());
        System.out.printf("Minimum Target Heart Rate is %d%n", healthProfile.getMinimumTargetHeartRate());
    }
}