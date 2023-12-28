package com.mb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.entity.Book;
import com.mb.entity.BookPk;
import com.mb.repo.BookRepo;

@Service
public class BookService {
	
	@Autowired
	private BookRepo repo; 
	
	public void saveBook() {
		BookPk pk = new BookPk(102, "Java");
		Book entity = new Book(1000.00, "James", pk);
		repo.save(entity);
		System.out.println("Record saved...");
		
	}
	
	public void getRecord() {
		BookPk pk = new BookPk(101, "Java");
		Optional<Book> findById = repo.findById(pk);
		if(findById.isPresent()) {
			System.out.println(findById.get() + "sys");
		}
	}

}
