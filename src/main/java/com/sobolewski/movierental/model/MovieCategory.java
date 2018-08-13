package com.sobolewski.movierental.model;

public enum MovieCategory {

    SCIENCE_FICTION("Science Fiction"),
    HORROR("Horror"),
    ROMANCE("Romance"),
    TRAVEL("Travel"),
    SCIENCE("Science"),
    HISTORY("History"),
    FANTASY("Fantasy");

    private String text;

    MovieCategory(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
