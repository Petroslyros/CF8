package gr.aueb.cf.bankapp.core.mapper;

import gr.aueb.cf.bankapp.dto.AccountInsertDto;
import gr.aueb.cf.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.bankapp.model.Account;

public class Mapper {


    /**
     * NO instances of this class should be available
     */
    private Mapper(){

    }

    public static Account mapToModelEntity(AccountInsertDto dto) {
        return new Account(dto.getIban(), dto.getBalance());
    }

    public static AccountReadOnlyDTO mapToReadOnlyDTO(Account account){
        return new AccountReadOnlyDTO(account.getIban(), account.getBalance());
    }
}
