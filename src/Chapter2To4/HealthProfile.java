package Chapter2To4;

public class HealthProfile {
    public String firstName;
    public String lastName;
    public String gender;
    public String month;
    public String day;
    public double yearOfBirth;
    public double weight;
    public int height;
    public int age;
    public int minimumHeartRate;
    public int maximumHeartRate;
    public int minimumTargetHeartRate;

    public HealthProfile(String firstName, String lastName, String gender,
                         String month, String day, double year, double weight, int height, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.month = month;
        this.day = day;
        this.yearOfBirth = year;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

    public void setMonth(String month) {
        this.month = month;
    }
    public String getMonth() {
        return month;
    }

    public void setDay(String day) {
        this.day = day;
    }
    public String getDay() {
        return day;
    }

    public double setYear(int year) {
        this.yearOfBirth = year;
        return year;
    }
    public int getYear() {
        return (int) yearOfBirth;
    }

    public int setHeight(){
        this.height = height;
        return 74;
    }
    public double getWeight(){
        return weight;
    }

    public int getAge() {
        return age;
    }

    public int getMaximumHeartRate(){
        maximumHeartRate = 220 - age;
        return maximumHeartRate;
    }

    public int getMinimumTargetHeartRate() {
        maximumHeartRate = (int) (0.5 * maximumHeartRate);
        return minimumTargetHeartRate;
    }

    public double getMaximumTargetHeartRate() {
        return 0.85 * minimumHeartRate;
    }

    public double getBodyMassIndex(){
        return (double) ((weight * 703) / (height * height));
    }
}
