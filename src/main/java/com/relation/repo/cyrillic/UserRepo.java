package com.relation.repo.cyrillic;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relation.entity.cyrillic.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
