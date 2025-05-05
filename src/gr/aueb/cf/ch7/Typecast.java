package gr.aueb.cf.ch7;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 */
public class Typecast {

    public static void main(String[] args) {
        double myDouble = 3.5;
        BigInteger bigInteger = new BigInteger("123456789");

        String strDouble = String.valueOf(myDouble);
        String strInt = bigInteger.toString();

        Scanner scanner = new Scanner(System.in);
        int num;
        String s;

        System.out.println("please input an integer");
        s = scanner.nextLine();
        num = Integer.parseInt(s);

        System.out.println(num);

        //String Upper Lower
        String str1 = "Athens";
        String str2 = "Athens";

        String upper = str1.toUpperCase();
        String lower = str2.toLowerCase();

        //if we didn't have equalsIgnoreCase() we would need to:

        boolean areEqual = str1.toUpperCase().equals(str2.toUpperCase());

        //String Trimm
        String s3  = "  Athens   ";
        String trimmed = s3.trim(); //"Athens" without whitespace
        //scanner.nextLin().trim();
    }
}
