package basics;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] wordsPool = {"banana", "storage", "ball", "elephant"};
        String playingWord = wordsPool[new Random().nextInt(wordsPool.length)];
        char[] userChars = new char[playingWord.length()];

        // Fill userChars with '-'
        for (int i = 0; i < userChars.length; i++) {
            userChars[i] = '-';
        }

        boolean found;
        char ch;
        int tries = 6;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our basics.Hangman game");
        while (tries > 0) {
            System.out.println("You have " + tries + " tries");
            System.out.println("The word to find is " + charArrToStr(userChars));
            System.out.print("Please enter your char: ");

            String input = scanner.nextLine();
            if (input.isEmpty()) continue;
            ch = input.charAt(0);
            found = false;

            for (int i = 0; i < playingWord.length(); i++) {
                if (ch == playingWord.charAt(i)) {
                    userChars[i] = ch;
                    found = true;
                }
            }

            if (!found) {
                tries--;
            }

            if (winCondition(userChars, playingWord)) {
                System.out.println("You win!");
                break;
            }
        }

        if (tries == 0) {
            System.out.println("You lose");
        }

        scanner.close();
    }

    public static String charArrToStr(char[] arr) {
        // Create a StringBuilder to store the final string
        StringBuilder result = new StringBuilder();
        // Loop through each character in the array
        for (char ch : arr) {
            result.append(ch); // Add each character to the StringBuilder
        }
        // Convert StringBuilder to a String and return it
        return result.toString();
    }

    public static boolean winCondition(char[] arr, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != arr[i]) {
                return false;
            }
        }
        return true;
    }
}
