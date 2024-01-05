package org.example.project6;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dogBean")
@Scope("prototype")
public class Dog implements Pet{

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @PostConstruct
    public void init() {
        System.out.println("Dog bean: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Dog bean: destroy method");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
