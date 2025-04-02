package com.codegnan.controller;

import java.util.List;

import javax.print.Doc;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codegnan.entity.Doctor;
import com.codegnan.entity.Visit;
import com.codegnan.exception.InvalidDoctorIdException;
import com.codegnan.service.DoctorService;
import com.codegnan.service.VisitService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
	DoctorService doctorService;
	VisitService visitService;
	
	public DoctorController(DoctorService doctorService, VisitService visitService) {
		this.doctorService = doctorService;
		this.visitService = visitService;
	}
	
	@GetMapping("")
	public ResponseEntity<List<Doctor>> getAllDoctors(){
		List<Doctor> doctors = doctorService.findAllDoctors();
		// We should add response code in the response of API Call
		ResponseEntity<List<Doctor>> responseEntity = 
				new ResponseEntity<List<Doctor>>(doctors, HttpStatus.OK);
		return responseEntity;
	}
	@GetMapping("/{id}")
	public ResponseEntity<Doctor> getADoctorById(@PathVariable int id) throws InvalidDoctorIdException{
		Doctor doctor = doctorService.findDoctorById(id);
		return new ResponseEntity<Doctor>(doctor, HttpStatus.OK);
	}
	
	@GetMapping("/{id}/visits")
	public ResponseEntity<List<Visit>> getVisitsByDoctor(@PathVariable int id) throws InvalidDoctorIdException{
		Doctor doctor = doctorService.findDoctorById(id);
		List<Visit> visits = visitService.findVisitsByDoctor(doctor);
		return new ResponseEntity<List<Visit>>(visits, HttpStatus.OK);
		
	}
	
	@PostMapping("")
	public ResponseEntity<Doctor> saveDoctor(@RequestBody Doctor doctor){
		Doctor savedDoctor = doctorService.hireDoctor(doctor);
		ResponseEntity<Doctor> response = new ResponseEntity<Doctor>(savedDoctor, HttpStatus.OK);
		return response;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Doctor> updateDoctor(@PathVariable int id, @RequestBody Doctor doctor) throws InvalidDoctorIdException {
		if( id != doctor.getId() ) {
			throw new InvalidDoctorIdException("ID of the doctor "+doctor.getId()+
					" is not matching with id "+id+" provided");
		}
		doctorService.updateDoctor(doctor);
		return new ResponseEntity<Doctor>(doctor, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Doctor> deleteDoctor(@PathVariable int id) throws InvalidDoctorIdException{
		Doctor deletedDoctor = doctorService.deleteDoctor(id);
		ResponseEntity<Doctor> response = new ResponseEntity<Doctor>(deletedDoctor, HttpStatus.OK);
		return response;
	}

}
