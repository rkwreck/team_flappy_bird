package com.nighthawk.csa;

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
    public String biowordle(@RequestParam(name = "word", required = false, defaultValue = "hello") String word, Model model) {
            // @RequestParam handles required and default values, name and database are class variables, database looking like JSON
            model.addAttribute("word", word);   // MODEL is passed to html

            Wordle wordle = new English();

            return "games/biowordle";
        }



}