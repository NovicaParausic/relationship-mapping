package com.relation.repo.oto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.relation.entity.oto.Artist;
import com.relation.entity.oto.Ranking;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class ArtistRankingTest {

	@Autowired
	private ArtistRepo artistRepo;
	
	@Autowired
	private RankingRepo rankingRepo;
	
	@Test
	@Order(1)
	void testSaveNewRanaking() {
	
		Ranking rank = new Ranking("rank2");
		rankingRepo.save(rank);
		assertEquals(3, rankingRepo.findAll().size());
	}
	
	@Test
	@Order(2)
	void testSaveNewArtist() {
	
		Artist artist = new Artist("art1");
		Ranking rank1 = new Ranking("rank1");
		artist.setRanking(rank1);
		rank1.setArtist(artist);
		artistRepo.save(artist);
		
		List<Artist> artists = artistRepo.findAll(); 
		List<Ranking> ranks = rankingRepo.findAll();
		
		for (Artist art : artists) {
			System.out.println(art.getName());
		}
		
		for (Ranking rank : ranks) {
			System.out.println(rank.getName());
		}
		
		assertEquals(3, artists.size());
		assertEquals(4, ranks.size());
	}
}
