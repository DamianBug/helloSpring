package pl.akademiakodu.helloSpring.Dao;

import pl.akademiakodu.helloSpring.model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damian on 27.07.2017.
 */
public class BookDao {

    public static List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        for (int i = 1; i <= 6; i++){
        books.add(new Book("Author"+i, "Książka"+i, 51.99+i));
    }
    return books;
    }
}
