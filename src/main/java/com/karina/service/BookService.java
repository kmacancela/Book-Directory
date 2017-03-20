package com.karina.service;

import com.karina.beans.Book;
import com.karina.data.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kawee on 3/17/2017.
 */
@Service
public class BookService{

    private BookRepository repository;

    @Autowired
    public void setRepository(BookRepository repository) {
        this.repository = repository;
    }

    public Book save(Book book){
        return repository.save(book);
    }

    public List<Book> findAll(){
        return repository.findAll();
    }

    public Book findOne(Integer id){
        return repository.findOne(id);
    }

    public void delete(Integer id){
        repository.delete(id);
    }
}
