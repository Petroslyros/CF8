package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base;
        int power = 0;
        int result = 1;
        BigInteger bigResult = new BigInteger("1");

        System.out.println("Please provide the base and the power : ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        for(int i = 1; i <= power; i++){
            result = result  * base;
            bigResult = bigResult.multiply(BigInteger.valueOf(base));
        }

        System.out.printf("%d ^ %d = %d", base,power, result);
        System.out.println("Big Result: " + bigResult);

    }
}
