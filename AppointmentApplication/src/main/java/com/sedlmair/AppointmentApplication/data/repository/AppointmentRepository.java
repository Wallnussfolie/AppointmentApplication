package com.sedlmair.AppointmentApplication.data.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sedlmair.AppointmentApplication.data.entitiy.Appointment;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment,Long> {
	
	List<Appointment> findByDate(Date date);

}
