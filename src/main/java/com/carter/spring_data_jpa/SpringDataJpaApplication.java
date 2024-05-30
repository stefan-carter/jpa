package com.carter.spring_data_jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(EmployeeRepository repository) {
		return (args -> {
			insertJavaAdvocates(repository);
			System.out.println(repository.findAll());
		});
	}

	private void insertJavaAdvocates(EmployeeRepository repository) {
		repository.save(new Employee("Stefan", "Carter"));
		repository.save(new Employee("Emilie", "Foster"));
		repository.save(new Employee("Freddie", "Carter"));

	}
}
