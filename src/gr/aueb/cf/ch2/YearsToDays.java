package gr.aueb.cf.ch2;

import java.util.Scanner;

public class YearsToDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearsInput;
        final int days = 365;
        int result = 0;

        System.out.println("Please input your age: ");
        yearsInput = scanner.nextInt();
        result = yearsInput * days;

        System.out.println("Your age in days is " + result);
    }
}
