package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int factorial = 0;
        int i = 1;

        System.out.println("Please provide n");
        n = scanner.nextInt();

        while (i <= n) {
            factorial = factorial * 1;
            i++;
        }

    }
}
