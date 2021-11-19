package com.nighthawk.csa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/greetAdi")
    public String greetAdi(Model model) {
        return "greetAdi";
    }

    @GetMapping("/greetChenxin")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greetChenxin";
    }

    @GetMapping("/greetPrisha")
    public String greetingPrisha(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greetPrisha";
    }


    @GetMapping("/greetRini")
    public String greetRini(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        return "greetRini";
    }

}