package ru.semusv.sq_ch2_ex2;

import config.ProjectConfig;
import main.Parror;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SqCh2Ex2Application {

	public static void main(String[] args) {
		SpringApplication.run(SqCh2Ex2Application.class, args);
		var contexr = new AnnotationConfigApplicationContext(ProjectConfig.class);

		Parror p = contexr.getBean(Parror.class);
		System.out.printf(p.getName());
	}

}
