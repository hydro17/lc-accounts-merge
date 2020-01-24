package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<List<String>> mergedAccounts = new Solution().accountsMerge(loadAccounts());

        for (List<String> account : mergedAccounts) {
            account.forEach(s -> System.out.print(s + ", "));
            System.out.println();
        }

//        List<Account> accountsWithSets = new Solution().convertAccountsToAccountsWithSets(loadAccounts());
//        for (Account account : accountsWithSets) {
//            System.out.println(account.getName());
//            account.getEmails().forEach(e->System.out.print(e + ", "));
//        }
//
//        System.out.println("------------");
//        List<List<String>> accounts = new Solution().convertAccountsWithSetsToAccounts(accountsWithSets);
//        for (List<String> account : accounts) {
//            System.out.println();
//            account.forEach(a -> System.out.print(a + ", "));
//
//        }
    }

    private static List<List<String>> loadAccounts() {
        return new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList("Mark", "mark3@gmail.com", "mark2@gmail.com", "mark1@gmail.com")),
                new ArrayList<>(Arrays.asList("Peter", "peter1@gmail.com", "peter3@gmail.com", "peter2@gmail.com")),
                new ArrayList<>(Arrays.asList("John", "john1@gmail.com", "john2@gmail.com", "john3@gmail.com")),
                new ArrayList<>(Arrays.asList("Peter", "peter5@gmail.com", "peter4@gmail.com", "peter2@gmail.com")),
                new ArrayList<>(Arrays.asList("Kate", "kate1@gmail.com", "kate2@gmail.com", "kate3@gmail.com")),
                new ArrayList<>(Arrays.asList("Ann", "ann2@gmail.com", "ann1@gmail.com", "ann3@gmail.com")),
                new ArrayList<>(Arrays.asList("Peter", "peter6@gmail.com", "peter7@gmail.com", "peter5@gmail.com"))
        ));
    }
}
