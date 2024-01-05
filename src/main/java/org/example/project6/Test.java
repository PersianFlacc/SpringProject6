package org.example.project6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Dog myDog = context.getBean("dogBean", Dog.class);
        Dog yourDog = context.getBean("dogBean", Dog.class);

        System.out.println("Переменные ссылаются на один и тот же объект? " +
                (myDog==yourDog));

        System.out.println(myDog);
        System.out.println(yourDog);

        myDog.destroy();
        yourDog.destroy();

        context.close();
    }
}
