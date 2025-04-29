package gr.aueb.cf.ch3;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.println("Please enter the year you want to check is leap: ");
        year = scanner.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("The year your provided is a leap year");
        } else {
            System.out.println("The year your provided is not a leap year");
        }
    }
}
