package com.sobolewski.movierental.model;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="movie")
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name = "country")
    private String country;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="release_date")
    private LocalDate release;

    @Enumerated(EnumType.STRING)
    @Column(name="category")
    private MovieCategory category;

    @Column(name = "length")
    private Integer length;

    @Column(name="summary")
    private String summary;


    public Movie(){}

    public Movie(String title, String country, LocalDate release, MovieCategory category, Integer length, String summary) {
        this.title = title;
        this.country = country;
        this.release = release;
        this.category = category;
        this.length = length;
        this.summary = summary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getRelease() {
        return release;
    }

    public void setRelease(LocalDate release) {
        this.release = release;
    }

    public MovieCategory getCategory() {
        return category;
    }

    public void setCategory(MovieCategory category) {
        this.category = category;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
