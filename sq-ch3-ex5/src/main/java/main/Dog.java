package main;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name;

    public Dog() {
    }

    @PostConstruct
    public void init() {
        this.name = "Kiki";
    }
    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
