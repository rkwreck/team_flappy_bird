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

    // Autowired enables Control to connect HTML and POJO Object to Database easily for CRUD

    public String answer;




    @GetMapping("/games/physicsTrivia")
    public String physicsTrivia (@RequestParam(name = "answer", required = false, defaultValue = "World") String answer,
                            Model model ) {
        // @RequestParam handles required and default values, name and database are class variables, database looking like JSON
        model.addAttribute("answer", answer);
        // MODEL is passed to html
        String q1 = "Under what condition are you allowed to use the 4 main kinematics equations?\n"
                + "(a)When time is constant\n(b)When position is constant\n(c)When velocity is constant]\n(d)When acceleration is constant\n";
        String q2 = "If a projectile is launched at an angle and returns back to the same height when it lands, what type of projectile motion is it?\n"
                + "(a)Type 1\n(b)Type 2\n(c)Type 3\n";
        String q3 = "A 2.0 kg block is initially at rest on a frictionless surface. A force F changes its velocity to 5.0 m/s in 4 seconds. What is the block's acceleration?\n"
                + "(a)1.25 m/s\n(b)1.25 m/s^2\n(c)1.5 m/s\n(d)1.5 m/s^2";
        String q4 = "Which of these is the appropriate free body diagram for a 2.0 kg block at rest on a frictionless surface?\n"
                + "(a)AnswerA\n(b)AnswerB]\n(c)AnswerC\n(d)AnswerD";
        String q5 = "Which of these provides a conservative force then a nonconservative force? (Order matters!)\n" +
                "(a)Gravitational Force, Spring Force\n(b)Air Resistance, Frictional Force\n(c)Spring Force, Frictional Force\n(d)Air Resistance, Gravitational Force";
        String q6 = "What is the difference between an elastic and inelastic collision?\n"
                + "(a)Elastic: Momentum and Kinetic Energy are conserved, Inelastic: Momentum is conserved but Kinetic Energy is lost\n(b)Elastic: Momentum is conserved but Kinetic Energy is lost, Inelastic: Momentum and Kinetic Energy are conserved";
        String q7 = "What is impulse a change in?\n"
                + "(a)Energy\n(b)Kinetic Energy\n(c)Potential Energy\n(d)Momentum";
        String q8 ="A graph of Force in Newtons vs. Time in seconds of a tennis ball is plotted. What is the tennis ball's impulse from 2.0 to 4.0 seconds?"
                + "(a)5 kg * m/s^2\n(b)10 N*s\n(c)5 N*s\n(d)10 kg*m/s";
        String q9 = "A perfectly horizontal meterstick has a 10 kg red ball at the 20cm mark and a 5 kg blue ball at the 70 cm mark. Calculate the center of mass in the x direction with respect to the 50 cm mark as the origin.\n"
                + "(a)-13.33 cm\n(b)36.67 cm\n(c)-13.33 m\n(d)36.67 m";
        String q10 = "Lambda is for linear mass density, sigma is for surface area density so rho is for ___.\n" +
                "(a)Momentum Density\n(b)Volume Density\n(c)3D Density\n(d)Impulse Density";
        ArrayList<String> physicsQ = new ArrayList<String>();

        physicsQ.add(q1);
        physicsQ.add(q2);
        physicsQ.add(q3);
        physicsQ.add(q4);
        physicsQ.add(q5);
        physicsQ.add(q6);
        physicsQ.add(q7);
        physicsQ.add(q8);
        physicsQ.add(q9);
        physicsQ.add(q10);

        ArrayList<String> physicsA = new ArrayList<String>();
        physicsA.add("d");
        physicsA.add("b");
        physicsA.add("a");
        physicsA.add("b");
        physicsA.add("c");
        physicsA.add("a");
        physicsA.add("d");
        physicsA.add("c");
        physicsA.add("a");
        physicsA.add("b");

        // when you write your answer, make sure to write in the letter that's correct, not the actual answer itself

       for (int i=0; i<10; i++) {
           String target = physicsA.get(i);
           if (answer == target){
               answer = "good job";
               this.answer = answer;
               return "good job";
           }
           else {
               answer = "incorect";
               this.answer = answer;
               return "incorrect";
           }
       }
        return "games/physicsTrivia";
    }






}
