package com.honey.shows;

import java.sql.Date;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.honey.shows.beans.Artist;
import com.honey.shows.beans.Show;

@RestControllerAdvice
@RequestMapping("shows")
public class RestController {
	
	@Autowired
	ShowRepositoryImp ShowRepository;
	
	@Autowired
	ShowsRepository showRepository;
	
	@Autowired
	ArtistRepository artistRepository;
	
	@GetMapping("test")
	public String test() {
		return "OK!";
	}
	
	@GetMapping("getAllShows")
	public Collection<Show> getAllShows() {
		try {
			return ShowRepository.viewAllShows();
		} catch (Exception e) {
			if (e instanceof NullPointerException) {
				System.out.println("No Shows in DB");
			}
			else
			{
				e.printStackTrace();
			}
		}
		return null;
	}	
	
	@GetMapping("getAllArtist")
	public Collection<Artist> getAllArtist() {
		try {
			return artistRepository.findAll();
		} catch (Exception e) {
			if (e instanceof NullPointerException) {
				System.out.println("No Shows in DB");
			}
			else
			{
				e.printStackTrace();
			}
		}
		return null;
	}
	
	@GetMapping("getShowByArtist/{artistId}")
	public Collection<Show> viewShowByArtist(@PathVariable(name= "artistId")int artistId) {
		try {
			return ShowRepository.viewShowByArtist(artistId);
		} catch (Exception e) {
			if (e instanceof NullPointerException) {
				System.out.println("No Shows in DB");
			}
			else
			{
				e.printStackTrace();
			}
		}
		return null;
	}
	
	@GetMapping("getShowByDate")
	public Collection<Show> viewShowByDate(@PathVariable(name= "date")Date date) {
		try {
			return ShowRepository.viewShowByDate(date);
		} catch (Exception e) {
			if (e instanceof NullPointerException) {
				System.out.println("No Shows in DB");
			}
			else
			{
				e.printStackTrace();
			}
		}
		return null;
	}	
	
	@GetMapping("getShowByPrice/{price}")
	public Collection<Show> viewShowByPrice(@PathVariable(name="price")int price) {
		try {
			return ShowRepository.viewShowByPrice(price);
		} catch (Exception e) {
			if (e instanceof NullPointerException) {
				System.out.println("No Shows in DB");
			}
			else
			{
				e.printStackTrace();
			}
		}
		return null;
	}
	
	@RequestMapping(value="saveShow",method= {RequestMethod.PUT})
	public void saveShow(@RequestBody Show show) {
		try {
			ShowRepository.storeShow(show);;
		} catch (Exception e) {

				e.printStackTrace();
			}}
	@RequestMapping(value="saveArtist",method= {RequestMethod.PUT})
	public void saveArtist(@RequestBody Artist artist) {
		try {
			artistRepository.save(artist);
		} catch (Exception e) {

				e.printStackTrace();
			}}
	@RequestMapping(value="updateArtist",method= {RequestMethod.POST})
	public void updateArtist(@RequestBody Artist artist) {
		try {
			artistRepository.save(artist);
		} catch (Exception e) {

				e.printStackTrace();
			}}
	
	@RequestMapping(value="deletArtist",method= {RequestMethod.DELETE})
	public void deleteArtist(@RequestBody Artist artist) {
		try {
			artistRepository.delete(artist);;
		} catch (Exception e) {

				e.printStackTrace();
			}}
	@RequestMapping(value="deletShow",method= {RequestMethod.DELETE})
	public void deleteShow(@RequestBody Show show) {
		try {
			showRepository.delete(show);
		} catch (Exception e) {

				e.printStackTrace();
			}}
	
	@RequestMapping(value="updateShow",method= {RequestMethod.POST})
	public void updateShow(@RequestBody Show show) {
		try {
			showRepository.save(show);
		} catch (Exception e) {

				e.printStackTrace();
			}}
}
