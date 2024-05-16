package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.dao.StudentDao;
import com.example.entity.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
			ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
			
//			StudentDao bean=context.getBean(StudentDao.class);
//			
//		    Student s= new Student();
//		    s.setId(102);
//		    s.setName("Sandip");
//		    s.setEmail("sandipr1@gmail.com");
//		    s.setMark(76);
//		    s.setAddress("ABd");
//		    
//		    bean.save(s);
//		    

		
	}

}
