package com.example.canteen2.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.canteen2.model.StudentFeedback;



public interface FeedbackRepo extends JpaRepository<StudentFeedback, Integer>{

}
