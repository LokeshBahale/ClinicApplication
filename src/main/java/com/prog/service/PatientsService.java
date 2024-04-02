package com.prog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.entity.Patients;
import com.prog.repository.PatientsRepo;
@Service
public class PatientsService {
	@Autowired
private PatientsRepo patientsRepo;
	public void addPatients(Patients e) {
	patientsRepo.save(e);
}
	public List <Patients> getAllPatients(){
		return patientsRepo.findAll();
	}
	public Patients getPatientsByID(int id) {
	 Optional<Patients>e=patientsRepo.findById(id);
	 if(e.isPresent()) {
		 return e.get();
	 }
	 return null;
	}
	public void deletePatients(int id) {
		patientsRepo.deleteById(id);
	}
}
