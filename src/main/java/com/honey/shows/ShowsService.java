package com.honey.shows;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.honey.shows.beans.Artist;
import com.honey.shows.beans.Show;

	public interface ShowsService {
		public void storeShow(Show show);
		public Collection<Show> viewAllShows();
		public Collection<Show> viewShowByArtist(int artistId);
		public Collection<Show> viewShowByDate(Date date);
		public Collection<Show> viewShowByPrice(int price);
//		public Collection<Show> findByShowArtistName(String artistName);

	}


