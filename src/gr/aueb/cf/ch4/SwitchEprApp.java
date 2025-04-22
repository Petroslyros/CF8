package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Conditional assignment
 */
public class SwitchEprApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;
        char classification;

        System.out.println("Please input grade ");
        grade = scanner.nextInt();

        classification = switch (grade){
            case 1, 2, 3, 4 -> 'F';
            case 5, 6 -> 'G';
            case 7,8 -> 'V';
            case 9,10 -> 'E';
            default -> '?';
        };
        System.out.println(classification);
    }
}
