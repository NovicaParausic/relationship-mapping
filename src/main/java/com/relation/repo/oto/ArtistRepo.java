package com.relation.repo.oto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relation.entity.oto.Artist;

@Repository
public interface ArtistRepo extends JpaRepository<Artist, Long>{

}
