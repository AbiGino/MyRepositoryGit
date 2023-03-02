package com.demoproject.Repository;

import com.demoproject.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DemoRepo extends JpaRepository<Book, Integer> {
    @Query(value = "select * from school.book where name =:name", nativeQuery = true)
    Optional<Book> findByName(String name);

    @Query(value = "select * from school.book where description=:description and book_type=:bookType", nativeQuery = true)
    Optional<Book> findByDescriptionAndBookType(String description, String bookType);
}
