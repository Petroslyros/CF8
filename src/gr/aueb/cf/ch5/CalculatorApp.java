package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Δημιουργήστε ένα απλό calculator που παίρνει ως είσοδο από
 * τον χρήστη δύο ακεραίων και ενός χαρακτήρα (+, -, *, /). Με την
 * καινούργια switch/case κάντε την αντίστοιχη πράξη και επιστρέψτε
 * το αποτέλεσμα στον χρήστη
 */
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        char charInput;
        int result = 0;

        System.out.println("Please input number one and number two");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Now input the arithmetic operation you would like to perform : ");
        System.out.println("Type + for addition");
        System.out.println("Type - for subtraction");
        System.out.println("Type * for multiplication");
        System.out.println("Type / for division");
        charInput = scanner.nextLine().charAt(0);

        switch (charInput){
            case '+' :
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
            case '*':
                result = num1 * num2;
            case '/':
                result = num1 / num2;

            default:
                System.out.println("Error in the operation");
                break;
        }
        System.out.printf("The result of %d " + charInput + " %d, equals to %d",num1,num2,result);

    }
}
