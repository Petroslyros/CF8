package gr.aueb.cf.ch8;

import java.time.LocalDateTime;

/**
 * Η {@link SimpleBank} παρεχει μια υπηρεσια,
 * την υπηρεσια καταθεσης
 */
public class SimpleBank {
    static double balance = 0;

    public static void main(String[] args) {
        try{
            deposit(100);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            withdraw(100);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    /**
     * Deposits a certain amount of money
     *
     * @param amount the amount of money.
     */
    public static  void deposit(double amount) throws Exception {
        try {
            if(amount < 0) throw new Exception("Amount must be positive");
            balance += amount;
        } catch (Exception e){
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }

    }
    public static void withdraw(double amount) throws Exception {
        try{
            if(amount < 0) throw new Exception("Amount must be positive");
            balance -= amount;
        } catch (Exception e){
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }


}
