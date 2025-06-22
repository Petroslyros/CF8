package gr.aueb.cf.bankapp.validation;

import gr.aueb.cf.bankapp.dto.AccountInsertDto;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Validator {

    /**
     * No instance of this class should be available.
     */

    private Validator(){}

    public static Map<String, String> validate(AccountInsertDto dto){
        Map<String, String> errors = new HashMap<>();

        if(dto.getIban()== null || dto.getIban().trim().matches("^GR\\d{15}")){
            errors.put("iban", "The iban cannot be less than 5 numbers");
        }

        if(dto.getBalance() == null || dto.getBalance().compareTo(BigDecimal.ZERO) < 0) {
            errors.put("balance", "The initial amount cannot be negative");
        }

        //We could check whether the iban already exists (with a Service method (isIbanExists()) or something similar)

        return errors;
    }
}
