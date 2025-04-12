package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρίσκει το απόλυτο δυο ακεραίων με τη χρήση τριαδικού τελεστή
 */
public class AbsTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int abs;

        System.out.println("Please provide 2 integers: ");
        num1 = scanner.nextInt();

        abs = (num1 >= 0) ? num1 : -num1;
    }
}
