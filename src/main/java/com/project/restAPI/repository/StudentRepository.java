package com.project.restAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.restAPI.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
