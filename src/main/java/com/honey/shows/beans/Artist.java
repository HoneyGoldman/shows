package com.honey.shows.beans;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Artist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
String name;
	@Column
Date birthDate;
	@Enumerated(EnumType.ORDINAL)
	@Column
Genre genre;
	@Column
String photo;
	
	public Artist(int id, String name, Date birthDate, Genre genre, String photo, Set<Show> shows) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.genre = genre;
		this.photo = photo;
		
	}
	public Artist() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	@Override
	public String toString() {
		return "Artist [id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", genre=" + genre + ", photo="
				+ photo +"]";
	}


}
