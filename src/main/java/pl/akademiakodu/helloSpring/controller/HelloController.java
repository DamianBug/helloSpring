package pl.akademiakodu.helloSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademiakodu.helloSpring.model.Lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by Damian on 27.07.2017.
 */
@Controller
public class HelloController {


    @GetMapping("/")
    public String hello(ModelMap modelMap){
        modelMap.addAttribute("person", "Damian");
        return "hello";
    }
    @ResponseBody
    @GetMapping("/hello")
    public String helloName(){
        return "Hello Damian";
    }

    //wyświetlić jedną losową liczbę z dużego lotka

    @GetMapping("/random")
    public String getRandom(ModelMap modelMap) {
        modelMap.addAttribute("numbers", Lotto.getRandomNumbers());
        return "random";
    }

    //ćwiczenia themyleaf zadanie 1
    @GetMapping("/if")
    public String ifStatment(ModelMap modelMap) {
        modelMap.addAttribute("int", "Michał");
        modelMap.addAttribute("myText", "Simple text");
        modelMap.addAttribute("x", 123);
        modelMap.addAttribute("b", 456);
        return "if";
    }

    @GetMapping("/bookAdd")
    public String Add(){
        return "add";
    }
}

