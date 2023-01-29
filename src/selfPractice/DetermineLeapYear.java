package selfPractice;

public class DetermineLeapYear {
    public static void main(String[] args) {
        // year we want to check
        int year = 2004;
        // if year is divided by 4, it is a leap year
        if(year % 400 == 0 || (year % 4 == 0) || (year % 100 != 0)){
            System.out.println("Year "+ year + " is a leap year");
        }
        else {
            System.out.println("Year "+ year + " is not a leap year");
        }
    }


}
