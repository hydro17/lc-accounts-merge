package com.company;

import java.time.chrono.MinguoDate;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {

        List<Account> accountsWithSets = convertAccountsToAccountsWithSets(accounts);

        int account1Idx = 0;
        while (account1Idx < accountsWithSets.size() - 1) {
            Account account1 = accountsWithSets.get(account1Idx);

            int account2Idx = account1Idx + 1;
            while (account2Idx < accountsWithSets.size()) {
                Account account2 = accountsWithSets.get(account2Idx);

                boolean sameUserAccounts = areSameUserAccounts(account1, account2);

                if (sameUserAccounts) {
                    doMergeAccounts(account1, accountsWithSets, account2Idx);
                }

//                System.out. printf("Accounts %d and %d are of " + (sameUserAccounts ? "same user" : "different users") + "\n",
//                        account1Idx, account2Idx, sameUserAccounts);

                account2Idx++;
            }
            account1Idx++;
        }

        List<List<String>> mergedAccounts = convertAccountsWithSetsToAccounts(accountsWithSets);

        return mergedAccounts;
    }

    private boolean areSameUserAccounts(Account account1, Account account2) {

        if (!account1.getName().equals(account2.getName())) return false;

        SortedSet<String> tmpAccount1Emails = new TreeSet<>(account1.getEmails());
        tmpAccount1Emails.retainAll(account2.getEmails());

        return tmpAccount1Emails.size() > 0;
    }

    public List<Account> convertAccountsToAccountsWithSets(List<List<String>> accounts) {
        List<Account> accountsWithSets = new ArrayList<>();

        for (List<String> account : accounts) {
            Account accountWithSet = new Account(account.get(0), new TreeSet<>(account.subList(1, account.size())));
            accountsWithSets.add(accountWithSet);
        }

        return accountsWithSets;
    }

    public List<List<String>> convertAccountsWithSetsToAccounts(List<Account> accountsWithSets) {
        List<List<String>> accounts = new ArrayList<>();

        for (Account accountWithSet : accountsWithSets) {
            List<String> account = new ArrayList<>();
            account.add(accountWithSet.getName());
            account.addAll(accountWithSet.getEmails());
            accounts.add(account);
        }

        return accounts;
    }

    private void doMergeAccounts(Account account1, List<Account> accounts, int account2Idx) {
        Account account2 = accounts.get(account2Idx);

        account1.getEmails().addAll(account2.getEmails());

        accounts.remove(account2Idx);
    }
}
