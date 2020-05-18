package com.sever.BookStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
		
		/*
		 * Book book1 = new Book();
		 * 
		 * book1.setTitle("Berurier in serai"); book1.setAuthor("San-Antonio");
		 * 
		 * System.out.println(book1.getAuthor() + " - " + book1.getTitle());
		 * 
		 * 
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sever/BookStore/beans.xml");
		
		Book book2 = (Book) context.getBean("BookBean");
		book2.setAuthor("San Antonio");
		
		System.out.println(book2.getAuthor());
		System.out.println(book2.getTitle());
		
		
		
		
		
		
		
	}

}
