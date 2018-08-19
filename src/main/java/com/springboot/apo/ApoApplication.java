package com.springboot.apo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = false)
public class ApoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=	SpringApplication.run(ApoApplication.class, args);
		context.getBean(UserDao.class).add("wangxuan","1234");
		System.out.println(context.getBean(IUserDao.class).getClass());
		context.close();
	}
}
