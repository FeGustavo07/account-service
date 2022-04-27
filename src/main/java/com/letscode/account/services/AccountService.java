package com.letscode.account.services;

import com.letscode.account.dto.AccountRequest;
import com.letscode.account.dto.AccountResponse;

import java.util.List;

public interface AccountService {

    AccountResponse create(AccountRequest accountRequest);
    AccountResponse getById(Long id);
    List<AccountResponse> getAll();
    AccountResponse update(Long id, AccountRequest accountRequest);
    void delete(Long id);


}
