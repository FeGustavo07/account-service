package com.letscode.account.dto;

import com.letscode.account.models.enums.AccountType;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
public class AccountRequest {
    private int number;
    private int agency;
    private BigDecimal balance;
    private LocalDateTime registrationDate;
    private LocalDateTime updateDate;
    private AccountType accountType;
}
