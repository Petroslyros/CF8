package gr.aueb.cf.ch2;

/**
 * Εμφανίζει την ημερομηνία σε μορφή
 * dd/mm/yyyy
 */
public class DateApp   {
    public static void main(String[] args) {

        int day = 12;
        int month = 4;
        int year = 2025;

        System.out.println("The date is : " + day + "/" +month + "/" +year);
        System.out.printf("The day is : %02d/%02d/%2d", day,month,year);

    }
}
