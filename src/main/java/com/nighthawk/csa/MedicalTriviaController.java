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
public class MedicalTriviaController implements WebMvcConfigurer {
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

    MedicalTriviaController() {
        AllTrivia.add(
                new Trivia("What is something you should NOT do when someone is having a cardiac or breathing emergency?",
                        new String[]{"Perform CPR", "Call 911", "Stand there and watch", "scream for help"},
                        "c"));

        AllTrivia.add(
                new Trivia("Which of these is the correct first step to CPR?",
                        new String[]{"Call 911 and get equipment", "Give 30 chest compressions", "Give 2 breaths", "Give 50 chest compressions"},
                        "a"));

        AllTrivia.add(
                new Trivia("Fainting is a brief loss of consciousness. Why does it occur?",
                        new String[]{"Drop in blood flow to the brain", "Heat or dehydration", "Standing up too quickly", "All of the above"},
                        "d"));

        AllTrivia.add(
                new Trivia("Which of the following can NOT happen before someone is about to faint?",
                        new String[]{"Lose muscle control", "Tunnel vision or noises fading into background", "Feel weak, sweaty, or nauseated", "Increased color in their face"},
                        "d"));

        AllTrivia.add(
                new Trivia("Which of these is a symptom of a heart attack?",
                        new String[]{"Discomfort in one or both arms, back, neck, jaw, or stomach", "Shortness of breath", "Cold sweat, dizziness, feeling light-headed", "All of the above"},
                        "d"));

        AllTrivia.add(
                new Trivia("Which of these is a warning sign of a stroke?",
                        new String[]{"Sudden, severe headache with no known cause", "Sudden confusion, trouble speaking or understanding", "Answer choices a&b", "None of the above"},
                        "c"));

        AllTrivia.add(
                new Trivia("What is sudden cardiac arrest?",
                        new String[]{"The abrupt loss of heart function/breathing/consciousness", "Sudden blood loss to the brain", "Dizziness", "None of the above"},
                        "a"));

        AllTrivia.add(
                new Trivia("Select the answer choice that correctly lists two symptoms of cardiac arrest",
                        new String[]{"Sudden collapse & shortness of breath", "Dizziness & shortness of breath", "Sudden collapse & dizziness", "Tumors & dizziness "},
                        "a"));

        AllTrivia.add(
                new Trivia("What is vertigo?",
                        new String[]{"When a person feels like they or the world are actually spinning", "When a person suddenly loses consciousness", "When the blood to a person’s heart is suddenly blocked", "All of the above"},
                        "a"));

        AllTrivia.add(
                new Trivia("Central vertigo is caused by a problem in the brain. Which of the following is a cause of central vertigo?",
                        new String[]{"Blood vessel disease", "Tumors (cancerous or noncancerous)", "Answer choices a & b", "None of the above"},
                        "c"));
    }

    @GetMapping("checkPhysicsTriviaAnswer")
    public String checkPhysicsTriviaAnswer (@RequestParam(name = "userAnswer", required = true, defaultValue = "a") String answer,
                                            Model model ) {
        // @RequestParam handles required and default values
        model.addAttribute("answer", answer);
        // MODEL is passed to html



        //return "games/medicalTrivia";
        return "";
    }

}
