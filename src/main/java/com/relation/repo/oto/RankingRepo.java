package com.relation.repo.oto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relation.entity.oto.Ranking;

@Repository
public interface RankingRepo extends JpaRepository<Ranking, Long>{

}
