package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int result;

        while (true) {
            printMenu();
            choice = getOneInt();
            if (!isChoiceValid(choice)) {
                System.out.println("Wrong choice, the choice needs to be between 1 to 6");
                continue;
            }

            if(isExit(choice)){
                System.out.println("Thank you for using our calculator");
                break;
            }

        }
    }

    public static void printMenu() {
        System.out.println("Choose one of the following");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("6. Exit");
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }
    public static boolean isChoiceValid(int choice){
        return choice >= 1 && choice <= 6;
    }
    public static boolean isExit(int choice){
        return choice == 6;
    }
}
