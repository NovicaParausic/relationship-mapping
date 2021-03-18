package com.relation.entity.oto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ranking_table")
public class Ranking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ranking_id")
	private long rankingId;
	
	@Column(name = "ranking_name")
	private String name;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "artist_id")
	private Artist artist;	
	
	public Ranking() {}

	public Ranking(String name) {
		this.name = name;
	}

	public long getRankingId() {
		return rankingId;
	}

	public void setRankingId(long rankingId) {
		this.rankingId = rankingId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}	
}
