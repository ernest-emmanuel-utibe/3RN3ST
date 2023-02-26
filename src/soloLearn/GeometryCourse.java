package soloLearn;

import java.util.Scanner;

public class GeometryCourse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] sides =  new int[length];
        for (int i = 0; i < length; i++) {
            sides[i] = scanner.nextInt();
        }

        int i =1;
        for (int side : sides) {
            int area = side * side;
            System.out.println("The area of square " + i + " is " + area);
            i++;
        }



    }
}
