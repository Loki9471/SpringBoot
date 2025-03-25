package com.codegnan.service;

import java.util.List;
import java.util.Optional;

import com.codegnan.entity.College;

public interface CollegeService {
public List<College> findAllCollege();
public Optional<College> findByIdCollege(int id);
public College saveCollege(College college);
public Optional<College> updateCollege(int id);
public void deleteCollege(int id);
}