package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Displays a menu of choices until the user inputs exit
 *
 */
public class MenuAPp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        final int EXIT = 3;

        do{
            System.out.println("Please select one of the below choices: ");
            System.out.println("1. Input product: ");
            System.out.println("2. Delete product ");
            System.out.println("3. Exit ");
            choice = scanner.nextInt();

        }while (choice != EXIT);

        System.out.println("Thank you for using our application");
    }
}
