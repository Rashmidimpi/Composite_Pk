package com.mb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mb.service.BookService;

@SpringBootApplication
public class CompositePkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context 
		= SpringApplication.run(CompositePkApplication.class, args);
		
		BookService service = context.getBean(BookService.class);
//		service.saveBook();
		service.getRecord();
	}

}
