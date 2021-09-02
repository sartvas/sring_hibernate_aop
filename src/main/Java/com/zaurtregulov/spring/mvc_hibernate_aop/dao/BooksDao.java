package com.zaurtregulov.spring.mvc_hibernate_aop.dao;

import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Books;

import java.util.List;

public interface BooksDao {
    
    public List<Books> showAllBooks();
}
