package kr.ac.kopo.bookstore.service;

import java.util.List;

import kr.ac.kopo.bookstore.model.Book;

public interface BookService {

	List<Book> list();

	Book item(int bookid);

	void add(Book item);

	void update(Book item);

	void delete(int bookid);

}
