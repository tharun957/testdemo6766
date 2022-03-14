package com.firstservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer1")
public class FirstServiceController {
	
	
		@GetMapping("/message")
		public String test() {
			return "Hello ApiGateway Called in First Service";
		}

	
}
