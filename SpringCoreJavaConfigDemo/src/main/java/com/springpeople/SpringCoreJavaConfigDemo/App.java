package com.springpeople.SpringCoreJavaConfigDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springpeople.SpringCoreJavaConfigDemo.entity.Student;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
       Student s = (Student) ctx.getBean("s1");
       System.out.println(s.toString());
    }
}
