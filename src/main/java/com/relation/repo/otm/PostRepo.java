package com.relation.repo.otm;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relation.entity.otm.Post;

public interface PostRepo extends JpaRepository<Post, Long>{

}
