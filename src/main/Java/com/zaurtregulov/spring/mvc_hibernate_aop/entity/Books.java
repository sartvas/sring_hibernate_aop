
package com.zaurtregulov.spring.mvc_hibernate_aop.entity;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Books {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "author")
    private String author;
    
    @Column(name = "genre")
    private String genre;
    
    @Column(name = "primary_cost")
    private int primaryCost;

    public Books() {
    }

    public Books(String name, String author, String genre, int primaryCost) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.primaryCost = primaryCost;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrimaryCost() {
        return primaryCost;
    }

    public void setPrimaryCost(int primaryCost) {
        this.primaryCost = primaryCost;
    }
    
    
}
