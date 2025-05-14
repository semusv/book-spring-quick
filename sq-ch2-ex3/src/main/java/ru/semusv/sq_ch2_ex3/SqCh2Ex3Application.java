package ru.semusv.sq_ch2_ex3;

import config.ProjectConfig;
import main.Dog;
import main.Parrot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SqCh2Ex3Application {

	public static void main(String[] args) {
		SpringApplication.run(SqCh2Ex3Application.class, args);
		var contexr = new AnnotationConfigApplicationContext(ProjectConfig.class);

		Parrot p = contexr.getBean("parrot1", Parrot.class);
		System.out.println(p.getName());

		Parrot p2 = contexr.getBean("Mike", Parrot.class);
		System.out.println(p2.getName());

		Dog d1 = contexr.getBean( Dog.class);
		System.out.println(d1.getName());
	}

}
