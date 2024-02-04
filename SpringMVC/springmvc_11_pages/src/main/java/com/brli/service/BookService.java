package com.brli.service;

import com.brli.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    /**
     * save
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * update
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * delete by id
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * search by id
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * search all
     * @return
     */
    public List<Book> getAll();
}
