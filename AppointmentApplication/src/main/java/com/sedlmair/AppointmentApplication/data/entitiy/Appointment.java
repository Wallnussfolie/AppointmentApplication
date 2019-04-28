package com.sedlmair.AppointmentApplication.data.entitiy;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="APPOINTMENT")
public class Appointment {
	
	// attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="APPOINTMENT_ID")
	private int appointmentID;
	@Column(name="APPOINTMENT_DATE")
	private Date date;
	@Column(name="APPOINTMENT_DESCR")
	private String description;
	@Column(name="APPOINTMENT_PATID")
	private int patientID;
	@Column(name="APPOINTMENT_CITY")
	private String city;
	@Column(name="APPOINTMENT_STREET")
	private String street;
	@Column(name="APPOINTMENT_STREET_NUMBER")
	private int streetNumber;
	@Column(name="APPOINTMENT_ADDITION")
	private String addition;
	
	// getters and setters
	public int getAppointmentID() {
		return appointmentID;
	}
	public void setAppointmentID(int appointmentID) {
		this.appointmentID = appointmentID;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getAddition() {
		return addition;
	}
	public void setAddition(String addition) {
		this.addition = addition;
	}
	
	

}
