package com.example.canteen2.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class StudentFeedback {

@GeneratedValue
@Id
private int id;
private String feedback;
}
