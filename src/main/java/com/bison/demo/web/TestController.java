package com.bison.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bison.demo.service.mail.Email;
import com.bison.demo.service.mail.MailService;

@RestController
public class TestController {
	@Autowired
	MailService mailService;
	
	@RequestMapping("/")
    String home() {
        return "Hello World!";
    }
	@RequestMapping("/test")
    String test(String name) {
        return "Hello World test!"+name;
    }
}
