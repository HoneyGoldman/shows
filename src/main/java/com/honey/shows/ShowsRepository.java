package com.honey.shows;


	import javax.transaction.Transactional;

	import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.honey.shows.beans.Show;

@Transactional
	public interface ShowsRepository extends JpaRepository<Show,Integer>{

	}

