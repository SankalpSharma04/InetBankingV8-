package com.example.InetBankingV8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class InetBankingV8Application extends SpringBootServletInitializer {

	 @Override
	    protected SpringApplicationBuilder configure(
	      SpringApplicationBuilder builder) {
	        return builder.sources(InetBankingV8Application.class);
	    }
	
	public static void main(String[] args) {
		SpringApplication.run(InetBankingV8Application.class, args);
	}

}
