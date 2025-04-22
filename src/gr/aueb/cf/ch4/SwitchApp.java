package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Η switch-case χρησιμοποιειται αντι των
 * πολλαπλων if-else
 *
 */

public class SwitchApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Please input on of the below: ");
        System.out.println("1. One-player game");
        System.out.println("2. Two-player game");
        System.out.println("3. Team game");
        System.out.println("4. Exit");

        choice = scanner.nextInt();

        switch (choice){
            case 1 :
                System.out.println("one-player game started ");
                break;
            case 2 :
                System.out.println("Two-player game started ");
                break;
            case 3 :
                System.out.println("Team game started ");
                break;
            case 4 :
                System.out.println("Game existed");
                break;
            default:
                System.out.println("Error in choice selection ");
                break;
        }
    }
}
