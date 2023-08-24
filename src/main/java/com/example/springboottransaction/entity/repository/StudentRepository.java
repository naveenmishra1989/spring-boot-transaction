package com.example.springboottransaction.entity.repository;

import com.example.springboottransaction.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
