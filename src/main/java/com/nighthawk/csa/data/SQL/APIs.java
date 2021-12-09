/*
package com.nighthawk.csa.data.SQL;
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
@Controller
public class APIs {
    @GetMapping("/greetPrisha")
    public String twitchAPI(Model model) throws IDException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://twitch-game-popularity.p.rapidapi.com/game?name=League%20of%20Legends&year=2020&month=08"))
                .header("x-rapidapi-host", "twitch-game-popularity.p.rapidapi.com")
                .header("x-rapidapi-key", "SIGN-UP-FOR-KEY")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        var map = new ObjectMapper().readValue(response.body(), HashMap.class);
        model.addAttribute("data", map);

    }
}
*/
