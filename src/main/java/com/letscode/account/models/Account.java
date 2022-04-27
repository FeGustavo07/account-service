package com.letscode.account.models;

import com.letscode.account.dto.AccountRequest;
import com.letscode.account.models.enums.AccountType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "account")
@RequiredArgsConstructor
@Getter @Setter
public class Account {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private int number;

    @Column
    private int agency;

    @Column()
    private BigDecimal balance;

    @Column
    @CreatedDate
    private LocalDateTime registrationDate;

    @Column
    @LastModifiedDate
    private LocalDateTime updateDate;

    @Column
    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    public Account(AccountRequest accountRequest) {
        this.accountType = accountRequest.getAccountType();
        this.agency = accountRequest.getAgency();
        this.balance = accountRequest.getBalance();
        this.number = accountRequest.getNumber();
        this.registrationDate = accountRequest.getRegistrationDate();
        this.updateDate = accountRequest.getUpdateDate();
    }
}
