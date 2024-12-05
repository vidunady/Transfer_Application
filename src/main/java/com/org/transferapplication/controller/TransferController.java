package com.org.transferapplication.controller;

import com.org.transferapplication.dto.Transaction;
import com.org.transferapplication.service.TransferService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//The TransferController class handles API requests related to money transfers.


@RestController // Marks this class as a REST controller
@RequestMapping(value= "/api") //Sets the base path for all endpoints in this controller
public class TransferController {

    private final TransferService transferService ;  // Declaring a private final variable to hold the TransferService dependency

    // Constructor for TransferController, accepts TransferService and assigns it to the transferService variable
    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping(value = "/transfers")  // PostMapping handles HTTP POST requests for /api/transfers URL
    public ResponseEntity<String> transfer(@RequestBody Transaction transaction) { // Invokes the transfer method in TransferService with details from the request body
        String result = transferService.transfer(
                transaction.getSourceAccountNo(),
                transaction.getDestinationAccountNo(),
                transaction.getAmount()

        );
        return ResponseEntity.ok(result);
    }
}
