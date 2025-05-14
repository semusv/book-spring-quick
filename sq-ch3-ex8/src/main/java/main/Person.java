package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Person {
    private String Name;

    private Parrot parrot;


    public Person() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
