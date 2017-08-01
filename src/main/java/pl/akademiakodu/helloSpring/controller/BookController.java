package pl.akademiakodu.helloSpring.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.helloSpring.Dao.BookDao;
import pl.akademiakodu.helloSpring.model.Book;

/**
 * Created by Damian on 27.07.2017.
 */
public class BookController {
    @GetMapping("/loop")
    public String findAll(ModelMap modelMap){
        modelMap.addAttribute("book", BookDao.findAll());
        return "loop";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Book book, ModelMap modelMap){
        modelMap.addAttribute("book", book);
        return "add";
    }
}
