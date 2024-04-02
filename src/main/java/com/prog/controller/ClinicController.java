package com.prog.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.prog.entity.Patients;
import com.prog.service.PatientsService;



@Controller
public class ClinicController {
	
	@Autowired
	private PatientsService patientsService;

	@GetMapping("/")
	public String home(Model m) {
		List<Patients> patients = patientsService.getAllPatients();
		m.addAttribute("patients", patients);
		return "index";
	}

	@GetMapping("/addpatients")
	public String addPatientsForm() {
		return "add_patients";
	}

	@PostMapping("/register")
	public String patientsRegister(@ModelAttribute Patients e, HttpSession session) {

		System.out.println(e);
		patientsService.addPatients(e);
		session.setAttribute("msg", "Patients Added Sucessfully..");
		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m) {
		
		Patients patientsByID = patientsService.getPatientsByID(id);
		m.addAttribute("patients", patientsByID);
		return "edit";

	}

	@PostMapping("/update")
	public String updatePatients(@ModelAttribute Patients e, HttpSession session) {
		patientsService.addPatients(e);
		session.setAttribute("msg", "Patients Data update Sucessfully...");
		return "redirect:/";
	}

	@GetMapping("/delete/{id}")
	public String deletePatients(@PathVariable int id, HttpSession session) {
		patientsService.deletePatients(id);
		session.setAttribute("msg", "Patients Data Delete Sucessfully...");

		return "redirect:/";
	}
}
