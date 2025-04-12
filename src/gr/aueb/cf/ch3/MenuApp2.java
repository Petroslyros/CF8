package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εκφράζει την λογική της do while αλλα με
 * την χρήση αέναου while-do και sentinel
 */

public class MenuApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do{
            if(choice == 3){
                System.out.println("Thank you for using our application");
                break;
            }
            System.out.println("Please select one of the below choices: ");
            System.out.println("1. Input product: ");
            System.out.println("2. Delete product ");
            System.out.println("3. Exit ");
            choice = scanner.nextInt();
        }while (true);
    }
}
