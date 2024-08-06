package com.example.spring_homework001;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.script.ScriptEngine;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Post {
   private int id;
   private String title;
   private String content;
   private String author;

   private String creationTime ;
   private ArrayList<String> tags;

   //default Constructors
   public Post(){
   }

   public Post(String title, String content, String author, String creationTime, ArrayList<String> tags) {
      this.id = id;
      this.title = title;
      this.content = content;
      this.author = author;
      this.creationTime = creationTime;
      this.tags = tags;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
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

   public String getCreationTime() {
      return creationTime;
   }

   public void setCreationTime(String creationTime) {
      this.creationTime = creationTime;
   }

   public ArrayList<String> getTags() {
      return tags;
   }

   public void setTags(ArrayList<String> tags) {
      this.tags = tags;
   }
}

