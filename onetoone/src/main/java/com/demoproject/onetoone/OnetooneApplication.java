package com.demoproject.onetoone;

import com.demoproject.onetoone.Model.Address;
import com.demoproject.onetoone.Model.Student;
import com.demoproject.onetoone.repository.AddressRepository;
import com.demoproject.onetoone.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OnetooneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext=
				SpringApplication.run(OnetooneApplication.class, args);
		AddressRepository addressRepository=
				configurableApplicationContext.getBean(AddressRepository.class);

		StudentRepository studentRepository=
				configurableApplicationContext.getBean(StudentRepository.class);

		Address address= new Address("E.C.R");
		addressRepository.save(address);

		Student student=new Student("praveen",address);
		studentRepository.save(student);
	}

}
