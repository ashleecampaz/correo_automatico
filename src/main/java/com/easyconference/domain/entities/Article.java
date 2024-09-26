/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.easyconference.domain.entities;

import java.util.ArrayList;

/**
 *
 * @author Ashlee Campaz
 */
public class Article {
    
    public static class Author{
        private String name;
        private String lastname;
        private String email; 

        public Author(String name, String lastname, String email) {
            this.name = name;
            this.lastname = lastname;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
        
        
    }
    private String title;
    private String summary;
    private String keyWords[];
    private ArrayList<Author> autores; 
    
    public Article(){}
    
    public Article(String t, String s, String[] k, ArrayList<Author> au){
        this.title = t;
        this.summary = s;
        this.keyWords = k;
        this.autores = au;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String[] getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String[] keyWords) {
        this.keyWords = keyWords;
    }

    public ArrayList<Author> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Author> autores) {
        this.autores = autores;
    }
    
    
}
