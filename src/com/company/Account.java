package com.company;

import java.util.SortedSet;
import java.util.TreeSet;

public class Account {
    private String name;
    private SortedSet<String> emails;

    public Account(String name, SortedSet<String> emails) {
        this.name = name;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SortedSet<String> getEmails() {
        return emails;
    }

    public void setEmails(SortedSet<String> emails) {
        this.emails = emails;
    }
}
