package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει μια τιμή και το πρόγραμμα υπολογίζει την τιμή με το ΦΠΑ
 */


public class PriceWIthVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputPrice = 0.0;
        final double VAT_RATE = 0.24;
        double priceWithVat = 0.0;
        double computedVat = 0.0;

        System.out.print("Παρακαλώ είσαγετε τιμή : ");
        inputPrice = scanner.nextDouble();
        priceWithVat = inputPrice + (inputPrice * VAT_RATE);

        System.out.printf("Price %.2f, Vat : %.2f, Price with VAT : %.2f" , inputPrice, computedVat , priceWithVat);
    }
}
