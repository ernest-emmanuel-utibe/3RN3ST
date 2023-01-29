package Chapter5to7;

import java.util.Scanner;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number between 1 - 12");
        int day = scanner.nextInt();


        if (day >= 1 && day <= 12) {
            switch (day) {
                case 12 -> System.out.println("""
                        On the twelfth of Christmas my true love gave to me
                        Twelve drummers drumming
                        Eleven pipers pipping
                        Ten lords a-leaping
                        Nine ladies dancing
                        Eight maid a-milking
                        Seven swans a-swanning
                        Six geese a-laying
                        Five gold ring(five golden rings)
                        Four calling birds
                        Three French hens
                        Two turtledoves
                        And a partridge in a partridge in a pear tree
                        """);
                case 11 -> System.out.println("""
                        On the Eleventh day of Christmas my true love sent to meEleven pipers piping
                        Ten lords a-leaping
                        Nine ladies dancing
                        Eight maid a-milking
                        Seven swans a-swanning
                        Six geese a-laying
                        Five gold ring(five golden rings)
                        Four calling birds
                        Three French hens
                        Two turtledoves
                        And a partridge in a partridge in a pear tree
                        """);
                case 10 -> System.out.println("""
                        On the Tenth day of Christmas my true love sent to meTen lords a-leaping
                        Nine ladies dancing
                        Eight maid a-milking
                        Seven swans a-swanning
                        Six geese a-laying
                        Five gold ring(five golden rings)
                        Four calling birds
                        Three French hens
                        Two turtledoves
                        And a partridge in a partridge in a pear tree""");
                case 9 -> System.out.println("""
                        On the Ninth day of Christmas my true love gave to meNine ladies dancing
                        Eight maid a-milking
                        Seven swans a-swanning
                        Six geese a-laying
                        Five gold ring(five golden rings)
                        Four calling birds
                        Three French hens
                        Two turtledoves
                        And a partridge in a partridge in a pear tree""");
                case 8 -> System.out.println("""
                        On the Eight day of Christmas my true love gave to meEight maid a-milking
                        Seven swans a-swanning
                        Six geese a-laying
                        Five gold ring(five golden rings)
                        Four calling birds
                        Three French hens
                        Two turtledoves
                        And a partridge in a partridge in a pear tree""");
                case 7 -> System.out.println("""
                        On the Seventh day of Christmas my true love gave to meSeven swans a-swanning
                        Six geese a-laying
                        Five gold ring(five golden rings)Four calling birds
                        Three French hens
                        Two turtledoves
                        And a partridge in a partridge in a pear tree""");
                case 6 -> System.out.println("""
                        On the Sixth day of Christmas my true love gave to meSix geese a-laying
                        Five gold ring(five golden rings)Four calling birds
                        Three French hens
                        Two turtledoves
                        And a partridge in a partridge in a pear tree""");
                case 5 -> System.out.println("""
                        On Fifth day of Christmas my true love gave to meFive gold ring
                        Four calling birds
                        Three French hens
                        Two turtledoves
                        And a partridge in a partridge in a pear tree""");
                case 4 -> System.out.println("""
                        On the Fourth day of Christmas my true love gave to meFour calling birds
                        Three French hens
                        Two turtledoves
                        And a partridge in a partridge in a pear tree""");
                case 3 -> System.out.println("""
                        On the Third day of Christmas my true love gave to meThree French hens
                        Two turtledoves
                        And a partridge in a partridge in a pear tree""");
                case 2 -> System.out.println("On the Second of Christmas my true love gave to me" +
                        "Two turtledoves\n" +
                        "And a partridge in a partridge in a pear tree");
                case 1 -> System.out.println("On the First day of Christmas my true love gave to me" +
                        "And a partridge in a partridge in a pear tree");
            }
        }
    }
}
