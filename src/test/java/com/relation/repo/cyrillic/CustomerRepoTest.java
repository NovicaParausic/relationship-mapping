package com.relation.repo.cyrillic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomerRepoTest {

	@Autowired
	private CustomerRepo customerRepo;
	
	@Test
	void test() {
		assertEquals(2, customerRepo.findAll().size());
	}

}
