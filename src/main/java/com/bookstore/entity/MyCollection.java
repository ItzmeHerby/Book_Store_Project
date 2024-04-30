package com.bookstore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MyCollection {

    @Id
    private int bookId;
    @Column
    private String bookName;
    @Column
    private String authorName;
    @Column
    private int bookPrice;

    public MyCollection() {
    }

    public MyCollection(int bookId, String bookName, String authorName, int bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookPrice = bookPrice;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "MyCollection [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName
                + ", bookPrice=" + bookPrice + "]";
    }

}
