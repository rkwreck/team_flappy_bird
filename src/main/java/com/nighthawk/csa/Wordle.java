package com.nighthawk.csa;

import java.util.ArrayList;
import java.util.List;


public class Wordle {
    private String char1 = null;
    private String char2 = null;
    private String char3 = null;
    private String char4 = null;
    private String char5 = null;
    private ArrayList<String> wordList;
    private String target;
    private String ta1;
    private String ta2;
    private String ta4;
    private String ta3;
    private String ta5;

    // Zero argument Constructor
    public Wordle() {
        this.char1 = char1;
        this.char2 = char2;
        this.char3 = char3;
        this.char4 = char4;
        this.char5 = char5;
    }

    // Getters
    public String compareCh1() { return this.char1; }
    public String compareCh2() { return this.char2; }
    public String compareCh3() { return this.char3; }
    public String compareCh4() { return this.char4; }
    public String compareCh5() { return this.char5; }

    // wordlist and getting the letters

    public void wordslist() {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("biome");
        wordList.add("codon");
        wordList.add("fruit");
        wordList.add("hypha");
        wordList.add("model");
        wordList.add("phase");
        wordList.add("polyp");
        wordList.add("shell");
        wordList.add("phyla");
        wordList.add("spore");
        wordList.add("virus");
        wordList.add("xylem");
        wordList.add("codon");
        wordList.add("fluid");
        wordList.add("group");
        wordList.add("joule");
        wordList.add("solid");
        wordList.add("plant");
        wordList.add("berry");
        wordList.add("birds");
        wordList.add("genes");

        this.wordList = wordList;

        int x = (int) (Math.random() * 20);

        String target = wordList.get(x);
        this.target = target;

        String word = char1 + char2 + char3 + char4 + char5;


        String ta1 = target.substring(0, 1);
        this.ta1 = ta1;
        String ta2 = target.substring(1, 2);
        this.ta2 = ta2;
        String ta3 = target.substring(2, 3);
        this.ta3 = ta3;
        String ta4 = target.substring(3, 4);
        this.ta4 = ta4;
        String ta5 = target.substring(4, 5);
        this.ta5 = ta5;
    }





    // Setter to add and Event to Events


    // Setters
    public void setchar1(String char1) { this.char1 = char1; }
    public void setchar2(String char2) { this.char2 = char2; }
    public void setchar3(String char3) { this.char3 = char3; }
    public void setchar4(String char4) { this.char4 = char4; }
    public void setchar5(String char5) { this.char5 = char5; }

    // Set new string sequence properties
    public void wordleme(String char1) {
        this.setchar1(char1);
        this.setchar2(char2);
        this.setchar3(char3);
        this.setchar4(char4);
        this.setchar5(char5);
        //this.addEvent( "Construct '" + title + "' new object" );


    }

    public void compareChar1(String char1) {

        // first off, we have "if" conditional.
        if (char1.equals(ta1)) {
            this.char1 = "good job";
        }

        // second, we have "else if" conditional
        else if (target.contains(char1)) {
            this.char1 = char1 + " is in the word";
        }

        // third, we have "else" conditional
        else {
            this.char1 = char1 + " is not in the word.";
        }
    }

    // same thing, but for the second letter

    public void compareChar2(String char2) {

        // first off, we have "if" conditional.
        if (char2.equals(ta2)) {
            this.char2 = "good job";
        }

        // second, we have "else if" conditional
        else if (target.contains(char2)) {
            this.char2 = char2 + " is in the word";
        }

        // third, we have "else" conditional
        else {
            this.char2 = char2 + " is not in the word.";
        }
    }

    //testing the third character

    public void compareChar3(String char3) {

        // first off, we have "if" conditional.
        if (char3.equals(ta3)) {
            this.char3 = "good job";
        }

        // second, we have "else if" conditional
        else if (target.contains(char3)) {
            this.char3 = char3 + " is in the word";
        }

        // third, we have "else" conditional
        else {
            this.char3 = char3 + " is not in the word.";
        }
    }

    //testing the 4th letter
    public void compareChar4(String char4) {

        // first off, we have "if" conditional.
        if (char4.equals(ta4)) {
            this.char4 = "good job";
        }

        // second, we have "else if" conditional
        else if (target.contains(char4)) {
            this.char4 = char4 + " is in the word";
        }

        // third, we have "else" conditional
        else {
            this.char4 = char4 + " is not in the word.";
        }
    }

    // testing the 5th and final letter

    public void compareChar5(String char5) {

        // first off, we have "if" conditional.
        if (char5.equals(ta5)) {
            this.char5 = "good job";
        }

        // second, we have "else if" conditional
        else if (target.contains(char5)) {
            this.char5 = char5 + " is in the word";
        }

        // third, we have "else" conditional
        else {
            this.char5 = char5 + " is not in the word.";
        }
    }

    public static Wordle wordlemepls() {
        // Test 0 construct gradShow object
        Wordle wordd = new Wordle();
        wordd.compareChar1("char1");
        wordd.setchar1("StringOps FRQ 2 gradShow LightSequence");

        // Test1 set light sequence
        wordd.compareChar2("char2");
        wordd.setchar2("StringOps FRQ 2 gradShow LightSequence");

        // Test2 change content of object
        wordd.compareChar3("char3");
        wordd.setchar3("StringOps FRQ 2 gradShow LightSequence");

        // Test3 insert into content of object
        wordd.compareChar4("char4");
        wordd.setchar4("StringOps FRQ 2 gradShow LightSequence");

        // Test4 replacing segment with light sequence.
        wordd.compareChar5("char5");
        wordd.setchar5("StringOps FRQ 2 gradShow LightSequence");

        // History of events
        return wordd;
    }

    // StringOps object reference will return value of sequence attribute

    public String toString() {
        return char1.toString();
    }

    // Class tester
    public static void main(String[] args) {
        // FRQ2 result simulation using StringOps Class
        Wordle wordd = Wordle.wordlemepls();

        // History of events
        wordd.wordlemepls();
    }


}