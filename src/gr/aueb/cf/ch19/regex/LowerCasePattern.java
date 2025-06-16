package gr.aueb.cf.ch19.regex;

import java.util.regex.Pattern;

/**
 * Κανει match 8 τουλαχιστον χαρακτηρες εκ των οποιων
 * τουλαχιστον 1ας ειναι πεζος
 */
public class LowerCasePattern {

    public static void main(String[] args) {
        String s = "bU34&#PP";

        Pattern pattern = Pattern.compile("(?=.*?[a-z])(?=.*?[A-Z])^.{8,}$");
    }
}
