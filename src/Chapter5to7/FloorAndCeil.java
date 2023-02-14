package Chapter5to7;

public class FloorAndCeil {
    public static int myFloor(double num) {
        int floor = (int) num;
        if (floor > num) {
            floor -= 1;
        }
        return floor;
    }

    public static int myCeil(double num) {
        int ceil = (int) num;
        if (ceil < num) {
            ceil += 1;
        }
        return ceil;
    }

    public static void main(String[] args) {
        double x = 4.7;
        System.out.println("myFloor(" + x + ") = " + myFloor(x));
        System.out.println("myCeil(" + x + ") = " + myCeil(x));
    }
}
