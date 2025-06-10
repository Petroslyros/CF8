package gr.aueb.cf.bankapp.dto;

import gr.aueb.cf.bankapp.model.Account;

import java.math.BigDecimal;

public class AccountInsertDto {
    private String iban;
    private BigDecimal balance;

    public AccountInsertDto(){}

    public AccountInsertDto(String iban, BigDecimal balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountInsertDto{" +
                "iban='" + iban + '\'' +
                ", balance=" + balance +
                '}';
    }
}
