package pl.akademiakodu.helloSpring.model;

/**
 * Created by Damian on 27.07.2017.
 */
public class Book {
    private String author;
    private String title;
    private double price;

    public Book(String author, String title, double price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return getTitle() + " " + getAuthor() + " " + getPrice();
    }
}