package com.relation.repo.otm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.relation.entity.otm.Comment;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class PostCommentTest {

	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private CommentRepo commRepo;
	
	@Test
	@Order(1)
	void testPostSize() {
		assertEquals(2, postRepo.findAll().size());
	}
	
	@Test
	@Order(2)
	void testCommentSize() {
		assertEquals(4, commRepo.findAll().size());
	}
	
	@Test
	@Order(3)
	void testPosCommenttSize() {
		Set<Comment> comms = postRepo.findById(1L).get().getComments();
		assertEquals(2, comms.size());
	}

}
