package com.springpeople.SpringCoreJavaConfigDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springpeople.SpringCoreJavaConfigDemo.config.AppConfig;
import com.springpeople.SpringCoreJavaConfigDemo.entity.Courses;
import com.springpeople.SpringCoreJavaConfigDemo.entity.Student;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//       ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
//       Student s = (Student) ctx.getBean("s1");
//       System.out.println(s.toString());
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//    	Courses c = context.getBean(Courses.class);
    	Courses c = (Courses) context.getBean("course1");
//    	c.setCourseId(1);
//    	c.setCourseName("Spring Core");
    	System.out.println(c.toString());
    }
}
