package com.example.tpo3moviles;

import java.io.Serializable;
import java.util.List;

public class Libro implements Serializable {
    public String title, autor, year, description ;
    public  int image, page;

    public List<String> gender;

    public Libro(){

    }
    public Libro(String title, String autor, int page, String year, String description, int image, List<String> gender) {
        this.title = title;
        this.autor = autor;
        this.page = page;
        this.year = year;
        this.description = description;
        this.image = image;
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public List<String> getGender() {
        return gender;
    }

    public void setGender(List<String> gender) {
        this.gender = gender;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
