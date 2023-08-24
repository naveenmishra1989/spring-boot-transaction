package com.example.springboottransaction;

import com.example.springboottransaction.entity.Student;
import com.example.springboottransaction.entity.repository.StudentRepository;
import java.util.Optional;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Log4j2
@Service
public class StudentService {

  @Autowired
  private StudentRepository repository;


  @Transactional
  public void upDate() {
    final Optional<Student> byId = repository.findById(1L);
    if (byId.isPresent()) {
      final Student student1 = byId.get();
      student1.setName("naveen");
      final Student student = repository.saveAndFlush(student1);
      log.info(student);
    }

  }

}
