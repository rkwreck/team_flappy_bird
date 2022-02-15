package com.nighthawk.csa;

import java.util.Objects;

import org.json.simple.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class WordleController {
    // our objects
    Wordle char1;
    Wordle char2;
    Wordle char3;
    Wordle char4;
    Wordle char5;

    // Getter to transform string_ops object to JSON
    public JSONObject getBody() {
        JSONObject body = new JSONObject();
        body.put("char1", char1.toString());
        body.put("char2", char2.toString());
        body.put("char3", char3.toString());
        body.put("char4", char4.toString());
        body.put("char5", char5.toString());
        return body;
    }

    public void stringEvent(JSONObject jo) {
        // Get string action
        String action = (String) jo.get("action");

        // Update string_ops based off of action
        switch (action) {
            case "new":  // new sequence
                String char1 = (String) jo.get("char1"); // here, we're changing our char 2 from type "Wordle" to String
                String char2 = (String) jo.get("char2");
                String char3 = (String) jo.get("char3");
                String char4 = (String) jo.get("char4");
                String char5 = (String) jo.get("char5");

                //avoid condition of an empty title
               // if (char1 == null || char1.length() == 0)
                 // char1 = char1.setchar1();


                //create new object
                this.char1 = new Wordle();
                this.char1.setchar1(char1);

                this.char2 = new Wordle();
                this.char2.setchar2(char2);

                this.char3 = new Wordle();
                this.char3.setchar3(char3);

                this.char4 = new Wordle();
                this.char4.setchar4(char4);

                this.char5 = new Wordle();
                this.char5.setchar5(char5);

                break;

            case "ch1":  // init or update string sequence
                String ch1 = (String) jo.get("char1");
                this.char1.setchar1(ch1);
                break;

            case "ch2":  // init or update string sequence
                String ch2 = (String) jo.get("char2");
                this.char2.setchar2(ch2);
                break;

            case "ch3":  // init or update string sequence
                String ch3 = (String) jo.get("char3");
                this.char3.setchar3(ch3);
                break;

            case "ch4":  // init or update string sequence
                String ch4 = (String) jo.get("char4");
                this.char4.setchar4(ch4);
                break;

            case "ch5":  // init or update string sequence
                String ch5 = (String) jo.get("char5");
                this.char5.setchar5(ch5);
                break;

            default:
                // noop
        }
    }

    // String initial method
    @GetMapping("/games/biowordle")
    public String strings(@RequestParam(name="char1", required=false, defaultValue="a") String char1, Model model) {
        //Set default database randomly
        Wordle word = new Wordle();



        model.addAttribute("word", word);
        //char2 = Wordle.wordlemepls();
        //model.addAttribute("object", char2);

        //char3 = Wordle.wordlemepls();
        //model.addAttribute("object", char3);

        //char4 = Wordle.wordlemepls();
        //model.addAttribute("object", char4);

        //char5 = Wordle.wordlemepls();
        //model.addAttribute("object", char5);

        return "games/biowordle"; //HTML render fibonacci results
    }

    // Starting a new sequence
    @RequestMapping(value = "/api/games/biowordle", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> stringsNew(RequestEntity<Object> request) {
        // extract json from RequestEntity
        JSONObject jo = new JSONObject((Map) Objects.requireNonNull(request.getBody()));

        // process string sequence action(s)
        stringEvent(jo);

        // create JSON object of string sequence resulting database and metadata
        JSONObject body = this.getBody();

        // send ResponseEntity body and status message
        return new ResponseEntity<>(body, HttpStatus.OK);
    }

    // Inventor List
    public static Wordle inventorList() {
        // String initializer test
        WordleController testWord = new WordleController();
        JSONObject jo = new JSONObject();

        // new object and set a title
        jo.put("ch2", "ch1");
        jo.put("ch1", "StringsController Inventor List");
        testWord.stringEvent(jo);

        // new test
        jo.put("action", "ch1");
        jo.put("new_sequence", "Albert Einstein, Thomas Edison, Marie Curie");
        testWord.stringEvent(jo);

        // update test
        jo.put("ch1", "ch4");
        jo.put("ch5", ", Benjamin Franklin");
        testWord.stringEvent(jo);



        return testWord.char1;
    }

}















