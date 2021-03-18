package com.relation.repo.otm;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relation.entity.otm.Comment;

public interface CommentRepo extends JpaRepository<Comment, Long>{

}
