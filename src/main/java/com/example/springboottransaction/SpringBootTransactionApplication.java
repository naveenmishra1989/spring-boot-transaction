package com.example.springboottransaction;

import com.example.springboottransaction.entity.Book;
import com.example.springboottransaction.entity.Student;
import com.example.springboottransaction.entity.repository.BookRepository;
import com.example.springboottransaction.entity.repository.StudentRepository;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTransactionApplication {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private StudentService studentService;


	public static void main(String[] args) {
		SpringApplication.run(SpringBootTransactionApplication.class, args);
	}

	@PostConstruct
	public void init(){
		studentRepository.saveAndFlush(Student.builder().name("sonu").build());
		studentRepository.save(Student.builder().name("sarita").build());
		bookRepository.save(Book.builder().name("java").isbn("uyuy").id(46L).build());
		studentService.upDate();
	}
}
