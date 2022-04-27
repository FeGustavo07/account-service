package com.letscode.account.controllers;

import com.letscode.account.dto.AccountRequest;
import com.letscode.account.dto.AccountResponse;
import com.letscode.account.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AccountResponse create(@RequestBody AccountRequest accountRequest) {
        return accountService.create(accountRequest);
    }

    @GetMapping("/id")
    @ResponseStatus(HttpStatus.OK)
    public AccountResponse getById(@PathVariable Long id) {
        return accountService.getById(id);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<AccountResponse> getAll() {
        return accountService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public AccountResponse update(@PathVariable Long id, @RequestBody AccountRequest accountRequest) {
        return accountService.update(id, accountRequest);
    }

    @DeleteMapping("/id")
    public void delete(@PathVariable Long id) {
        accountService.delete(id);
    }
}
