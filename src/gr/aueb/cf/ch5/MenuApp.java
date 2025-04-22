package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * εμφανιζει ενα μενου επιλογων με τη χρηση μεθοδων αυτη τη φορα
 *
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;



        do{
            //printmenu()
            choice = scanner.nextInt();
            switch (choice){
                case 1 -> System.out.println("successful input");
                case 2 -> System.out.println("successful deleteion");
                case 3 -> System.out.println("successful update");
                case 4 -> System.out.println("successful search");
                case 5 -> System.out.println("successful exit");
                default -> System.out.println("Wrong choice, try again");
            }

        } while(choice != 5); // 5 is exit
    }

    public static void printMenu(){
        System.out.println("Please choose one of the following");
        System.out.println("1. Input");
        System.out.println("2. Delete");
        System.out.println("3. Update");
        System.out.println("4. Search");
        System.out.println("5. Exit ");
    }

}
