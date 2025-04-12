package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ειδικές περιπτώσεις της while
 */

public class SpecialWhileApp {
    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);

        while(i <= 0){
            System.out.println("Δεν μπαινει ποτε μεσα στη λουπα ");
        }

        while(scanner.nextInt() != -1); //απλως καταναλωνει το input μεχρι να βρει -1


        while(i <= 1){
            System.out.println("Μπαινει μονο μια φορα");
            i++;
        }

        while(true) {
            System.out.println("Εκτελείτε για παντα");
        }

    }
}
