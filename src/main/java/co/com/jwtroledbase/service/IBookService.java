package co.com.jwtroledbase.service;

import java.util.List;

import co.com.jwtroledbase.model.Book;

public interface IBookService {
	
	public List<Book> findAll();
	
	public Book findById(Integer id);
	
	public Book save(Book book);
}
