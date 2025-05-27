package gr.aueb.cf.ch15.custom_exceptions;

import java.time.LocalDateTime;

public class Account {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;


    public Account(){

    }

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //PUBLIC API

    /**
     * Deposits a certain amount of money
     * @param amount the amount of money to be deposited
     * @throws NegativeAmountException if the amount is negative
     */
    public void deposit(double amount)throws NegativeAmountException{
        try {
          if(amount < 0){
              throw new NegativeAmountException("Negative amount is not valid.");
          }
          balance += amount;
        } catch (Exception e){
            System.err.println(LocalDateTime.now() + "Negative amount : " + amount + "is negative.\n" + e);
            throw e;
        }
    }

    /**
     * Withdraws a certain amount of money from {@link Account}
     * First checks if SSN is valid by caling {@link Account#isSsnValid(String)}
     * @param amount to be withdrawn
     * @param ssn check if ssn is valid
     * @throws NegativeAmountException
     * @throws InsufficientBalanceException
     * @throws SsnNotValidException
     */
    public void withdraw(double amount, String ssn) throws NegativeAmountException, InsufficientBalanceException, SsnNotValidException{
        try{
            if(amount < 0){
                throw  new NegativeAmountException("The amount " + amount + "is negative");
            } else if(balance < amount){
                throw new InsufficientBalanceException("The balance " + balance + "is not sufficient");
            } else if(!isSsnValid(ssn)){
                throw new SsnNotValidException("SSN" + ssn + "is not valid");
            }
            balance -= amount;
        } catch (NegativeAmountException | InsufficientBalanceException | SsnNotValidException e){
            System.err.println(LocalDateTime.now() + "\n" + e);
            e.printStackTrace();
            throw e;
        }
    }
    private boolean isSsnValid(String ssn){
        return ssn.equals(this.ssn);
    }

    /**
     * returns the balance of the {@link Account}
      * @return
     */
    public double getAccountBalance(){
        return getBalance();
    }

    /**
     * @return  provides the user with the account information of id, iban, firstname, lastname, ssn, balance
     */
    public String accountToString(){
        return "(" + getId() + ", " + iban + ", " + firstname + ", " + lastname + ", " + ssn + ", " + balance + ")";
    }
}
