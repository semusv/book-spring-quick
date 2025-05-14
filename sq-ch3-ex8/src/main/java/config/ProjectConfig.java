package config;

import main.Parrot;
import main.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {

    @Bean
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Popka");
        return p;

    }

    @Bean
    public Person person(@Qualifier("parrot") Parrot parrot){
        Person p = new Person();
        p.setName("Elza");
        p.setParrot(parrot);
        return p;
    }

}
