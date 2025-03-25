package com.codegnan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codegnan.entity.College;
import com.codegnan.repo.CollegeRepo;

@Service
public class CollegeServiceImpl implements CollegeService{
	
	@Autowired
	public CollegeRepo collegeRepo;

	@Override
	public List<College> findAllCollege() {
		
		return collegeRepo.findAll();
	}

	@Override
	public Optional<College> findByIdCollege(int id) {
		
		return collegeRepo.findById(id);
	}

	@Override
	public College saveCollege(College college) {
		
		return collegeRepo.save(college);
	}

	@Override
	public Optional<College> updateCollege(int id) {
		
		return collegeRepo.findById(id);
	}

	public void deleteCollege(int id) {
		collegeRepo.delete((College) collegeRepo);;
		
	}

}
