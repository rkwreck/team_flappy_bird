package com.nighthawk.csa;

import com.nighthawk.csa.database.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// Built using article: https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html
// or similar: https://asbnotebook.com/2020/04/11/spring-boot-thymeleaf-form-validation-example/
@Controller
public class WordleController implements WebMvcConfigurer {

    // Autowired enables Control to connect HTML and POJO Object to Database easily for CRUD


    @GetMapping("/games/biowordle")
    public String biowordle(@RequestParam(name = "char1", required = false, defaultValue = "World") String char1,
                            @RequestParam(name = "char2", required = false, defaultValue = "World") String char2,
                            @RequestParam(name = "char3", required = false, defaultValue = "World") String char3,
                            @RequestParam(name = "char4", required = false, defaultValue = "World") String char4,
                            @RequestParam(name = "char5", required = false, defaultValue = "World") String char5,
                            Model model ) {
            // @RequestParam handles required and default values, name and database are class variables, database looking like JSON
            model.addAttribute("char1", char1);
            model.addAttribute("char2", char2);
            model.addAttribute("char3", char3);
            model.addAttribute("char4", char4);
            model.addAttribute("char5", char5); // MODEL is passed to html

            Wordle wordle = new Wordle(char1, char2, char3, char4, char5);

            wordle.word();

            return "games/biowordle";
        }






}