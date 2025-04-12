package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuApp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choiceInput;


        do{

            System.out.println("Please select one of the below choices: ");
            System.out.println("1. Input product: ");
            System.out.println("2. Delete product ");
            System.out.println("3. Update product ");
            System.out.println("4. Search product ");
            System.out.println("5. Exit ");
            choiceInput = scanner.nextInt();

            if(choiceInput == 1){
                System.out.println("You chose input");
            } else if(choiceInput == 2){
                System.out.println("You chose Delete");
            } else if(choiceInput == 3){
                System.out.println("You chose Update");
            } else if(choiceInput == 4){
                System.out.println("You chose Search");
            } else if(choiceInput == 5){
                System.out.println("Thank you for using our application! ");
                break;
            }else {
                System.out.println("Not a valid choice");
            }
        } while (true);


    }
}
