package config;

import main.Parror;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parror parror(){
        return new  Parror("Popka");
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
