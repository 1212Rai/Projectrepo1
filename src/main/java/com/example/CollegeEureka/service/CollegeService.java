
package com.example.CollegeEureka.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.CollegeEureka.entity.College;
import com.example.CollegeEureka.service.vo.RequestTemplate;





@Service
public interface CollegeService {
	College add(College coll);
	List<College> list();
	College update(long id,String name);
	College searchById(long id);

	
	RequestTemplate specificCollStudent(long coll_id);
	List<RequestTemplate> listWithStu();
}
