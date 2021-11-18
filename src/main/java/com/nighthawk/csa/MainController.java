package com.nighthawk.csa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/greetAdi")
    public String greetAdi(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        return "greetAdi";
    }

    @GetMapping("/greetChenxin")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greetChenxin";
    }

    @GetMapping("/prisha")
    public String prisha(Model model) {
        return "prisha";
    }


    @GetMapping("/greetRini")
    public String greetRini(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        return "greetRini";
    }

}