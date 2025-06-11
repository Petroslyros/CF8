package gr.aueb.cf.bankapp;

import gr.aueb.cf.bankapp.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.bankapp.dao.AccountDAOImpl;
import gr.aueb.cf.bankapp.dao.IAccountDAO;
import gr.aueb.cf.bankapp.dto.AccountInsertDto;
import gr.aueb.cf.bankapp.service.AccountServiceImpl;
import gr.aueb.cf.bankapp.service.IAccountService;
import gr.aueb.cf.ch15.custom_exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch15.custom_exceptions.NegativeAmountException;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    private final static IAccountDAO accountDAO = new AccountDAOImpl();
    private final static IAccountService accountService = new AccountServiceImpl(accountDAO);
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String option;
        while (true){
            printMenu();
            option = scanner.nextLine();

            try{
                switch (option){
                    case "1":
                        System.out.print("Please input iban: ");
                        String iban = scanner.nextLine();
                        System.out.print("Please input the amount: ");
                        BigDecimal initialBalance = new BigDecimal(scanner.nextLine());
                        AccountInsertDto accountInsertDto = new AccountInsertDto(iban,initialBalance);

                        // Validation

                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                    default:
                        System.out.println("Not a valid input");
                }
            } catch (NegativeAmountException | InsufficientBalanceException | AccountNotFoundException e) {
                System.out.println("Error. "  + e.getMessage());

            } catch (NumberFormatException e){
                System.out.println("Wrong Input, please try numbers");
            }

        }


    }
    public static void printMenu(){
        System.out.println("\n Account Service Menu ===");
        System.out.println("1. Create new account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Account balance");
        System.out.println("5. Print all accounts");
        System.out.println("6. Exit Service Menu");
        System.out.print("Please select on of the above : ");
    }
}
