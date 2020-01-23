package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        new Solution().accountsMerge(loadAccounts());
    }

    private static List<List<String>> loadAccounts() {
        return List.of(
                List.of("Mark", "mark1@gmail.com", "mark2@gmail.com", "mark3@gmail.com"),
                List.of("Peter", "peter1@gmail.com", "peter2@gmail.com", "peter3@gmail.com"),
                List.of("John", "john1@gmail.com", "john2@gmail.com", "john3@gmail.com"),
                List.of("Peter", "peter2@gmail.com", "peter4@gmail.com", "peter5@gmail.com"),
                List.of("Kate", "kate1@gmail.com", "kate2@gmail.com", "kate3@gmail.com"),
                List.of("Ann", "john1@gmail.com", "john2@gmail.com", "john3@gmail.com"),
                List.of("Peter", "peter6@gmail.com", "peter7@gmail.com", "peter5@gmail.com")
        );
    }
}
