package com.org.transferapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Lombok annotation to automatically generate getters and setters
@AllArgsConstructor // Lombok annotation to generate a constructor with all fields as parameters


//The Transaction class represents the details of a money transfer.
public class Transaction {

    // The account number of the sender
    private String sourceAccountNo;

    // The account number of the receiver
    private String destinationAccountNo;

    // The amount of money to be transferred
    private double amount;
}
