package com.letscode.account.dto;

import com.letscode.account.models.enums.AccountType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class AccountResponse {
    private Long id;
    private int number;
    private int agency;
    private BigDecimal balance;
    private LocalDateTime registrationDate;
    private LocalDateTime updateDate;
    private AccountType accountType;
}
