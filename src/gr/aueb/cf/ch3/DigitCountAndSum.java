package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει ένα ακέραιο. Το πρόγραμμα
 * υπολογίζει το πλήθος των ψηφίων του ακεραίου
 * και το άθροισμα των φηφίων.
 * Για παράδειγμα αν ο χρήστης εισάγει τον ακέραιο 12345
 * τότε το πλήθος των ψηφίων είναι 5 και το άθροισμα είναι 15
 */
public class DigitCountAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int digitsCount = 0;
        int digitsSum = 0;
        int tempNum;
        int rightDigit;

        System.out.println("Please input a integer ");
        inputNum = scanner.nextInt();
        tempNum = inputNum;

        do {
            rightDigit = tempNum % 10;
            digitsCount++;
            digitsSum += rightDigit;
            tempNum = tempNum / 10;

        } while (tempNum != 0);
        System.out.println("You provided the number " + inputNum);
        System.out.printf("Digit count %d , Digit Sum %d", digitsCount, digitsSum);
    }
}
