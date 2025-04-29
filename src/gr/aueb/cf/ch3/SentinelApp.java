package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Παρέχονται ακέραιοι αριθμού απο τον χρήστη
 * μέχρι να βρεθεί το -1
 */
public class SentinelApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int iterations = 0;

        System.out.println("Please provide us integers (-1 to exit");
        num = scanner.nextInt();

        while(num != -1){
            iterations++;
            System.out.println("Please provide next integer: ");
            num = scanner.nextInt();
        }
        System.out.printf("%d iterations : ",iterations);
    }
}
