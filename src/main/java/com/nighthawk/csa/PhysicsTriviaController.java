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

        AllTrivia.add(
                new Trivia("A 2.0 kg block is initially at rest on a frictionless surface. A force F changes its velocity to 5.0 m/s in 4 seconds. What is the block's acceleration?",
                        new String[]{"1.25 m/s^2", "1.25 m/s", "1.5 m/s^2", "1.5 m/s"},
                        "a"));

        AllTrivia.add(
                new Trivia("Which of these provides a conservative force then a nonconservative force? (Order matters!)",
                        new String[]{"Gravitational Force, Spring Force", "Air Resistance, Frictional Force", "Spring Force, Frictional Force", "Air Resistance, Gravitational Force"},
                        "c"));

        AllTrivia.add(
                new Trivia("What is the difference between an elastic and inelastic collision?",
                        new String[]{"Elastic: Momentum and Kinetic Energy are conserved, Inelastic: Momentum is conserved but Kinetic Energy is lost", "Elastic: Momentum is conserved but Kinetic Energy is lost, Inelastic: Momentum and Kinetic Energy are conserved", "Elastic: Momentum is conserved, Inelastic: Kinetic Energy is conserved", "Elastic: Kinetic Energy is conserved, Inelastic: Momentum is conserved"},
                        "a"));

        AllTrivia.add(
                new Trivia("What is impulse a change in?",
                        new String[]{"Energy", "Kinetic Energy", "Potential Energy", "Momentum"},
                        "d"));

        AllTrivia.add(
                new Trivia("A graph of Force in Newtons vs. Time in seconds of a tennis ball follows the function F = 0.5t. What is the tennis ball's impulse from 2.0 to 4.0 seconds?",
                        new String[]{"5 kg * m/s^2", "4 kg * m/s^2", "3 kg * m/s^2", "6 kg * m/s^2"},
                        "c"));

        AllTrivia.add(
                new Trivia("A perfectly horizontal meterstick has a 10 kg red ball at the 20cm mark and a 5 kg blue ball at the 70 cm mark. Calculate the center of mass in the x direction with respect to the 50 cm mark as the origin.",
                        new String[]{"-13.33 cm", "36.67 cm", "-13.33 m", "36.67 m"},
                        "a"));

        AllTrivia.add(
                new Trivia("Lambda is for linear mass density, sigma is for surface area density so rho is for ___.",
                        new String[]{"Momentum Density", "Volume Density", "3D Density", "Impulse Density"},
                        "b"));

        AllTrivia.add(
                new Trivia("Which of these objects will win in a race if they all are released from rest at the same time and travel the same distance? Hint: make sure to consider moment of inertia!",
                        new String[]{"Small Hoop", "Sphere", "Cylinder", "Large Hoop"},
                        "b"));
    }



}
