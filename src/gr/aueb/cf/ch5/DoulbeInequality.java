package gr.aueb.cf.ch5;

/**
 * Συγκρινει 2 double που κανονικα θα έπρεπε να είναι ίσοι
 * αλλά λόγω του σφάλματος αναπαράστασης
 */
public class DoulbeInequality {
    public static void main(String[] args) {
        double actual = 0.0;
        double expected = 1.0;

        for(int i = 1; i <= 10; i++){
            actual += 0.1;
        }

        if(actual == expected) System.out.println("Equal");
        else System.out.println("Not equal");


    }
}
