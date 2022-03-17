package kr.ac.kopo.bookstore.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kr.ac.kopo.bookstore.model.Book;

@Repository("BookDao")
public class BookDaoImpl implements BookDao {
	
	List<Book> list;
	
	public BookDaoImpl() {
		list = new ArrayList<Book>();
		
		Book book = new Book();
		book.setBookid(10);
		book.setBookname("엑셀완성");
		book.setPrice(30000);
		book.setPublisher("한빛미디어");
		
		list.add(book);
	}
	
	@Override
	public List<Book> list() {
		return list;
	}

	@Override
	public Book item(int bookid) {
		for(Book item : list) {
			if(item.getBookid() == bookid)
				return item;
		}
		
		return null;
	}

	@Override
	public void add(Book item) {
		list.add(item);
	}

	@Override
	public void update(Book item) {
		for(Book vo : list) {
			if(vo.getBookid() == item.getBookid()) {
				vo.setBookname(item.getBookname());
				vo.setPublisher(item.getPublisher());
				vo.setPrice(item.getPrice());
				
				return;
			}
		}
	}

	@Override
	public void delete(int bookid) {
		for(Book vo : list)
			if(vo.getBookid() == bookid) {
				list.remove(vo);
				
				return;
			}
	}

}
