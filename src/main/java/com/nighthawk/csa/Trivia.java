package com.nighthawk.csa;
import java.util.Scanner;
public class Trivia {
    private boolean prompt;
    private String answer;

    public Trivia(String q1, String d) {
    }



    public static void takeTest(Trivia[] questions) {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = keyboardInput.nextLine();
            if(answer.equals(questions[i].answer)) {
                score++;
            }
        }
        System.out.println("You got " + score + "/" + questions.length);
    }

    public static void main (String[] args) {
        String q1 = "Under what condition are you allowed to use the 4 main kinematics equations?\n"
                + "(a)When time is constant\n(b)When position is constant\n(c)When velocity is constant]\n(d)When acceleration is constant\n";
        String q2 = "If a projectile is launched at an angle and returns back to the same height when it lands, what type of projectile motion is it?\n"
                + "(a)Type 1\n(b)Type 2\n(c)Type 3\n";
        Trivia [] questions = {
                new Trivia(q1, "d"),
                new Trivia(q2, "b"),
        };
        takeTest(questions);
    }

}
