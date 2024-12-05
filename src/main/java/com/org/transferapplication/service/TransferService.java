package com.org.transferapplication.service;

import com.org.transferapplication.dto.Account;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service // Marks this class as a Spring service component

//The TransferService class provides the business logic for transferring money between accounts.
public class TransferService {

    private final Map<String, Account> accounts = new HashMap<>();
    // A map to simulate a database of accounts with account numbers as keys

        //Constructor for TransferService.
        //Initializes the service with a few predefined accounts.
    public TransferService() {
        accounts.put("12345", new Account("12345", 500.00));
        accounts.put("67890", new Account("67890", 100.00));
    }

    //Handles the transfer of money between two accounts.
    public String transfer(String sourceAccountNo, String destinationAccountNo, double amount) {
        Account source = accounts.get(sourceAccountNo);  // Retrieve the source account
        Account destination = accounts.get(destinationAccountNo);  // Retrieve the destination account

        // Check if both accounts exist
        if (source == null || destination == null) {
            return "Account not found";
        }
        // Check if the source account has sufficient balance
        if (source.getBalance() < amount) {
            return "Insufficient balance";
        }

        // Perform the transfer by updating the balances
        source.setBalance(source.getBalance() - amount);
        destination.setBalance(destination.getBalance() + amount);

        return "Transfer successful";
    }

    //Provides access to the in-memory accounts map.
    // Useful for retrieving account details or verifying account states.
    public Map<String, Account> getAccounts() {
        return accounts;
    }
}
