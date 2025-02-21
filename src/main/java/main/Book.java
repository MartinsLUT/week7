package main;

public class Book extends Item {
    private String author;

    public Book(String id, String title, String author){
        super(id, title);
        this.author = author;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }
    
   

    public String toString(){
        return "ID: " + getId() + ", Title: " + getTitle() + ", Author: " + this.author;
    }
}
