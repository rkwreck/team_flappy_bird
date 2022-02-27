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
public class PhysicsTriviaController implements WebMvcConfigurer {
    // member vars
    ArrayList<Trivia> AllTrivia = new ArrayList<Trivia>();
    int currQNum = 1; // we will calculate the final score after all questions are answered by user

    public class Trivia {
        public String prompt;
        public String[] opts; // in order, the answer options are known as a b c d
        public String correctAnswer; // allowed values: a b c d
        public String userAnswer;

        public Trivia(String prompt, String[] opts, String correctAnswer) {
            this.prompt = prompt;
            this.opts = new String[4];
            this.opts = opts;
            this.correctAnswer = correctAnswer;
        }
    }

    PhysicsTriviaController() {
        AllTrivia.add(
                new Trivia("Under what condition are you allowed to use the 4 main kinematics equations?",
                        new String[]{"When time is constant", "When position is constant", "When velocity is constant", "When acceleration is constant"},
                        "d"));

        AllTrivia.add(
                new Trivia("If a projectile is launched at an angle and returns back to the same height when it lands, what type of projectile motion is it?",
                        new String[]{"Type 1", "Type 2", "Type 3", "Type 4"},
                        "b"));
    }

    @GetMapping("checkPhysicsTriviaAnswer")
    public String checkPhysicsTriviaAnswer (@RequestParam(name = "userAnswer", required = true, defaultValue = "a") String answer,
                            Model model ) {
        // @RequestParam handles required and default values
        model.addAttribute("answer", answer);
        // MODEL is passed to html



       //return "games/physicsTrivia";
        return "";
    }






}
