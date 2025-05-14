package ru.semusv.sq_ch2_ex3;

import config.ProjectConfig;
import main.Dog;
import main.Parrot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

@SpringBootApplication
public class SqCh2Ex3Application {

	public static void main(String[] args) {
		SpringApplication.run(SqCh2Ex3Application.class, args);
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		Parrot x = new Parrot();
		x.setName("Qureku");

		Supplier<Parrot> parrotSupplier = new Supplier<Parrot>() {
            @Override
            public Parrot get() {
                return x;
            }
        };
		context.registerBean("parrotProgr", Parrot.class, parrotSupplier);

		Parrot p = context.getBean("parrotProgr", Parrot.class);
		System.out.println(p.getName());

	}

}
