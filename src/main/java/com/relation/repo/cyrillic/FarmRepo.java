package com.relation.repo.cyrillic;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relation.entity.cyrillic.Farm;

public interface FarmRepo extends JpaRepository<Farm, Long> {

}
