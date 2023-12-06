package com.company;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Candidate> candidateSet = new TreeSet<>(new CandidateByComporator());
        while (true) {
            System.out.println("Введите информацию о кандидате (для завершения введите пустую строку):");
            System.out.println("Имя, Релевантность, Рейтинг");
            String input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("Программа завершена");
                break;
            }
            String[] part = input.split(" ");

            Candidate candidate = new Candidate(part[0], Integer.parseInt(part[1]), Integer.parseInt(part[2]));
            candidateSet.add(candidate);


        }
        for (Candidate candidate : candidateSet) {
            System.out.println(candidate);
        }
    }
}
