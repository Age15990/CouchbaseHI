package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MyTestApplication {
	
	@Autowired
	ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(MyTestApplication.class, args);
	}
	
	@PostConstruct
	public void printBeans()
	{
		String[] array = context.getBeanDefinitionNames();
		for (String a:array)
		{
			System.out.println(a);
		}
	}
		
}
