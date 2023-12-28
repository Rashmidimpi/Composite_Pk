package com.mb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mb.entity.Book;
import com.mb.entity.BookPk;

public interface BookRepo extends JpaRepository<Book, BookPk>{

}
