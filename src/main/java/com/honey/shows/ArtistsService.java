package com.honey.shows;

import java.util.Collection;

import com.honey.shows.beans.Artist;


public interface ArtistsService {
	public void storeArtist(Artist artists);
	public Collection<Artist> viewAllIArtists();
	public Collection<Artist> viewAllIArtistsByName();
	public Collection<Artist> viewAllIArtistsByGenre();
}
