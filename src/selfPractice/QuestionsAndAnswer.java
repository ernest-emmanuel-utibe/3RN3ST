package selfPractice;

import java.util.Scanner;

public class QuestionsAndAnswer {
    public static void main(String[] args) {
        String question = "What is the largest planet in our solar system?";
        String choiceOne = "Jupiter";
        String choiceTwo = "Saturn";
        String choiceThree = "Earth";

        String correctAnswer = choiceOne;
        System.out.println(question);
        System.out.println("Choose one of the following: " + choiceOne + ", " + choiceTwo + ", " + choiceThree );

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (correctAnswer.equals(input.toLowerCase())) {
            System.out.println("Congrats! That is the correct answer");
        } else {
            System.out.println("The answer is incorrect. The correct answer is " + correctAnswer);
        }
    }
}
