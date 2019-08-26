package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class TestService {

	@CircuitBreaker(name="my-service")
	public String test() {
		
		String message = null;
		
		RestTemplate rest = new RestTemplate();
		
		message = rest.getForObject("http://localhost:8082/test", String.class);
		
		return message;
	}

}
