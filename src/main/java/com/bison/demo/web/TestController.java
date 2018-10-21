package com.bison.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
	
	
	@RequestMapping("/")
	public String home() {
        return "Hello World!aop";
    }
	@RequestMapping("/test")
	public String test(String name) {
        System.out.println("name:"+name);
		return "Hello World test!aop"+name;
    }
	
	@GetMapping("/hello")
	 public Object error() {  
        return "hello";  
    }  
}
