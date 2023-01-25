package co.com.jwtroledbase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.jwtroledbase.model.Book;

public interface IBookRepository extends JpaRepository<Book, Integer>{

}
