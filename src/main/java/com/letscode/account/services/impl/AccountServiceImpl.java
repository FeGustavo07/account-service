package com.letscode.account.services.impl;

import com.letscode.account.dto.AccountRequest;
import com.letscode.account.dto.AccountResponse;
import com.letscode.account.models.Account;
import com.letscode.account.repository.AccountRepository;
import com.letscode.account.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public AccountResponse create(AccountRequest accountRequest) {
        Account account = new Account(accountRequest);
        accountRepository.save(account);
        return new AccountResponse(account);
    }

    @Override
    public AccountResponse getById(Long id) {
        var account = accountRepository.findById(id).orElseThrow();
        return new AccountResponse(account);
    }

    @Override
    public List<AccountResponse> getAll() {
        return AccountResponse.toResponse(
               accountRepository.findAll()
        );

    }

    @Override
    public AccountResponse update(Long id, AccountRequest accountRequest) {
        var account = accountRepository.findById(id).orElseThrow();
        account.setAccountType(accountRequest.getAccountType());
        account.setAgency(accountRequest.getAgency());
        account.setBalance(accountRequest.getBalance());
        account.setUpdateDate(accountRequest.getUpdateDate());
        account.setRegistrationDate(accountRequest.getRegistrationDate());
        account.setNumber(accountRequest.getNumber());
        return new AccountResponse(account);
    }

    @Override
    public void delete(Long id) {
        var account = accountRepository.findById(id).orElseThrow();
        accountRepository.delete(account);
    }
}
