package com.bushansirgur.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import com.bushansirgur.spring.dao.BookDao;
import com.bushansirgur.spring.model.Book;

@Service
public class BookServiceImp implements BookService {
	@Autowired
	private BookDao bookDao;

	@Override
	@Transactional
	public long save(Book book) {
		return bookDao.save(book);
	}

	@Override
	@Transactional
	public Book get(long id) {
		return bookDao.get(id);
	}

	@Override
	@Transactional
	public List<Book> list() {
		return bookDao.list();
	}

	@Override
	@Transactional
	public void update(long id, Book book) {
		bookDao.update(id, book);
	}

	@Override
	@Transactional
	public void delete(long id) {
		bookDao.delete(id);
	}

}
