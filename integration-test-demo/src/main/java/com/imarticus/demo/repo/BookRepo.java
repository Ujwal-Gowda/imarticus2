package com.imarticus.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.imarticus.demo.model.Book;


public interface BookRepo extends JpaRepository<Book, Integer> {

	Book findByName(String name);

	Book findByAuthor(String author);
	
	

}
