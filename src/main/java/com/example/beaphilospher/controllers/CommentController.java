package com.example.beaphilospher.controllers;

public class CommentController {
    private int id;
    private String description;
    private Person made_by;
    private QuoteController quote;

    CommentController(int id, String description, Person made_by, QuoteController quote){
        this.id = id;
        this.description = description;
        this.made_by = made_by;
        this.quote = quote;
    }

    public void display(){

    }
}
