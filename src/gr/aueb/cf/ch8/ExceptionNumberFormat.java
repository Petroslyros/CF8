package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * Happens when {@link Integer#parseInt(String)}fails
 */
public class ExceptionNumberFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        String inputStr = "";

        System.out.println("Please input an integer: ");

        inputStr = scanner.nextLine();
        while(!isInteger(inputStr = scanner.nextLine())){
            System.out.println("Please try again");
        }
        num1 = Integer.parseInt(inputStr);

    }

    public static boolean isInteger(String s) {
            return s.matches("-?\\d+");
    }
}
