package com.personas;

import com.personas.model.Person;
import com.personas.model.Professor;
import com.personas.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class PersonasApplication {

	public static void main(String[] args) {

		Professor professor = new Professor();
		professor.setName("Kaiquinho");
		professor.setSalary(new BigDecimal(700));
		professor.setPhone(1234);
		professor.setEmail("kaique123@gmail.com");

		System.out.println("ola, meu salario e " + professor.getSalary());
		System.out.println("Eu sou o professor " + professor.getName());
		System.out.println(professor.getEmail()+ " Telefone:  " + professor.getPhone());

		Student estudante = new Student();
		estudante.setName("Coelhinha Dev");
		estudante.setPhone(119213232L);
		estudante.setEmail("mari01@gmail.com");
		estudante.setAverage(new BigDecimal(6));

		Student estudante2 = new Student();
		estudante2.setName("Helena");



		System.out.println(estudante.toString());
		System.out.println(estudante2.toString());
		System.out.println(professor.toString());


		//SpringApplication.run(PersonasApplication.class, args);
	}

}
