package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
	private String studentId;
	private String name;
	private LocalDate dateOfAdmission;
	
	public Student() {
		studentId = "110001";
		name = "Joe";
		dateOfAdmission = LocalDate.now();
	}
	
	public Student(String studentId, String name, int year, int month, int day) {
		this.studentId = studentId;
		this.name = name;
		this.dateOfAdmission = LocalDate.of(year, month, day);
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(LocalDate dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}


	
	
	
	
}
