package com.example.tpo3moviles.Model;

import java.io.Serializable;

public class Libro implements Serializable {
    public int id;
    public String title, autor, year, description;
    public int image;
    public int pages;
    public String genres;

    public Libro() {

    }

    public Libro(int id, String title, String autor, String year, String description, int image, int pages, String genres) {
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.year = year;
        this.description = description;
        this.image = image;
        this.pages = pages;
        this.genres = genres;
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }
}
