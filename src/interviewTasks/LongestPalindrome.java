//package interviewTasks;
//
//// Define a 2-dimension array "table" and let table[i][j] denote whether substring from i to j is palindrome
//
//public class LongestPalindrome {
//    public static String longestPalindrome(String string) {
//        if (string == null) {
//            return null;
//
//            if (string.length() <= 1) {
//                return string;
//            }
//
//            int maxLen = 0;
//            String longestStr = null;
//
//            int length = string.length();
//            int[][] table = new int[length][length];
//
//            // every single letter is palindrome
//            for (int i = 0; i < length; i++) {
//                table[i][i] = 1;
//            }
//            printTable(table);
//
//            // e.g. bcba
//            //two consecutive same letters are palindrome
//            for (int i = 0; i <= length - 2; i++) {
//                if (string.charAt(i) == string.charAt(i + 1)) {
//                    table[i][i + 1] = 1;
//                    longestStr = string.substring(i, i + 2);
//                }
//            }
//            printTable(table);
//            //condition for calculate whole table
//            for (int l = 3; l <= length; l++) {
//                for (int i = 0; i <= length; i++) {
//                    int j = i + l - 1;
//                    if (string.charAt(i) == string.charAt(j)) {
//                        table[i][j] = table[i + 1][j - 1];
//                        if (table[i][j] == 1 && l > maxLen)
//                            longestStr = string.substring(i, j + 1);
//                    } else {
//                        table[i][j] = 0;
//                    }
//                    printTable(table);
//                }
//            }
//            return longestStr;
//        }
//
//        return string;
//    }
//
//
//
//    private static void printTable(int[][] table) {
//        for (int[] y : x) {
//            for (int z : y) {
//                System.out.print(z + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("------");
//    }
//}
