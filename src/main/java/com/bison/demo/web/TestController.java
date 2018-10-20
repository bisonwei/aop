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
    String test() throws Exception {
		Email mail = new Email();
		mail.setSubject("test");
		mail.setContent("rrrrrr446665165rrrrrrrrr");
		mail.setEmail("497691814@qq.com");
		mailService.sendHtml(mail);
		System.out.println("ssssssssssssssssss");
        return "Hello World test!";
    }
}
