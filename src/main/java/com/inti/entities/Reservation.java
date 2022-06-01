package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reservation implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReservation;
	private Date dateReservation;
	private int nbJours;
	@ManyToOne
	private Hotel hotel;

	public Reservation() {

	}

	public Reservation(Date dateReservation, int nbJours) {
		this.dateReservation = dateReservation;
		this.nbJours = nbJours;
	}

	public Reservation(Date dateReservation, int nbJours, Hotel hotel) {
		this.dateReservation = dateReservation;
		this.nbJours = nbJours;
		this.hotel = hotel;
	}

	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public int getNbJours() {
		return nbJours;
	}

	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", dateReservation=" + dateReservation + ", nbJours="
				+ nbJours + ", hotel=" + hotel + "]";
	}

}
