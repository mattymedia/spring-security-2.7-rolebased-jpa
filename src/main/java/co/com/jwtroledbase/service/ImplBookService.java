package co.com.jwtroledbase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.jwtroledbase.model.Book;
import co.com.jwtroledbase.repository.IBookRepository;

@Service
public class ImplBookService implements IBookService{

	@Autowired
	private IBookRepository bookRepository;
	
	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book save(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Book findById(Integer id) {
		return bookRepository.findById(id).orElse(null);
	}

}
