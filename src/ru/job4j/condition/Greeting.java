package ru.job4j.condition;

import java.sql.SQLOutput;

public class Greeting {

    public static void main(String[] args) {

        String idea = "I like Java!";
        System.out.println(idea);

        String separate = " ";
        idea = idea + separate + "But I am a newbie.";
        int year = 2021;
        idea = idea + separate + year;
        System.out.println(idea);

    }
}
