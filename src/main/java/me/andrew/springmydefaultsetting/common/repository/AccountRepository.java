package me.andrew.springmydefaultsetting.common.repository;

import java.util.Optional;
import me.andrew.springmydefaultsetting.common.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<User, String> {
  Optional<Account> findByEmail(String email);
}
