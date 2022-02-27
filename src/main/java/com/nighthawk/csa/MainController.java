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
import java.util.HashMap;

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
        return "aboutus/aboutus";
    }

    @GetMapping("/games_home_page")
    public String games_home_page(Model model) {
        return "games/games_home_page";
    }

    @GetMapping("/physics_game")
    public String physics_game(Model model) {
        return "games/physics_game";
    }

    @GetMapping("/medical_game")
    public String medical_game(Model model) {
        return "games/medical_game";
    }

    @GetMapping("/game3")
    public String game3(Model model) {
        return "bio_game";
    }

    @GetMapping("/bio_wordle")
    public String bio_wordle(Model model) {return "games/bio_wordle";}

    @GetMapping("/chemistry_game")
    public String chemistry_game(Model model) {return "games/chemistry_game";}

    @GetMapping("/draw")
    public String draw(Model model) {
        return "draw";
    }

    /*@GetMapping("biology-road")
    public String bioroad(Model model) {
        return "biologyroad";
    }

    @GetMapping("plant-eater")
    public String planteat(Model model) {
        return "planteater";
    } */

    @GetMapping("flappybird")
    public String flappybird(Model model) {
        return "flappybird";
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

        return "aboutus/greetAdi";
    }

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

        return "aboutus/greetChenxin";
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

        return "aboutus/greetPrisha";
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

        return "aboutus/greetRini";
    }

    @GetMapping("/physicsTrivia")
    public String physicsTrivia(Model model) {
        return "physicsTrivia";
    }

    @GetMapping("/medicalTrivia")
    public String medicalTrivia(Model model) {
        return "games/medicalTrivia";
    }

    @GetMapping("/further_readings")
    public String furtherReadings(Model model) {
        return "sources/further_readings";
    }

    @GetMapping("/chemistry_sources")
    public String chemistrySources(Model model) {
        return "sources/chemistry_sources";
    }

    @GetMapping("/medical_sources")
    public String medicalSources(Model model) {
        return "sources/medical_sources";
    }

    @GetMapping("/physics_sources")
    public String physicsSources(Model model) {
        return "sources/physics_sources";
    }

    @GetMapping("/plant_bio_sources")
    public String plantBioSources(Model model) {
        return "sources/plant_bio_sources";
    }


    @GetMapping("/frq_directory")
    public String frqDirectory(Model model) {
        return "frq_directory";
    }

    @GetMapping("/frq_rini")
    public String frqRini(Model model) {
        return "frqs/frq_rini";
    }

    @GetMapping("/frq_adi")
    public String frqAdi(Model model) {
        return "frqs/frq_adi";
    }

    @GetMapping("/frq_chenxin")
    public String frqChenxin(Model model) {
        return "frqs/frq_chenxin";
    }

    @GetMapping("/frq_prisha")
    public String frqPrisha(Model model) {
        return "frqs/frq_prisha";
    }

}


