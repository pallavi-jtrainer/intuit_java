package com.springpeople.SpringCoreJavaConfigDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springpeople.SpringCoreJavaConfigDemo.entity.Courses;

@Configuration
@ComponentScan("com.springpeople.SpringCoreJavaConfigDemo")
public class AppConfig {
	
	@Bean(name="course1")
	public Courses getCourse() {
		return new Courses(1, "Core Java");
	}
	
//	@Bean
//	public Courses getAnotherCourse() {
//		
//	}
}
