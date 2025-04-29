package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Short come for integer input until we get -1
 */
public class Sentinel2App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please enter integer: ");

        while((num = scanner.nextInt()) != -1){
            iterations++;
            System.out.println("Please provide next int: ");

        }
        System.out.printf("%d iterations", iterations);
    }
}
