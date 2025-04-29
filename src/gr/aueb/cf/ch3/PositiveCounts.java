package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μετράει το πλήθος των συνεχόμενων θετικών ακεραίων
 * (συμπεριλαμβανομένου και το 0) που δίνει ο χρήστης
 */
public class PositiveCounts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positiveCount = 0;

        System.out.println("Please provide positive integer numbers: ");
        num = scanner.nextInt();

        while(num >= 0){

            positiveCount++;
            System.out.println("Please provide the next integer:");
            num = scanner.nextInt();
        }
        System.out.println("Positive count :" +positiveCount);
    }
}
