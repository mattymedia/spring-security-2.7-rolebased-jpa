package co.com.jwtroledbase.controller;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.jwtroledbase.model.Book;
import co.com.jwtroledbase.service.IBookService;

@RestController
@RequestMapping("/books")
public class BookController {

	private IBookService bookService;
	
	public BookController(IBookService bookService) {
		this.bookService = bookService;
	}

	@PreAuthorize("hasRole('ROLE_USER')")
	@GetMapping
	public Book index() {
		return bookService.findById(1);
	}
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/list")
	public List<Book> findAll() {
		return bookService.findAll();
	}
	
}
