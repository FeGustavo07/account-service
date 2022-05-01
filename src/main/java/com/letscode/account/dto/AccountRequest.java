package com.letscode.account.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.letscode.account.models.enums.AccountType;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
public class AccountRequest {
    private int number;
    private int agency = 1;
    private BigDecimal balance = BigDecimal.valueOf(0);
    private LocalDateTime registrationDate;
    private LocalDateTime updateDate;
    @JsonProperty("account-type")
    private AccountType accountType;
}
