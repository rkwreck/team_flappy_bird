package com.nighthawk.csa.starters.squirrel;

import java.util.ArrayList;
import java.util.*;

// Write a Class Number
public class riniTest {
    // instance variables
    private int squirrels;

    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class
    public riniTest() {
        // constructor
        squirrels = (int) (Math.random() * ((36-3) + 3)); //initialize random number of squirrels
    }

    public riniTest(int num) {  //if initial number of squirrels is given
        squirrels = num;
    }

    // It contains a getter for the Random Number
    public int getNumOfSquirrels() {
        return squirrels;
    }

    // It contains a getter for Index, or the order it was initialized
    public int getIndex() {
        //return
    }


    // Write a tester method
    public static void main(String[] args) {

        //create ArrayList Index to keep track of when squirrelswere aded
        ArrayList<Integer> Index = new ArrayList<Integer>();

        // Create an ArrayList of Type Number, my ArrayList is called squirrels
        ArrayList squirrels;

        // Initialize 10 squirrels of class type Number
        squirrels = new ArrayList<riniTest>(10);
        Index.add(1);

        //Initialize Sample Output
        ArrayList squirrelOne = new ArrayList<riniTest>(3);
        Index.add(9);

        ArrayList squirrelTwo = new ArrayList<riniTest>(8);
        Index.add(0);

        ArrayList squirrelThree = new ArrayList<riniTest>(13);
        Index.add(7);

        ArrayList squirrelFive = new ArrayList<riniTest>(19);
        Index.add(6);

        ArrayList squirrelSix = new ArrayList<riniTest>(24);
        Index.add(5);

        ArrayList squirrelSeven = new ArrayList<riniTest>(25);
        Index.add(2);

        ArrayList squirrelEight = new ArrayList<riniTest>(28);
        Index.add(8);

        ArrayList squirrelNine = new ArrayList<riniTest>(32);
        Index.add(4);

        ArrayList squirrelTen = new ArrayList<riniTest>(34);
        Index.add(3);

        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops
        ArrayList Squirrel;

        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop
        System.out.println("This is the number of Squirrels and Index by which they were created.");
        //for (int i: squirrels) {
            //System.out.println("Squirrels: " + i);
            //for (int j: Index)

        }

    }

}