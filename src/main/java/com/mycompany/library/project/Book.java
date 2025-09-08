package com.mycompany.library.project;

public class Book extends Item {

    private String author, publisher;
    private int pages;

    public Book(String id, String title, int year, String specialization, String author, String publisher, int pages) {
        super(id, title, year, specialization);
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public void displayInfo() {
        System.out.println("[Book]: {" + title + "} by: " + author + " / At: " + year + " / specialization: " + specialization + "  / ID: " + id + " / publisher: " + publisher + " / pages: " + pages);
    }

}
//eyas