package gr.aueb.cf.ch18.book_example.validation;

import gr.aueb.cf.ch18.book_example.dto.BookInsertDTO;

import java.util.HashMap;
import java.util.Map;

public class Validator {

    private Validator(){};


    public static Map<String, String> validate (BookInsertDTO dto){
        Map<String, String> errors = new HashMap<>();

        if(dto.getIsbn() == null || dto.getIsbn().trim().length() < 5){
            errors.put("isbn", "The isbn cannot be less than 5 numbers");
        }

        return errors;
    }

}
