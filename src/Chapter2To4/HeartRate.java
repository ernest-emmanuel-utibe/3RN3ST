package Chapter2To4;

public class HeartRate {
    public String firstName;
    public String lastName;
    public String monthOfBirth;
    public int dayOfBirth;
    public int yearOfBirth;
    public double minimumTargetHeartRange;
    public double maximumHeartRate;
    public double maximumTargetHeartRange;
    public int age;
    public int currentYear;
    public HeartRate(String firstName, String lastName, String monthOfBirth
            , int dayOfBirth, int yearOfBirth,int age, double minimumTargetHeartRange,
                     double maximumHeartRate, double maximumTargetHeartRange, int currentYear){

        this.firstName = firstName;
        this.lastName = lastName;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.currentYear = currentYear;
        this.age = age;
        this.maximumHeartRate = maximumHeartRate;
        this.minimumTargetHeartRange = minimumTargetHeartRange;
        this.maximumTargetHeartRange = maximumTargetHeartRange;
    }

    public void setFirstName(String name){
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

    public void setMonthOfBirth(String monthOfBirth){
        this.monthOfBirth = monthOfBirth;
    }
    public String getMonthOfBirth(){
        return monthOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public int setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
        return currentYear;
    }
    public int getAge() {
        age = currentYear - yearOfBirth;
        return age;
    }

    public double getMaximumHeartRate() {
        maximumHeartRate = 220 - getAge();
        return maximumHeartRate;
    }

    public double getMinimumTargetHeartRange() {
        minimumTargetHeartRange = 0.5 * maximumHeartRate;
        return minimumTargetHeartRange;
    }

    public double getMaximumTargetHeartRange() {
        maximumTargetHeartRange = 0.85 * maximumHeartRate;
        return maximumHeartRate;
    }
}
