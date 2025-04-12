package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * ο χρήστης εισάγει έναν ακέραιο και προσπαθεί να μαντέψει
 * έναν ακέραιο. Αν τον μαντέψει, τότε κάνει Bingo
 */
public class SecretIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 10;
        int inputNum;

        System.out.println("Please enter your guess : ");
        inputNum = scanner.nextInt();

        if(inputNum == SECRET){
            System.out.println("Success");
        }else {
            System.out.println("Wrong guess");
        }

    }
}
