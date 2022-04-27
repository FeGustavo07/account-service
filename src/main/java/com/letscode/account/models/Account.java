package com.letscode.account.models;

import com.letscode.account.models.enums.AccountType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Account {
    private Long id;
    private int number;
    private int agency;
    private BigDecimal balance;
    private LocalDateTime registrationDate;
    private LocalDateTime updateDate;
    private AccountType accountType;
}
