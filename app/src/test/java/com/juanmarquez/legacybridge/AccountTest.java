package com.juanmarquez.legacybridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    private Account account;
    @BeforeEach
    void setUp() {
        account = new Account("1234567890", new BigDecimal("500.00"));
    }

    @Test
    void shouldReturnTheAccountNumberItWasCreatedWith() {
        assertEquals("1234567890", account.getAccountNumber());
    }

    @Test
    void shouldReturnTheBalanceItWasCreatedWith() {
        assertEquals(new BigDecimal("500.00"), account.getBalance());
    }
}
