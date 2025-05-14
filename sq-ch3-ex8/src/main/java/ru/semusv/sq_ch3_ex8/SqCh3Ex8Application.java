package ru.semusv.sq_ch3_ex8;

import config.ProjectConfig;
import main.Parrot;
import main.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SqCh3Ex8Application {

	public static void main(String[] args) {
		SpringApplication.run(SqCh3Ex8Application.class, args);
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		Parrot parrot = context.getBean(Parrot.class);
		Person person = context.getBean(Person.class);

		System.out.println("Parrot" + parrot.getName());


		System.out.println("Person " + person.getName() + " has parrot " + person.getParrot().getName());

	}

}
