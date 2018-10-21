<!--pom.xml -->
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-aop</artifactId>
</dependency>

<!--application.properties -->
#  邮件发送服务方
spring.mail.host=smtp.163.com
#   发送方的邮箱
spring.mail.username=XXXX@163.com
# 对于qq邮箱而言 密码指的就是发送方的授权码 
spring.mail.password=XXXX
#是否用启用加密传送的协议验证项
spring.mail.properties.mail.smtp.auth=true  
spring.mail.properties.mail.smtp.starttls.enable=true  
spring.mail.properties.mail.smtp.starttls.required=true
