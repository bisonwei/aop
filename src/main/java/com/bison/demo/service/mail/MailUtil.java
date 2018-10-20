package com.bison.demo.service.mail;

import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class MailUtil {

	    private ScheduledExecutorService service = Executors.newScheduledThreadPool(6);

	    private final AtomicInteger count = new AtomicInteger(1);

	    public void start(final JavaMailSender mailSender,final SimpleMailMessage message) {
	        service.execute(new Runnable() {
	            @Override
	            public void run() {
	                try {
	                    if (count.get() == 2) {
	                        service.shutdown();
	                    }
	                    mailSender.send(message);
	                }catch (Exception e){
	                }

	            }
	        });
	    }
	    public void startHtml(final JavaMailSender mailSender,final MimeMessage message) {
	        service.execute(new Runnable() {
	            @Override
	            public void run() {
	                try {
	                    if (count.get() == 2) {
	                        service.shutdown();
	                    }
	                    mailSender.send(message);
	                }catch (Exception e){
	                }

	            }
	        });
	    }
	    /**
	     * 获取 Sender 多实例发送
	     * @return
	     */
	    public static JavaMailSenderImpl createMailSender(){
	        JavaMailSenderImpl sender = new JavaMailSenderImpl();
	        sender.setHost("smtp.qq.com");
	        sender.setPort(25);
	        sender.setUsername("497691814@qq.com");
	        sender.setPassword("123456");
	        sender.setDefaultEncoding("Utf-8");
	        Properties p = new Properties();
	        p.setProperty("mail.smtp.timeout",1000+"");
	        p.setProperty("mail.smtp.auth","true");
	        sender.setJavaMailProperties(p);
	        return sender;
	    }
		
		public static void main(String[] args) {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom("admin@52itstyle.com");
			message.setTo("345849402@qq.com");
			message.setSubject("测试");
			message.setText("测试");
			createMailSender().send(message);
		}
}
