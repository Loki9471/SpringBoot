package com.codegnan.repo;

import com.codegnan.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepo extends JpaRepository<College,Integer> {

}
