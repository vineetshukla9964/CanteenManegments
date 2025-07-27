package com.example.canteen2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.canteen2.jpa.FeedbackRepo;
import com.example.canteen2.model.StudentFeedback;

@Service
public class Feedback_Service {
	@Autowired
	private FeedbackRepo service;

	public  StudentFeedback save(StudentFeedback entity) {
		return service.save(entity);
	}

	public List<StudentFeedback> findAll() {
		return service.findAll();
	}

	public Optional<StudentFeedback> findById(Integer id) {
		return service.findById(id);
	}

	public void deleteById(Integer id) {
		service.deleteById(id);
	}
	
	

}
