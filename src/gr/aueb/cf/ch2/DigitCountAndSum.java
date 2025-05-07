package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DigitCountAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int digitsCount = 0;
        int dititSum = 0;
        int tempNum;
        int rightDigit;

        System.out.println("Please input an integer:");
        inputNum = scanner.nextInt();
        tempNum = inputNum;

        do{
            rightDigit = tempNum % 10;
            digitsCount++;
            dititSum += rightDigit;
            tempNum = tempNum / 10;

        }while (tempNum != 0);
        System.out.println("You provided the number " + inputNum);
        System.out.printf("Digit count %d , Digit Sum %d " ,digitsCount, dititSum);
    }
}
