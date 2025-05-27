package gr.aueb.cf.ch14;

public class StringUtil {

    public StringUtil(){}

    public static String reverseString(String s){
        StringBuilder sb = new StringBuilder();

        for(int i = s.length() -1; i >= 0 ; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static String stringToUpperCase(String s){
         return s.toUpperCase();
    }
    public static boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
}
