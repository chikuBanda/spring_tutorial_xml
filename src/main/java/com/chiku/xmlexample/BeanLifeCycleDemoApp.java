package com.chiku.xmlexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        // load spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");

        // retrieve beans
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call some methods
        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
