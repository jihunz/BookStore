package kr.ac.kopo.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.ac.kopo.bookstore.dao.BookDao;
import kr.ac.kopo.bookstore.model.Book;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	@Qualifier("BookDaoOracle")
	BookDao dao;
	
	@Override
	public List<Book> list() {
		return dao.list();
	}

	@Override
	public Book item(int bookid) {
		return dao.item(bookid);
	}

	@Override
	public void add(Book item) {
		dao.add(item);
	}

	@Override
	public void update(Book item) {
		dao.update(item);
	}

	@Override
	public void delete(int bookid) {
		dao.delete(bookid);
	}

}
