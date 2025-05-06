package gr.aueb.cf.ch7;

public class StringEquals {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = new String("Athens");
        String s4 = "ATHENS";

        boolean equals1 = s1 == s2;  // true
        boolean equals2 = s1 == s3;  //false

        boolean equals3 = s1.equals(s2);
        boolean equals4 = s1.equals(s3);

        boolean equals5 = s1.equals(s4);
        boolean equals6 = s1.equalsIgnoreCase(s4);


        //COMPARE TO

        if(s1.compareTo(s4) > 0){
            System.out.println("s1 > s4");
        } else if (s1.compareTo(s4) < 0) {
            System.out.println("s1 < s4");
        } else {
            System.out.println("s1 equals s4");
        }

        if(s1.compareToIgnoreCase(s4) > 0){
            System.out.println("s1 > s4");
        } else if (s1.compareToIgnoreCase(s4) < 0) {
            System.out.println("s1 < s4");
        } else {
            System.out.println("s1 equals s4");
        }

        //COPY
        String s7 = s1; //safe copy

    }
}
