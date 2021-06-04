
package com.honey.shows;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.honey.shows.beans.Artist;


@Transactional
public interface ArtistRepository extends JpaRepository<Artist,Integer>{

}