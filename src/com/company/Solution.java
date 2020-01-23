package com.company;

import java.time.chrono.MinguoDate;
import java.util.List;

public class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {

        int account1Idx = 0;
        while (account1Idx < accounts.size() - 1) {
            List<String> account1 = accounts.get(account1Idx);

            int account2Idx = account1Idx + 1;
            while (account2Idx < accounts.size()) {
                List<String> account2 = accounts.get(account2Idx);

                boolean sameUserAccounts = areSameUserAccounts(account1, account2);

                System.out. printf("Accounts %d and %d are of " + (sameUserAccounts ? "same user" : "different users") + "\n", account1Idx, account2Idx, sameUserAccounts);
                account2Idx++;
            }
            account1Idx++;
        }
        return null;
    }

    private boolean areSameUserAccounts(List<String> account1, List<String> account2) {

        if (!account1.get(0).equals(account2.get(0))) return false;

        for (int i = 1; i < account1.size(); i++) {
            for (int j = 1; j < account2.size(); j++) {
                if (account1.get(i).equals(account2.get(j))) return true;
            }
        }

        return false;
    }
}
