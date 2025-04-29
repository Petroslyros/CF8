package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει για πάντα και όταν βρεί τον sentinel
 * διακόπτε το loop. Η διακοπή και έξοδος απο μια λουπα
 * γίνεται με 'break'
 */
public class Sentinel3App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = 0;
        int num = 0;

        while (true){
            System.out.println("Please input an integer (-1 to exit) : ");
            num = scanner.nextInt();
            if(num == -1){
                break;
            }
            iterations++;
        }
        System.out.println("Iterations : " + iterations );

    }
}
