
package com.zaurtregulov.spring.mvc_hibernate_aop.service;

import com.zaurtregulov.spring.mvc_hibernate_aop.dao.BooksDao;
import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Books;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BooksServiceImpl implements BookService{
    
    @Autowired
    private BooksDao booksDao;
    
    @Override
    @Transactional
    public List<Books> showAllBooks(){
        return booksDao.showAllBooks();
    }
}
