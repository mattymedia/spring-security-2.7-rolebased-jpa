package co.com.jwtroledbase.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "books")
@Data//lombock anotation; Create getters, setters, toString()
public class Book implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String title;
	
	private String author;

	@Column(name = "published_date")
	private String pblshDate;

	@Column(name = "create_at")
	private LocalDate createAt;

	public Book() {}
	
	public Book(String title, String author, String pblshDate) {
		this.title = title;
		this.author = author;
		this.pblshDate = pblshDate;
		this.createAt = LocalDate.now();
	}
	
	private static final long serialVersionUID = 1L;
	
}
