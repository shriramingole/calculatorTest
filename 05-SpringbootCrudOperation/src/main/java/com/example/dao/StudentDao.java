package com.example.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.entity.Student;

public interface StudentDao extends JpaRepository<Student, Serializable>{

}
