package com.example.spring_homework001;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.script.ScriptEngine;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class PostDOM {
    private String title;
    private String content;
    private String author;
    private ArrayList<String> tags;

    //default Constructors
    public PostDOM() {
    }

    public PostDOM(String title, String content, String author, ArrayList<String> tags) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }
}


