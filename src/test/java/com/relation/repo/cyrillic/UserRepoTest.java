package com.relation.repo.cyrillic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserRepoTest {

	@Autowired
	private UserRepo userRepo;
	
	@Test
	void test() {
		assertEquals(2, userRepo.findAll().size());
	}
}
