package me.andrew.springmydefaultsetting.common.repository;

import me.andrew.springmydefaultsetting.common.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {

  Account findByEmail(String email);
}
