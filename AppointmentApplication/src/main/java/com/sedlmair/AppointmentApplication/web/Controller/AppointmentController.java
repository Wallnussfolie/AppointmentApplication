package com.sedlmair.AppointmentApplication.web.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sedlmair.AppointmentApplication.business.service.AppointmentService;
import com.sedlmair.AppointmentApplication.data.entitiy.Appointment;

@Controller
public class AppointmentController {
	
    @Autowired
    private AppointmentService appointmentService;

    
    // for showing all appointments
	@RequestMapping(value="/appointments", method=RequestMethod.GET)
	public String getAllAppointments(Model model) {
		
		List<Appointment> myAppointments = this.appointmentService.getAllAppointments();
		
		model.addAttribute("myAppointments",myAppointments);
		
		return "appointments";
	}
	
	// for creating a new appointment
	
	@RequestMapping(value = "/createAppointment", method=RequestMethod.POST)
	public String createAppointment(@ModelAttribute Appointment appointment, Model model) {
		
		this.appointmentService.saveAppointment(appointment);
		
		List<Appointment> myAppointments = this.appointmentService.getAllAppointments();
		
		model.addAttribute("myAppointments",myAppointments);
		
		return "appointments";
		
	}
	
	@RequestMapping(value ="/createAppointment", method=RequestMethod.GET)
	public String viewAppointmentCreation(Model model) {
		
		model.addAttribute("appointment",new Appointment());
		return "createAppointment";
	}
}
