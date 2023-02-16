package edu.uaslp.examen;

import java.util.ArrayList;

public class BookCollection {
    private String name;
    private ArrayList books;
    public BookCollection(String name){
        books=new ArrayList();
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void addBook(Book book){

    }
    public Book getBooks(ArrayList books){
        return books;
    }
    public int getStars(){
        return stars;
    }

}
