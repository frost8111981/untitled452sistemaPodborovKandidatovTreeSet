package com.company;

import java.util.Comparator;

public class CandidateByComporator implements Comparator<Candidate> {
    @Override
    public int compare(Candidate o1, Candidate o2) {
        if (o1.relevance != o2.relevance) {
            return o2.relevance - o1.relevance; // Сначала сортируем по релевантности
        } else {
            return o2.rating - o1.rating; // Затем по оценке на собеседовании
        }
    }
}
