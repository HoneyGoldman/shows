package com.honey.shows.beans;


import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.repository.Query;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Show {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	public int id;
	@Column
String title;
	@Column
String description;
	@Column
String photo;
	@Column
Date date;
	@Column
	Currency currency;
	@Column
	int price;
	
	@OneToMany
	Set<Artist> artists;

	public Show() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Set<Artist> getArtists() {
		return artists;
	}

	public void setArtists(Set<Artist> artists) {
		this.artists = artists;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Show(int id, String title, String description, String photo, Date date, int price, Set<Artist> artists,Currency currency) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.photo = photo;
		this.date = date;
		this.price = price;
		this.artists = artists;
		this.currency=currency;	}

	@Override
	public String toString() {
		return "Show [id=" + id + ", title=" + title + ", description=" + description + ", photo=" + photo + ", date="
				+ date + ", currency=" + currency + ", price=" + price + ", artists=" + artists + "]";
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	

	
	
	


}
