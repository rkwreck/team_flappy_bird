package com.nighthawk.csa.data.SQL;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;
import java.util.ArrayList;

@Controller
public class friend implements Serializable{
    String name;
    String bio;
    String bday;
    String age;
    Boolean complete;

    public void addFriend(String n, String b, String bd, String a) {
        name = n;
        bio = b;
        bday = bd;
        age = a;
    }

    public String getName(){
        return name;
    }

    public String getBio(){
        return bio;
    }

    public String getDetails() {return bday;}

    public String getDate() {return age;}

    public ArrayList<friend> friendslist(){
        friend friend1 = new friend();//creating an object of Student
        friend friend2 = new friend();
        friend1.addFriend( "Susan", "A computer science coder", "December 10th" , "16");
        friend2.addFriend( "Bob", "Student in AP Computer Science", "December 14th", "17");

        ArrayList<friend> list = new ArrayList<>();
        list.add(friend1);
        list.add(friend2);

        return (list);
}

public static void main(String[] args) {
    //Creating an object or instance

}


@GetMapping("/friends")
// CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
public String friend(@RequestParam(name="name", required=false, defaultValue="Task title") String title,
                    @RequestParam(name="bio", required=false, defaultValue="Task description") String description,
                    @RequestParam(name="bday", required = false, defaultValue = "Task details") String details,
                    @RequestParam(name="age", required = false, defaultValue = "0000-00-00") String date,
                    Model model) {
    // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
    //model.addAttribute("list", taskslist());

    friend friend10 = new friend();
    friend10.addFriend(name, bio, bday, age);

    friend friend1 = new friend();//creating an object of Student
    friend friend2 = new friend();
    friend friend3 = new friend();
    friend friend4 = new friend();//creating an object of Student
    friend friend5 = new friend();
    friend friend6 = new friend();
    friend friend7 = new friend();//creating an object of Student
    friend friend8 = new friend();
    friend friend9 = new friend();

    friend1.addFriend("Math homework", "DO YOUR MATH!!!!!", "More info on the assignment", "2022-06-01");
    friend2.addFriend("English Homework", "Write a whole essay", "More info on the assignment", "2022-06-01");
    friend3.addFriend("CompSci Homework", "Doing it right now :)", "More info on the assignment", "2022-06-01");
    friend1.addFriend("Math homework", "DO YOUR MATH!!!!!", "More info on the assignment", "2022-06-01");
    friend2.addFriend("English Homework", "Write a whole essay", "More info on the assignment", "2022-06-01");
    friend3.addFriend("CompSci Homework", "Doing it right now :)", "More info on the assignment", "2022-06-01");
    friend1.addFriend("Math homework", "DO YOUR MATH!!!!!", "More info on the assignment", "2022-06-01");
    friend2.addFriend("English Homework", "Write a whole essay", "More info on the assignment", "2022-06-01");
    friend3.addFriend("CompSci Homework", "Doing it right now :)", "More info on the assignment", "2022-06-01");


    ArrayList<friend> list = new ArrayList<>();
    list.add(friend1);
    list.add(friend2);
    list.add(friend3);
    list.add(friend4);
    list.add(friend5);
    list.add(friend6);
    list.add(friend7);
    list.add(friend8);
    list.add(friend9);
    list.add(friend10);
    model.addAttribute("list", list);

    return "friends"; // returns HTML VIEW (greeting)

}
}
