package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει μίλια σε χιλιόμετρα, οπου
 * ένα μίλι = 1.6 χλμτρα. Άρα 10 μίλια = 16 χλμτρα
 */

public class MilesToKm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputMiles = 0.0;
        double kilometers = 0.0;
        final double KM_Per_Mile = 1.6;

        System.out.println("Παρακαλώ εισάγετε μίλια: ");
        inputMiles = scanner.nextDouble();
        kilometers = inputMiles * KM_Per_Mile;

        System.out.println("Miles : " + inputMiles + ", Km: " + kilometers);

    }
}
