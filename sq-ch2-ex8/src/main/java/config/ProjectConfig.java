package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {

    @Bean
    Parrot parrot1(){
        return new Parrot("Popka-1");
    }
    @Bean
    Parrot parrot2(){
        return new Parrot("Popka-2");
    }
    @Bean( name = "Mike" )
    Parrot parrot3(){
        return new Parrot("Popka-3");
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
