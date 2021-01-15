package com.hackerrank.sample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hackerrank.sample.dto.StringResponse;

@RestController
public class SampleController {

	@GetMapping("/defaultHello")
	public ResponseEntity<StringResponse> defaultHello(
			@RequestParam(value = "message", required = false) String message) {
		StringResponse response = new StringResponse("Default Hello World!");
		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@PostMapping("/customHello")
	public ResponseEntity<StringResponse> customHello(@RequestParam(value = "message") String message) {
		return new ResponseEntity<>(new StringResponse("Custom " + message), HttpStatus.OK);
	}
}
