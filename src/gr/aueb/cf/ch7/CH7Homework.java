package gr.aueb.cf.ch7;

public class CH7Homework {

    public static void main(String[] args) {

        String s = "petros";
        System.out.println(encrypt(s));
        System.out.println(decrypt(encrypt(s)));

    }
    public static String encrypt(String s){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            String letter = s.substring(i, i+ 1);

            if(letter.equals("z")){
                sb.append("a");
            } else sb.append((char)(letter.charAt(0) + 1));

        }
        return sb.toString();
    }

    public static String decrypt(String s){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            String letter = s.substring(i, i+1);
            if(letter.equals("a")){
                sb.append("z");
            } else sb.append((char)(letter.charAt(0) -1));

        }
        return sb.toString();
    }
    public static String caesarEncrypt(String s){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            String letter = s.substring(i, i+1);
            if(letter.equals("z")){
                sb.append("a");
            } else sb.append((char)s.charAt(i)+1);
        }
        return sb.toString();
    }

}
