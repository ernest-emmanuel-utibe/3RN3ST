package leetcodeTasks;

public class ConvertToBinary {
    public static int convertToBinary(int number) {
        String binaryStr = "";
        while (number != 0) {
            binaryStr = number % 2 + binaryStr;
            number = number / 2;
        }
        return Integer.parseInt(binaryStr);
    }

    public static void main(String[] args) {
        int number  = 100;
        System.out.print(convertToBinary(number));
    }
}
