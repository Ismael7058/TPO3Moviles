package com.example.tpo3moviles;

public class Libro {
    public String title, autor, year, description ;
    public  int image;

    public Libro(){

    }
    public Libro(String title, String autor, String year, String description, int image) {
        this.title = title;
        this.autor = autor;
        this.year = year;
        this.description = description;
        this.image = image;
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
}
