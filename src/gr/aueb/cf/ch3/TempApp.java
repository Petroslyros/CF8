package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Gets an integer temperature value from the user
 * and display the appropriate message if the temperature is below 0
 */
public class TempApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature;
        boolean isTempBelowZero = false;

        System.out.print("Please input a temperature: ");
        temperature = scanner.nextInt();

        isTempBelowZero = temperature < 0;
        System.out.println("The temperature is below 0 : " + isTempBelowZero);


    }
}
