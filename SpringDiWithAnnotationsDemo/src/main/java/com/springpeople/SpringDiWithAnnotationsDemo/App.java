package com.springpeople.SpringDiWithAnnotationsDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springpeople.SpringDiWithAnnotationsDemo.controller.BookController;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    	ApplicationContext context = new AnnotationConfigApplicationContext(BookController.class);
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	BookController bc = context.getBean(BookController.class);
    	System.out.println(bc.getBook().toString());
    }
}
