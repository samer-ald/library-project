package com.mycompany.library.project;

public abstract class Item {

    protected String id, title, specialization;
    protected int year;
    protected boolean isBorrowed;

    public Item(String id, String title, int year, String specialization) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.specialization = specialization;
        this.isBorrowed = false;
    }

    public abstract void displayInfo();

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getspecialization() {
        return specialization;
    }

    public int getYear() {
        return year;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow() {
        isBorrowed = true;
    }

    public void returnItem() {
        isBorrowed = false;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", title=" + title + ", specialization=" + specialization + ", year=" + year + ", isBorrowed=" + isBorrowed + '}';
    }
    
}
//shahd