package com.karina.data;

import com.karina.beans.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by kawee on 3/17/2017.
 */

public interface BookRepository extends MongoRepository<Book, Integer>{
    @Override
    <S extends Book> S save(S book);

    @Override
    List<Book> findAll();

    @Override
    Book findOne(Integer id);

    @Override
    void delete(Integer id);
}
