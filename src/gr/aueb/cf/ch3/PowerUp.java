package gr.aueb.cf.ch3;

import java.util.Scanner;

/**Λαμβάνει απο τον χρήστη δύο ακεραίους, έστω
 * base και power και υπολογίζει με επαναληπτικό τρόπο
 * (while-do) τη δύναμη base ^ power και εκτυπώνει το αποτέλσμα
 */
public class PowerUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base;
        int power;
        int result = 1;
        int i = 1;

        System.out.println("Please input the base: ");
        base = scanner.nextInt();
        System.out.println("Please input the power you would like to raise the base");
        power = scanner.nextInt();

        while (i <= power){
            result = result * base;
            i++;
        }
        System.out.println("Result is " + result);
    }
}
