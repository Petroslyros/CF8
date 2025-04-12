package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης θα δώσει αριθμητή και
 * παρονομαστή και το πρόγραμμα θα πρέπει να
 * ελέγξει αν ο παρονομαστής ειναι 0, γιατι
 * δεν μπορε να γινει διαιρεση
 */
public class DivisionAPp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please input the numerator: ");
            numerator = scanner.nextInt();

            System.out.println("Please provide the denominator: ");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("The denominator cannot be 0");
                break;
            }
            result = numerator / denominator;
            System.out.printf("THe result of d% / d% = %d", numerator, denominator , result);
        }

    }
}
