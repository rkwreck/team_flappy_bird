package com.nighthawk.csa;

// Write a Class Number

import java.util.ArrayList;
import java.util.Random;


public class Number {
    // instance variables
    private int x;
    private int index;
    private ArrayList<Number> squirrels;

    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class



    public Number() {

    }


    public int Index(Number object){

        int index = squirrels.indexOf(object);

        return index;
    }

    public int Num(){
        int number = (int)(Math.random()*37+3);
        this.x = number;
        return number;
    }


    // It contains a getter for the Random Number


    // It contains a getter for Index, or the order it was initialized




    // Write a tester method
    public static void main(String[] args) {

        ArrayList<Number> squirrels = new ArrayList<Number>();

        //this.squirrels = squirrels;

        Number s1 = new Number();
        Number s2 = new Number();
        Number s3 = new Number();
        Number s4 = new Number();
        Number s5 = new Number();
        Number s6 = new Number();
        Number s7 = new Number();
        Number s8 = new Number();
        Number s9 = new Number();
        Number s10 = new Number();

        squirrels.add(s1);
        squirrels.add(s1);
        squirrels.add(s2);
        squirrels.add(s3);
        squirrels.add(s4);
        squirrels.add(s5);
        squirrels.add(s6);
        squirrels.add(s7);
        squirrels.add(s8);
        squirrels.add(s9);
        squirrels.add(s10);

        int ind = 0;

        for (Number squirrel : squirrels){

            System.out.print(squirrel);
            int count = squirrel.Num();
            System.out.println("Squirrels: " + count + ". Day: " + ind);
            ind++;


        }

        // Create an ArrayList of Type Number, my ArrayList is called squirrels

        // Initialize 10 squirrels of class type Number
        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops


        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop

    }

}