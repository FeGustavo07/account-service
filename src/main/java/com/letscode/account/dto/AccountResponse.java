package com.letscode.account.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.letscode.account.models.Account;
import com.letscode.account.models.enums.AccountType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@RequiredArgsConstructor
public class AccountResponse {
    private Long id;
    private int number;
    private int agency;
    private BigDecimal balance;
    @JsonProperty("registration-date")
    private LocalDateTime registrationDate;
    @JsonProperty("update-date")
    private LocalDateTime updateDate;
    @JsonProperty("account-type")
    private AccountType accountType;

    public AccountResponse(Account account) {
        this.id = account.getId();
        this.number = account.getNumber();
        this.agency = account.getAgency();
        this.accountType = account.getAccountType();
        this.balance = account.getBalance();
        this.registrationDate = account.getRegistrationDate();
        this.updateDate = account.getUpdateDate();
    }

    public static List<AccountResponse> toResponse(List<Account> accounts) {
        return accounts.stream().map(AccountResponse::new).collect(Collectors.toList());
    }
}
