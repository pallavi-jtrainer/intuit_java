package com.springpeople.SpringCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springpeople.SpringCoreDemo.entity.DemoClass;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	DemoClass demo = (DemoClass) context.getBean("obj1");
    	System.out.println(demo.getMessage());
    	
    }
}
