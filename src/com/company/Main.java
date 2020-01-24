package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Solution().accountsMerge(loadAccounts());
    }

    private static List<List<String>> loadAccounts() {
        return new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList("Mark", "mark1@gmail.com", "mark2@gmail.com", "mark3@gmail.com")),
                new ArrayList<>(Arrays.asList("Peter", "peter1@gmail.com", "peter2@gmail.com", "peter3@gmail.com")),
                new ArrayList<>(Arrays.asList("John", "john1@gmail.com", "john2@gmail.com", "john3@gmail.com")),
                new ArrayList<>(Arrays.asList("Peter", "peter2@gmail.com", "peter4@gmail.com", "peter5@gmail.com")),
                new ArrayList<>(Arrays.asList("Kate", "kate1@gmail.com", "kate2@gmail.com", "kate3@gmail.com")),
                new ArrayList<>(Arrays.asList("Ann", "ann1@gmail.com", "ann2@gmail.com", "ann3@gmail.com")),
                new ArrayList<>(Arrays.asList("Peter", "peter6@gmail.com", "peter7@gmail.com", "peter5@gmail.com"))
        ));
    }
}
