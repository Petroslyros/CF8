package gr.aueb.cf.ch7;

/**
 * Prints char by char with the use of String.subString
 */
public class TraverseWithSubString {

    public static void main(String[] args) {
        String s = "Coding";
        traverse(s);
    }

    public static void traverse(String s){
        for(int i = 0; i <s.length(); i++){
            System.out.print(s.substring(i, i+1));
        }
    }
}
