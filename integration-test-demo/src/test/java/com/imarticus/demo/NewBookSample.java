package com.junit.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.web.client.RestTemplate;
import com.junit.demo.model.Book;
import com.junit.demo.repository.BookRepo;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class NewBookSample
{
	static RestTemplate restTemp;
	
	@Autowired
	BookRepo bookRepo;
	
	@LocalServerPort
	int port;
	String baseURL="http://localhost";
	
	@BeforeAll
	static public void setup() {
		restTemp = new RestTemplate();
	}
	
	@BeforeEach
	public void initialSetUpforURL() {
		baseURL = baseURL.concat(":").concat(""+port).concat("/book");
	}
	
	@Test
//	@Sql(statements="delete from book",executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
	public void checkNewBookEntry() {
		Book book = new Book("React JS","Chitra Ravi",900);
		
		Book newBook = restTemp.postForObject(baseURL+"/addBook", book, Book.class);
		
		assertEquals("Chitra Ravi", newBook.getAuthor());
	}
	
	@Test
	@Sql(statements="delete from book",executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
	@Sql(statements="insert into book (id,name,author,price) values(103,'Data science','Richord Gills',3000)",executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
	@Sql(statements="delete from book",executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
	public void checkFindAll()
	{
		List<Book> bookList = restTemp.getForObject(baseURL+"/allBook", List.class);
		
		assertEquals(1, bookList.size());
	}
	

	@Test
	@Sql(statements="insert into book (id,name,author,price) values(103,'Data Science','Richord Gills',3000)",executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
	public void checkUpdatedBook()
	{
		Book book = new Book(".Net programing","Ananth Swami",800);
		
		restTemp.put(baseURL+"/update/103", book);
		
		assertEquals("Ananth Swami", bookRepo.findById(103).get().getAuthor());	
	}

	
	
	
}