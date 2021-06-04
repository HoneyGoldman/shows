package com.honey.shows;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.honey.shows.beans.Artist;

@Service

public class ArtistRepositoryImp implements ArtistsService{

	@Autowired
	ArtistRepository repo;
	
	@Override
	public void storeArtist(Artist artists) {
		repo.save(artists);
		
	}

	@Override
	public Collection<Artist> viewAllIArtists() {
		return repo.findAll();
	}

	@Override
	public Collection<Artist> viewAllIArtistsByName() {
		return null;
	}

	@Override
	public Collection<Artist> viewAllIArtistsByGenre() {
		// TODO Auto-generated method stub
		return null;
	}

}
