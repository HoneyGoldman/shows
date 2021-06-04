package com.honey.shows;

import java.util.Collection;
import java.util.Date;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.hibernate.annotations.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honey.shows.beans.Show;


@Service
public  class ShowRepositoryImp implements ShowsService {

	@PersistenceContext
	private EntityManager entityMNG;
	@Autowired
	ShowsRepository showRepository;

	@Override
	public void storeShow(Show show) {
		showRepository.save(show);
		
	}

	@Override
	public Collection<Show> viewAllShows() {
			return showRepository.findAll();
	}

	//need to create join statement
	@Override
	public Collection<Show> viewShowByArtist(int artistId) {
		TypedQuery<Show> query=entityMNG.createQuery("from artist_shows where artist_id="+artistId,Show.class);
		return query.getResultList();
	}

	@Override
	public Collection<Show> viewShowByDate(Date date) {
		TypedQuery<Show> query=entityMNG.createQuery("from shows where date="+date,Show.class);
		return query.getResultList();
	}

	@Override
	public Collection<Show> viewShowByPrice(int price) {
		TypedQuery<Show> query=entityMNG.createQuery("from shows where price<"+price,Show.class);
		return query.getResultList();
	}

//	@Override
//	public Collection<Show> findByShowArtistName(String artistName) {
//		
//		return showRepository.findAll(artistName);
//	}
}
