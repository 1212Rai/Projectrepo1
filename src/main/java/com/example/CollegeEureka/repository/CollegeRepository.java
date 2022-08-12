
package com.example.CollegeEureka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CollegeEureka.entity.College;



public interface CollegeRepository extends JpaRepository<College, Long> {
	
	College findById(long id);

}
