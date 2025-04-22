package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Modern Switch
 */

public class GradeWithModerSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;

        System.out.println("Please provide your grade: ");
        grade = scanner.nextInt();
        switch (grade) {
            case 1,2,3,4 -> System.out.println("Failure ");
            case 5,6 -> System.out.println("Good");
            case 7,8 -> System.out.println("Very good! ");
            case 9,10 -> System.out.println("Excellent!");
            default -> System.out.println("Wrong choice, please try again");
        }
    }
}
