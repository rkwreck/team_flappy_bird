package com.nighthawk.csa;
import java.util.Scanner;
import java.applet.*;
import java.awt.*;

public class PhysicsTrivia extends Applet{
    public class Question {
        String prompt;
        String answer;

        public Question(String prompt, String answer) {
            this.prompt = prompt;
            this.answer = answer;
        }
    }
    public void doTrivia() {
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

        Question [] questions = {
                new Question(q1, "d"),
                new Question(q2, "b"),
                new Question(q3, "a"),
                new Question(q4,"b"),
                new Question(q5, "c"),
                new Question(q6, "a"),
                new Question(q7, "d"),
                new Question(q8, "c"),
                new Question(q9, "a"),
                new Question(q10, "b")
        };
        takeTest(questions);
    }

    public static void main (String[] args) {
        PhysicsTrivia myTrivia = new PhysicsTrivia();
        myTrivia.doTrivia();
    }

    public static void takeTest(Question[] questions) {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = keyboardInput.nextLine();
            if (answer.equals(questions[i].answer)) {
                score++;
            }
        }
        System.out.println("You got " + score + "/" + questions.length);
    }

}
