package gr.aueb.cf.ch8;

import java.util.Scanner;

public class Arithmetic2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int result;

        while(true){
            System.out.println("Please input 2 ints");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            if(num1 == 0) break;

            num2 = scanner.nextInt();

            if(num2 == 0){
                System.out.println("Παρονομαστης δεν μπορει να ειναι 0");
                continue;
            }
            result = num1 / num2;
            System.out.println(result);
        }
    }
}
