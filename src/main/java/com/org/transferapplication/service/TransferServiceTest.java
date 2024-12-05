package com.org.transferapplication.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransferServiceTest {

    @Test
    public void testSuccessfulTransfer() {
        TransferService service = new TransferService();
        String result = service.transfer("12345","67890",100.0);
        assertEquals("Transfer Successful.",result);
    }

    @Test
    public void testInsufficientBalance() {
        TransferService service = new TransferService();
        String result = service.transfer("12345","67890",600.0);
        assertEquals("Insufficient Balance.",result);
    }
}
