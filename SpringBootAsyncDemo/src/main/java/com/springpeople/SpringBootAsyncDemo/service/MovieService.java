package com.springpeople.SpringBootAsyncDemo.service;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springpeople.SpringBootAsyncDemo.entity.Movie;

@Service
public class MovieService {
	
	private static final Logger LOG = LoggerFactory.getLogger(MovieService.class);
	
	private final RestTemplate restTemplate;
	
	public MovieService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	@Async
	public CompletableFuture<Movie> getMovieDetails(String id) throws  InterruptedException{
		LOG.info("Looking up movie with id: " + id);
		
		String url = String.format("https://ghibliapi.vercel.app/films/%s", id);
		
		Movie movie = restTemplate.getForObject(url, Movie.class);
		
		Thread.sleep(1000L);
		
		return CompletableFuture.completedFuture(movie);
	}
	
	
}
