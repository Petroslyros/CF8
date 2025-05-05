package gr.aueb.cf.ch7;

/**
 * Traverses a String one-by-one all char.
 */
public class StringTraverse {

    public static void main(String[] args) {
        String s = "Coding Factory";

        for(int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i) + " ");
        }

        System.out.println();

        //prints the reverse of the string
        for(int i = s.length() -1; i >= 0; i--){
            System.out.print(s.charAt(i) + " ");
        }


        //STARSTS WITH
        String str = "Coding";

        if(str.startsWith("Cod")){
            System.out.println("Starting with Cod ....");
        } else {
            System.out.println("Not starting with code");
        }

        if(str.startsWith("od",1)){
            System.out.println("Starting with Cod ....");
        } else {
            System.out.println("Not starting with code");
        }
    }

}
