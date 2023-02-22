package com.Shubham.Student_Library_Manegment_System.DTOs;

import com.Shubham.Student_Library_Manegment_System.Enum.Genre;

public class BookResponseDto {

    private String name;
    private int pages;

    private Genre genre;

    public BookResponseDto(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}