package gr.aueb.cf.bankapp.service;

import gr.aueb.cf.bankapp.dto.AccountInsertDto;
import gr.aueb.cf.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.bankapp.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.bankapp.core.exceptions.NegativeAmountException;

import java.math.BigDecimal;
import java.util.List;

public interface IAccountService {
    boolean createNewAccount(AccountInsertDto dto);
    // update, remove
    void deposit(String iban, BigDecimal amount) throws NegativeAmountException, AccountNotFoundException;
    void withdraw(String iban, BigDecimal amount) throws NegativeAmountException, AccountNotFoundException, InsufficientBalanceException;
    BigDecimal getBalance(String iban) throws AccountNotFoundException;
    List<AccountReadOnlyDTO> getAccounts();
    // getAccountByID();
}
