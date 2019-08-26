package com.example.demo.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import io.github.resilience4j.circuitbreaker.CallNotPermittedException;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {
	
	@ExceptionHandler(CallNotPermittedException.class)
	public ResponseEntity<?> test(CallNotPermittedException ex) {
		return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("Circuito em açao");
	}

}
