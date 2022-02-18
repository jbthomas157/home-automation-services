package com.hato.services.cameras;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CameraEndpoints {
	
	@GetMapping("/")
	public String[] testMethod() {
		String[] test = new String[2];
		test[0] = "hello";
		test[1] = "there";
		return test;
	}
	
}
