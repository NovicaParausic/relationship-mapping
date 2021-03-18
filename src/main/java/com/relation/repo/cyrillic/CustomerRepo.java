package com.relation.repo.cyrillic;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relation.entity.cyrillic.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
