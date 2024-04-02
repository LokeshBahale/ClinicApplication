package com.prog.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ClinicApplication")
public class Patients {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int ID;
 private String Name;
 private String Address;
 private int Age; 
 private String BloodGroup;
 private String DateOfAdmission;
 private String DescriptionOfIllness;
 
 
 
public Patients() {
	super();
	// TODO Auto-generated constructor stub
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public String getBloodGroup() {
	return BloodGroup;
}
public void setBloodGroup(String bloodGroup) {
	BloodGroup = bloodGroup;
}
public String getDateOfAdmission() {
	return DateOfAdmission;
}
public void setDateOfAdmission(String dateOfAdmission) {
	DateOfAdmission = dateOfAdmission;
}
public String getDescriptionOfIllness() {
	return DescriptionOfIllness;
}
public void setDescriptionOfIllness(String descriptionOfIllness) {
	DescriptionOfIllness = descriptionOfIllness;
}
@Override
public String toString() {
	return "Patients [ID=" + ID + ", Name=" + Name + ", Address=" + Address + ", Age=" + Age + ", BloodGroup="
			+ BloodGroup + ", DateOfAdmission=" + DateOfAdmission + ", DescriptionOfIllness=" + DescriptionOfIllness
			+ "]";
}

 }
