package me.andrew.springmydefaultsetting.common.service;

import me.andrew.springmydefaultsetting.common.domain.Account;
import me.andrew.springmydefaultsetting.common.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public Account findByEmail(String email) {
      Account account = accountRepository.findByEmail(email);
      return account;
    }
}
