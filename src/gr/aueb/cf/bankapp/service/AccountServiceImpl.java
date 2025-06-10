package gr.aueb.cf.bankapp.service;

import gr.aueb.cf.bankapp.dao.AccountDAOImpl;
import gr.aueb.cf.bankapp.dao.IAccountDAO;
import gr.aueb.cf.bankapp.dto.AccountInsertDto;
import gr.aueb.cf.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.bankapp.exceptions.AccountNotFoundException;
import gr.aueb.cf.bankapp.exceptions.InsufficientBalanceException;
import gr.aueb.cf.bankapp.exceptions.NegativeAmountException;
import gr.aueb.cf.bankapp.model.Account;

import java.math.BigDecimal;
import java.util.List;

public class AccountServiceImpl implements IAccountService {

//    private final IAccountDAO accountDAO = new AccountDAOImpl();

    private final IAccountDAO accountDAO;
    public AccountServiceImpl(IAccountDAO accountDAO){
        this.accountDAO = accountDAO;
    }

    @Override
    public boolean createNewAccount(AccountInsertDto dto) {
        return false;
    }

    @Override
    public void deposit(String iban, BigDecimal amount) throws NegativeAmountException, AccountNotFoundException {
        try {
            Account account = accountDAO.getByIban(iban)
                    .orElseThrow(() -> new AccountNotFoundException("Account with iban " + iban + "not found."));

            if(amount.compareTo(BigDecimal.ZERO) < 0){
                throw new NegativeAmountException("Invalid amount: " +account+ ". Amount must be positive (input was negative)");
            }

            account.setBalance(account.getBalance().add(amount));
            accountDAO.saveOrUpdate(account);


        } catch (NegativeAmountException e){

        } catch (AccountNotFoundException e){

        }
    }

    @Override
    public void withdraw(String iban, BigDecimal amount) throws NegativeAmountException, AccountNotFoundException, InsufficientBalanceException {

    }

    @Override
    public BigDecimal getBalance(String iban) throws AccountNotFoundException {
        return null;
    }

    @Override
    public List<AccountReadOnlyDTO> getAccounts() {
        return List.of();
    }
}
