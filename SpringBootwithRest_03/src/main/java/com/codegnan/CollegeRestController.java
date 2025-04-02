package com.codegnan;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.codegnan.entity.College;
import com.codegnan.service.CollegeService;

@RestController
@RequestMapping("/api/college") // Base path for all endpoints
public class CollegeRestController {

    private final CollegeService collegeService;

    @Autowired
    public CollegeRestController(CollegeService collegeService) {
        this.collegeService = collegeService;
    }

    // Retrieve all colleges
    @GetMapping("/")
    public List<College> getAllCollege() {
        return collegeService.findAllCollege();
    }

    // Add a new college
    @PostMapping("/add") // Use POST instead of PUT for new data
    public College addCollege(@RequestBody College college) {
        return collegeService.saveCollege(college);
    }

    // Find a college by ID
    @GetMapping("/{id}") // Fixed: Correct path variable format
    public Optional<College> findByIdCollege(@PathVariable int id) {
        return collegeService.findByIdCollege(id);
    }

    // Delete a college by ID
    @DeleteMapping("/{id}") // Fixed: Correct path variable format
    public String deleteCollege(@PathVariable int id) {
        collegeService.deleteCollege(id);
        return "College with ID " + id + " deleted successfully";
    }
}
