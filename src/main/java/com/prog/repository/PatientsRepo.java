package com.prog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prog.entity.Patients;
@Repository
public interface PatientsRepo extends JpaRepository<Patients, Integer> {
}
