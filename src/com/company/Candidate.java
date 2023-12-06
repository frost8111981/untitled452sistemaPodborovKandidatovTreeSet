package com.company;

public class Candidate {
    String name;
    int relevance;
    int rating;

    public Candidate(String name, int relevance, int rating) {
        this.name = name;
        this.relevance = relevance;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name +  " " + relevance + " " + rating;
    }

    public String getName() {
        return name;
    }

    public int getRelevance() {
        return relevance;
    }

    public int getRating() {
        return rating;
    }
}
