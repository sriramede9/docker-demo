package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerMessageController {
	
	@Value("${msg}")
	private String msg;

	@GetMapping("/messages")
    public String getMessage() {
        return "Hello from Docker!"+" \t "+msg;
    }
}
