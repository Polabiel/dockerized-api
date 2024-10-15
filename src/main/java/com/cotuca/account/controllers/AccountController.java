package com.cotuca.account.controllers;

import com.cotuca.account.models.Account;
import com.cotuca.account.repositories.AccountRepository;
import com.cotuca.account.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping
    public ResponseEntity<List<Account>> getAccounts() {
        List<Account> accounts = accountRepository.findAll();
        return accounts.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(accounts);
    }
}
