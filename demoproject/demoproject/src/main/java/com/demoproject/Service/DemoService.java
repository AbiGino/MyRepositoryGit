package com.demoproject.Service;

import com.demoproject.Entity.Book;
import com.demoproject.Repository.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class DemoService {

    @Autowired
    private DemoRepo demoRepo;
    //get(Read)
    public List<Book> getBooks(){

        List<Book> bookList=new ArrayList<>();
        demoRepo.findAll().forEach(book ->bookList.add(book));
        return bookList;

    }
    //create(post)
    public Book createBook(Book book){
        book.setName(book.getName());
        book.setDescription(book.getDescription());
        book.setYob(book.getYob());
        book.setBookType(book.getBookType());
        return demoRepo.save(book);
    }

    public Optional<Book> getBooksById(Integer id) {

        return demoRepo.findById(id);
    }


    public Optional<Book> getBooksByName(String name) {

        return demoRepo.findByName(name);
    }

    public Optional<Book> getBookByDescAndBookType(String description, String bookType) {
        return demoRepo.findByDescriptionAndBookType(description,bookType);
    }
//update
    public Book updateBook(Book book) {
        Book book1=demoRepo.findById(book.getId()).orElse(null);
        book.setName(book.getName());
        book.setDescription(book.getDescription());
        book.setYob(book.getYob());
        book.setBookType(book.getBookType());
        return demoRepo.save(book);
    }

    public String deleteBook(int id) {
        demoRepo.deleteById(id);
        return "deleted Successfully: "+id;

    }
}
