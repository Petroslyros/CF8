package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StringIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        System.out.println("Please input 2 strings");
        s1 = scanner.next();   //reads until it finds whitespace
        s2 = scanner.nextLine(); //reads until it finds a new line

        System.out.printf("s1 = %s\n", s1);
        System.out.printf("s2 = %s\n", s2);
    }
}
