package gr.aueb.cf.ch7;

/**
 * Parsing of a String finding
 * a substring
 */
public class SubstringApp {

    public static void main(String[] args) {
        String s = "Coding Factory";
        String subStr;
        String subStr2;

        subStr = s.substring(1); //"oding Factory"
        subStr2 = s.substring(1,3);

        System.out.println(subStr);
        System.out.println(subStr2);

        String s1 = "Athens:Uni:Of:Eco:And:Business:";

        String[] tokens = s.split(":");

        for(String token: tokens){
            System.out.println(token + " ");
        }
    }
}
