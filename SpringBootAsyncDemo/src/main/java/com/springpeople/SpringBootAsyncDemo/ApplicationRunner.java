package com.springpeople.SpringBootAsyncDemo;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springpeople.SpringBootAsyncDemo.entity.Movie;
import com.springpeople.SpringBootAsyncDemo.service.MovieService;

@Component
public class ApplicationRunner implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(ApplicationRunner.class);
	
	@Autowired
	private MovieService service;
	
	@Override
	public void run(String... args) throws Exception {
		long startTime = System.currentTimeMillis();
		
		CompletableFuture<Movie> page1 = service.getMovieDetails("2baf70d1-42bb-4437-b551-e5fed5a87abe");
		CompletableFuture<Movie> page2 = service.getMovieDetails("58611129-2dbc-4a81-a72f-77ddfc1b1b49");
		CompletableFuture<Movie> page3 = service.getMovieDetails("0440483e-ca0e-4120-8c50-4c8cd9b965d6");
		
		CompletableFuture.allOf(page1, page2, page3).join();
		
		LOG.info("Elasped Time: " + (System.currentTimeMillis() - startTime));
		LOG.info("--> " + page1.get());
		LOG.info("--> " + page2.get());
		LOG.info("--> " + page3.get());
	}

}
