package com.demoproject.Controller;

import com.demoproject.Entity.Book;
import com.demoproject.Service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DemoController {

    @Autowired
    public DemoService demoService;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return demoService.getBooks();
    }

    @GetMapping("/books/id")
    public Optional<Book> getBookById(@RequestParam Integer id) {
        return demoService.getBooksById(id);
    }

    @GetMapping("books/name")
    public Optional<Book> getBookByName(@RequestParam String name) {
        return demoService.getBooksByName(name);
    }

    @GetMapping("books/condition")
    public Optional<Book> getBookByDescription(@RequestParam String description, @RequestParam String bookType) {
        return demoService.getBookByDescAndBookType(description, bookType);
    }


    @PostMapping("/addbook")
    public Book createBook(@RequestBody Book book)
    {

        return demoService.createBook(book);
    }

    @PutMapping("/updatebook")
        public Book updateBook(@RequestBody Book book){

        return demoService.updateBook(book);
        }

    @DeleteMapping("/deletebook/{id}")
    public String deleteBook(@PathVariable int id){

        return demoService.deleteBook(id);
    }
    //http://localhost:8080/deletebook/1 this is for delete id (url)
}



