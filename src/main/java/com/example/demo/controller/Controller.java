package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TestService;

@RestController
public class Controller {
	
	@Autowired
	private TestService service;
	
	
	@GetMapping("/circuit")
	public ResponseEntity<?> test() {
		return ResponseEntity.ok(service.test());
	}

}
