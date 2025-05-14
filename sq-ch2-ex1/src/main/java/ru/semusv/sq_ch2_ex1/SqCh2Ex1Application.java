package ru.semusv.sq_ch2_ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SqCh2Ex1Application {

	public static void main(String[] args) {
		SpringApplication.run(SqCh2Ex1Application.class, args);

		var context = new AnnotationConfigApplicationContext();
		Parror p = new Parror("Popka");

	}

}
