package gr.aueb.cf.ch7;

public class StringFormat {
    public static void main(String[] args) {
        String s = "Coding";
        int num = 10;

        String formattedStr = String.format("%s: %d", s, num);
        System.out.println(formattedStr);

        //Concat (ενωνει δυο η περισσοτερα strings)
        String s1 = "Coding";
        String s2 = "Factory";

        String s3 = s1 + s2; // + operator in java is overloaded
        String s4 = s1.concat(s2);

        String s5 = s1 + " " + s2;
        String s6 = s1.concat(" ").concat(s2);

        System.out.println("*".repeat(10));

        String ss1 = "Coding Factory";
        String ss2 = "Coding.Factory";
        String ss3 = "Coding          Factory";

        //replace

        String replaced1 = s1.replace(" ",":");
        System.out.println(replaced1);

        String replaced2 = s2.replaceAll("\\.","");
        System.out.println(replaced2);

        String replaced3 = s3.replaceAll("\\s+"," ");
        System.out.println(replaced3);
    }
}
