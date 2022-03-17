package kr.ac.kopo.bookstore.dao;

import java.util.List;

import kr.ac.kopo.bookstore.model.Book;

public interface BookDao {

	List<Book> list();

	Book item(int bookid);

	void add(Book item);

	void update(Book item);

	void delete(int bookid);

}
