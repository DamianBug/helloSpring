package pl.akademiakodu.helloSpring.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.helloSpring.Dao.PersonDao;
import pl.akademiakodu.helloSpring.Dao.PersonDaoImpl;
import pl.akademiakodu.helloSpring.model.Person;

import java.util.Map;

/**
 * Created by Damian on 28.07.2017.
 */
public class PersonController {

    private PersonDao personDao = new PersonDaoImpl();

    @GetMapping("/person/add")
    public String addMode(Map modeMap) {
        return "person/add";
    }

    @PostMapping("/person/create")
    public String create(@ModelAttribute Person person, ModelMap modelMap){
        modelMap.addAttribute("person", person);
        return "person/show";
    }

    @GetMapping("/add")
    public String add(){
        return "article/add";
    }
//Stwórz formularz wyszukujący osoby po nazwisku
    @GetMapping("/person/search")
    public String search() {
        return "person/search";
    }

    @GetMapping("/person/results")
    public String result(@ModelAttribute Person person, ModelMap modelMap){
        System.out.println("Parametr "+person.getLastName());
        String lastName = person.getLastName();
        modelMap.addAttribute("people", personDao.findLastName(lastName));
        return "person/results";
    }
    @GetMapping("/personAll")
    public String all(ModelMap modelMap){
        modelMap.addAttribute("people", personDao.findAll());
        return "personAll";
    }

    @GetMapping("/person/id")
    public String display(@PathVariable Long id, ModelMap modelMap){
        System.out.println("Moje id to:"+id);
        modelMap.addAttribute("person", personDao.findOne(id));
        return "person/show";
    }

}

