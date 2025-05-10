package basics;

public class PracticeBlank {
    public static void main(String[] args) {



        }
    public static String caesarEncrypt(String s){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            if(letter == 'z'){
                sb.append('a');
            } else {
                sb.append((char) (letter + 3));
            }
        }
        return sb.toString();
    }

    }




