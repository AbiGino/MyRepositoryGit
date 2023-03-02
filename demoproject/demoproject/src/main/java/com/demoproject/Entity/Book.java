package com.demoproject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name ="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //  @NotNull(message = "name can't be null value")
    private String name;
    // @NotNull(message="description can't be null value")
    private String description;
    // @NotNull(message = "yob can't be null value")
    private Integer yob;
    //  @NotNull(message = "bookType can't be null value")
    private String bookType;

    public Book() {

    }

    public Book(Integer id, String name, String description, Integer yob, String bookType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.yob = yob;
        this.bookType = bookType;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public Integer getYob() {

        return yob;
    }

    public void setYob(Integer yob) {

        this.yob = yob;
    }

    public String getBookType() {

        return bookType;
    }

    public void setBookType(String bookType) {

        this.bookType = bookType;
    }
}
