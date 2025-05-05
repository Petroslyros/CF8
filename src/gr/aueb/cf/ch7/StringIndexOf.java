package gr.aueb.cf.ch7;

public class StringIndexOf {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf('o'); // or "o"
        System.out.println(positionOfo);

        int positionOfNexto = cf.indexOf("o", 2); //11

        int positionOfLasto = cf.lastIndexOf("o"); //11
        System.out.println(positionOfLasto);
    }
}
