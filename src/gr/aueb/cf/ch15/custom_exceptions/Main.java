package gr.aueb.cf.ch15.custom_exceptions;

public class Main {
    public static void main(String[] args) {

        Account aliceAccount = new Account(1, "GR123456", "Alice", "W.","F0654321",100);

        try{
            aliceAccount.deposit(500);
            System.out.println(aliceAccount.accountToString());
            aliceAccount.withdraw(50,"F0654321");

            System.out.println(aliceAccount.accountToString());
            aliceAccount.withdraw(100, "AB123"); //throws exception

        } catch (NegativeAmountException e){
            System.out.println("The amount you deposited is below 0, please try again");
        } catch (InsufficientBalanceException e){
            System.out.println("The balance is not sufficient, please try again");
        } catch (SsnNotValidException e){
            System.out.println("The SSN provided is not valid, please try again");
        }
    }
}
