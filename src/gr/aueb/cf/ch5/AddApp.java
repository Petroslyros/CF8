package gr.aueb.cf.ch5;

import java.util.Scanner;

public class AddApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int sum;

        System.out.println("Please input two integers to add : ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = add(num1,num2);

        System.out.printf("The result of %d + %d = %d", num1,num2,sum);
    }


    public static int add(int a, int b){
        return a + b;
    }
}
