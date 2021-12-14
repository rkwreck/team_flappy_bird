package com.nighthawk.csa;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.io.IOException;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/home")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/ourPurpose")
    public String ourPurpose(Model model) {
        return "ourPurpose";
    }

    @GetMapping("/aboutus")
    public String aboutus(Model model) {
        return "aboutus";
    }

    @GetMapping("/games")
    public String games(Model model) {
        return "games";
    }

    @GetMapping("/game1")
    public String game1(Model model) {
        return "game1";
    }

    @GetMapping("/game2")
    public String game2(Model model) {
        return "game2";
    }

    @GetMapping("/game3")
    public String game3(Model model) {
        return "game3";
    }

    @GetMapping("/draw")
    public String draw(Model model) {
        return "draw";
    }

    @GetMapping("/greetAdi")
    public String apiAdi(@RequestParam(name="sym", required=false, defaultValue="stomach") String name, Model model) throws IOException, InterruptedException {
        String rapidapiurl = "https://healthwise.p.rapidapi.com/body/diseases/" + name;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(rapidapiurl))
                .header("x-rapidapi-host", "healthwise.p.rapidapi.com")
                .header("x-rapidapi-key", "f8edd9e91fmsh4ba8ab5c12046e4p120635jsn54ceca15e244")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        var amap = new ObjectMapper().readValue(response.body(), HashMap.class);

        model.addAttribute("map", amap);
        model.addAttribute("stuff", amap.get("data"));

        return "greetAdi";
    }

    /**
    @GetMapping("/greetChenxin")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greetChenxin";
    }
     */

    @GetMapping("/greetChenxin")
    public String api(@RequestParam(name="sym", required=false, defaultValue="452") String name, Model model) throws IOException, InterruptedException {
        String rapidapiurl = "https://free-to-play-games-database.p.rapidapi.com/api/game?id=" + name;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(rapidapiurl))
                .header("x-rapidapi-host", "free-to-play-games-database.p.rapidapi.com")
                .header("x-rapidapi-key", "f8edd9e91fmsh4ba8ab5c12046e4p120635jsn54ceca15e244")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        var map = new ObjectMapper().readValue(response.body(), HashMap.class);

        model.addAttribute("data", map);
        model.addAttribute("game", map.get("title"));
        model.addAttribute("explain", map.get("short_description"));
        model.addAttribute("genre", map.get("genre"));
        model.addAttribute("publisher", map.get("publisher"));
        model.addAttribute("date", map.get("release_date"));

        return "greetChenxin";
    }


    @GetMapping("/greetPrisha")
    public String apiPrisha(@RequestParam(name="sym", required=false, defaultValue="Majora") String name, Model model) throws IOException, InterruptedException{
        String rapidapiurl = "https://the-legend-of-zelda.p.rapidapi.com/games?name=" + name;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(rapidapiurl))
                .header("x-rapidapi-host", "the-legend-of-zelda.p.rapidapi.com")
                .header("x-rapidapi-key", "f8edd9e91fmsh4ba8ab5c12046e4p120635jsn54ceca15e244")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        var pmap = new ObjectMapper().readValue(response.body(), HashMap.class);

        model.addAttribute("map", pmap);
        model.addAttribute("stuff", pmap.get("data"));

        return "greetPrisha";
    }

    @GetMapping("/greetRini")
    public String apRini(@RequestParam(name="sym", required=false, defaultValue="Swift") String name, Model model) throws IOException, InterruptedException{
        String rapidapiurl = "https://genius.p.rapidapi.com/search?q=" + name;
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(rapidapiurl))
                .header("x-rapidapi-host", "genius.p.rapidapi.com")
                .header("x-rapidapi-key", "f8edd9e91fmsh4ba8ab5c12046e4p120635jsn54ceca15e244")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        var rmap = new ObjectMapper().readValue(response.body(), HashMap.class);

        model.addAttribute("map", rmap);
        model.addAttribute("stuff", rmap.get("response"));

        return "greetRini";
    }
}


