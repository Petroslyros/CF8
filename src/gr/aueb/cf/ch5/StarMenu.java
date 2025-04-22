package gr.aueb.cf.ch5;

import java.util.Scanner;

public class StarMenu {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;


        while(true){
            printMenu();
            choice = scanner.nextInt();
            switch (choice){
                case 1: printHorizontal();
                break;
                case 2: printVertical();
                break;
                case 3: printNLines();
                break;
                case 4: printNLines1ToNStars();
                break;
                case 5: printNLinesNTo1Stars();
                break;
                case 6:
                    System.out.println("Thank you for using our app");
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
                    continue;
            }
            if(choice == 6) break;
        }

    }

    public static void printMenu(){
        System.out.println("Please choose one of the following: ");
        System.out.println("1. Print n stars horizontally ");
        System.out.println("2. Print n stars vertically");
        System.out.println("3. Print n lines with stars");
        System.out.println("4. Print n lines with stars 1 to n");
        System.out.println("5. Print n lines with stars n to 1");
        System.out.println("6. Exit app");
    }
    public static void printHorizontal(){

        int stars;
        System.out.println("How many stars would you like to print? ");
        stars = scanner.nextInt();

        for(int i = 1; i <= stars; i++){
            System.out.print("* ");
        }
        System.out.println();
    }
    public static void printVertical(){
        int stars;
        System.out.println("How many stars would you like to print? ");
        stars = scanner.nextInt();

        for(int i = 1; i <= stars;i++){
            System.out.println("*");
        }
        System.out.println();
    }

    public static void printNLines(){
        int lines;
        int stars;
        System.out.println("Please input how many lines and how many stars you'd like to print");
        lines = scanner.nextInt();
        stars = scanner.nextInt();

        for(int i = 1; i <= lines;i++){
            for(int j = 1; j <= stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printNLines1ToNStars(){

        int lines;
        System.out.println("Please input how many lines you want and we'll print accordingly :) ");
        lines = scanner.nextInt();

        for(int i = 1; i <= lines; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printNLinesNTo1Stars(){
        int lines;
        System.out.println("Please input how many lines you want and we'll print accordingly :) ");
        lines = scanner.nextInt();

        for(int i = 1; i <= lines;i++){
            for(int j = i; j <= lines; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
