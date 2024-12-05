package com.org.transferapplication.dto;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Lombok annotation to automatically generate getters and setters
@AllArgsConstructor // Lombok annotation to generate a constructor with all fields as parameters

//The Account class represents a bank account entity.
public class Account {

    private String accountNo; // Account number of the bank account
    private double balance; // Balance available in the bank account

}
