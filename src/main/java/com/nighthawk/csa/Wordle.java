package com.nighthawk.csa;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Random;



public class Wordle {



    private String word;


    //constructor
    public Wordle(String word) {

        ArrayList<String> wordList = new ArrayList<String>();
        wordList.add("biome");
        wordList.add("codon");
        wordList.add("fruit");
        wordList.add("hypha");
        wordList.add("model");
        wordList.add("phase");
        wordList.add("polyp");
        wordList.add("shell");
        wordList.add("spore");
        wordList.add("virus");
        wordList.add("xylem");
        wordList.add("codon");
        wordList.add("fluid");
        wordList.add("group");
        wordList.add("joule");
        wordList.add("solid");

        int x = (int)(Math.random()*22);
        String target = wordList.get(x);

        if (word.equals(target)){

        }

        //if a char in word is in target

        //if a char in word is in target, and is in same position






    }


}
