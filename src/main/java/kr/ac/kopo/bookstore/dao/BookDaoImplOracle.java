package kr.ac.kopo.bookstore.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.bookstore.model.Book;

@Repository("BookDaoOracle")
public class BookDaoImplOracle implements BookDao {
	
	@Autowired
	SqlSession sql;

	@Override
	public List<Book> list() {
		return sql.selectList("book.list");
	}

	@Override
	public Book item(int bookid) {
		return sql.selectOne("book.item",bookid);
	}

	@Override
	public void add(Book item) {
		sql.insert("book.add", item);
		
	}

	@Override
	public void update(Book item) {
		sql.update("book.update", item);
		
	}

	@Override
	public void delete(int bookid) {
		sql.delete("book.delete", bookid);
		
	}
	
	


}
