package com.nighthawk.csa;

import com.nighthawk.csa.Wordle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.Random;

// Built using article: https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html
// or similar: https://asbnotebook.com/2020/04/11/spring-boot-thymeleaf-form-validation-example/
@Controller
public class WordleController implements WebMvcConfigurer {

    // Autowired enables Control to connect HTML and POJO Object to Database easily for CRUD

    public String char1;
    public String char2;
    public String char3;
    public String char4;
    public String char5;


    @GetMapping("/games/biowordle")
    public String biowordle(@RequestParam(name = "char1", required = true, defaultValue = "a") String char1,
                            @RequestParam(name = "char2", required = true, defaultValue = "a") String char2,
                            @RequestParam(name = "char3", required = true, defaultValue = "a") String char3,
                            @RequestParam(name = "char4", required = true, defaultValue = "a") String char4,
                            @RequestParam(name = "char5", required = true, defaultValue = "a") String char5,
                            Model model) {
        // @RequestParam handles required and default values, name and database are class variables, database looking like JSON

        model.addAttribute("char1", char1);
        model.addAttribute("char2", char2);
        model.addAttribute("char3", char3);
        model.addAttribute("char4", char4);
        model.addAttribute("char5", char5);

        // model here adds and connects to html

        ArrayList<String> wordList = new ArrayList<String>();
        wordList.add("biome");
        wordList.add("codon");
        wordList.add("fruit");
        wordList.add("hypha");
        wordList.add("model");
        wordList.add("phase");
        wordList.add("polyp");
        wordList.add("shell");
        wordList.add("phyla");
        wordList.add("spore");
        wordList.add("virus");
        wordList.add("xylem");
        wordList.add("codon");
        wordList.add("fluid");
        wordList.add("group");
        wordList.add("joule");
        wordList.add("solid");
        wordList.add("plant");
        wordList.add("berry");
        wordList.add("birds");
        wordList.add("genes");

        int x = (int) (Math.random() * 20);

        String target = wordList.get(x);

        String word = char1 + char2 + char3 + char4 + char5;


        String ta1 = target.substring(0, 1);
        String ta2 = target.substring(1, 2);
        String ta3 = target.substring(2, 3);
        String ta4 = target.substring(3, 4);
        String ta5 = target.substring(4, 5);

        // character 1 check

        if (char1.equals(ta1)) {

            this.char1 = "good job";


        }

        else if (target.contains(char1)) {

            this.char1 = char1 + " is in the word";


        }

        else {

            this.char1 = char1 + " is not in the word.";

        }

        // character 2 check

        if (char2.equals(ta2)) {

            this.char2 = "good job";


        }

        else if (target.contains(char2)) {

            this.char2 = char2 + " is in the word";

        }

        else {

            this.char2 = char2 + " is not in the word.";

        }

        // character 3 check

        if (char3.equals(ta3)) {

            this.char3 = "good job";


        }

        else if (target.contains(char3)) {

            this.char3 = char3 + " is in the word";


        }
        else {

            this.char3 = char3 + " is not in the word.";

        }


        // character 4 check

        if (char4.equals(ta4)) {

            this.char4 = "good job";


        }

        else if (target.contains(char4)) {

            this.char4 = char4 + " is in the word";


        }

        else {

            this.char4 = char4 + " is not in the word.";

        }

        // character 5 check
        if (char5.equals(ta5)) {

            this.char5 = "good job";


        }

        else if (target.contains(char5)) {

            this.char5 = char5 + " is in the word";


        }

        else {

            this.char5 = char5 + " is not in the word.";

        }

        model.addAttribute("char1", char1);
        model.addAttribute("char2", char2);
        model.addAttribute("char3", char3);
        model.addAttribute("char4", char4);
        model.addAttribute("char5", char5);

        // model here adds and connects to html


        return "games/biowordle";
    }


}
