package gr.aueb.cf.ch7;

public class StrPalindrome {
    public static void main(String[] args) {
        String s = "AttA";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome2(s));

    }

    public static boolean isPalindrome (String s){
        StringBuilder sb = new StringBuilder(s);

        return sb.reverse().toString().equals(s);
    }

    public static boolean isPalindrome2(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() -1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return s.equals(sb.toString());
    }
}
