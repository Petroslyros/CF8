package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * Το {@link java.util.InputMismatchException} οταν
 * ο scanner αποτυγαχνει να διαβασει το σωστο
 * data type
 */
public class ExceptionINputMismatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;

        System.out.println("Please input an integer: ");
        num1 = scanner.nextInt(); // Gives InputMismatch if a non integer type is given

        while(!scanner.hasNextInt()){
            System.out.println("Non acceptable characters. Please input an integer");
            scanner.nextLine();
        }
        num1 = scanner.nextInt();
        System.out.println("Num : " + num1);
    }
}
