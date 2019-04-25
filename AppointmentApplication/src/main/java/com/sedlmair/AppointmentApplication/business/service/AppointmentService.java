package com.sedlmair.AppointmentApplication.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sedlmair.AppointmentApplication.data.entitiy.Appointment;
import com.sedlmair.AppointmentApplication.data.repository.AppointmentRepository;

@Service
public class AppointmentService {
	
	private AppointmentRepository appointmentRepository;
	
	@Autowired  // activates dependency injection for the constructor
	public AppointmentService (AppointmentRepository appointmentRepository) {
		this.appointmentRepository = appointmentRepository;
	}
	
	public List<Appointment> getAllAppointments(){
		
		List<Appointment> appointments = (List<Appointment>) this.appointmentRepository.findAll();
		
		// just return all available appointments
		return appointments;
		
	}
	
	

}