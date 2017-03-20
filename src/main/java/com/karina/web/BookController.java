package com.karina.web;

import com.karina.beans.Book;
import com.karina.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by kawee on 3/17/2017.
 */
@RestController
@RequestMapping(value = "/books")
public class BookController {
    private BookService service;

    @Autowired
    public void setService(BookService service) {
        this.service = service;
    }

    @RequestMapping(value = "/save",
                    method = RequestMethod.POST,
                    consumes = MediaType.APPLICATION_JSON_VALUE,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public Book save(@RequestBody Book book){
        return service.save(book);
    }

    @RequestMapping(value = "/all",
                    method = RequestMethod.GET,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> findAll(){
        return service.findAll();
    }

    @RequestMapping(value = "/find/{id}",
                    method = RequestMethod.GET,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public Book findOne(@PathVariable Integer id){
        return service.findOne(id);
    }

    @RequestMapping(value = "/delete/{id}",
                    method = RequestMethod.DELETE,
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
