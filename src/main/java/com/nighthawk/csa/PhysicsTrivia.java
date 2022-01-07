package com.nighthawk.csa;
import java.util.Scanner;
public class PhysicsTrivia {
    boolean prompt;
    String answer;

    public PhysicsTrivia(String question, String correctAnswer) {
    }



    public static void main (String[] args) {
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
        String q10 = "";
        PhysicsTrivia [] questions = {
                new PhysicsTrivia(q1, "d"),
                new PhysicsTrivia(q2, "b"),
                new PhysicsTrivia(q3, "a"),
                new PhysicsTrivia(q4,"b"),
                new PhysicsTrivia(q5, "c"),
                new PhysicsTrivia(q6, "a"),
                new PhysicsTrivia(q7, "d"),
                new PhysicsTrivia(q8, "c"),
                new PhysicsTrivia(q9, "a"),
                new PhysicsTrivia(q10, "b")
        };
        takeTest(questions);
    }

    public static void takeTest(PhysicsTrivia[] questions) {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);
        for (PhysicsTrivia question : questions) {
            System.out.println(question.prompt);
            String answer = keyboardInput.nextLine();
            if (answer.equals(question.answer)) {
                score++;
            }
        }
        System.out.println("You got " + score + "/" + questions.length);
    }

}
