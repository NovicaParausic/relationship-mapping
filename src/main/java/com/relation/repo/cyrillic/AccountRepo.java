package com.relation.repo.cyrillic;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relation.entity.cyrillic.Account;

public interface AccountRepo extends JpaRepository<Account, Long> {

}
