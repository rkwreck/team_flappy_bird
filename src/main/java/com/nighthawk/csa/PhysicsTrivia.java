package com.nighthawk.csa;
import java.util.Scanner;
public class PhysicsTrivia {
    boolean prompt;
    String answer;

    public PhysicsTrivia(String q1, String correctAnswer) {
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
        PhysicsTrivia [] questions = {
                new PhysicsTrivia(q1, "d"),
                new PhysicsTrivia(q2, "b"),
                new PhysicsTrivia(q3, "b"),
                new PhysicsTrivia(q4,"b"),
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