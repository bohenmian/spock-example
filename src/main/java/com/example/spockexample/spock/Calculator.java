package com.example.spockexample.spock;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Calculator {

    public List<Person> list = new ArrayList<>();
    private CacheService cacheService;

    public Calculator(CacheService cacheService) {
        this.cacheService = cacheService;
    }

    public int size(String text) {
        return text.length();
    }

    public int sum(int x, int y) {
        return x + y;
    }

    public boolean isLoggedInUser(String userName) {
        return Objects.equals(userName, cacheService.getName());
    }

    public Person getValue(int index) {
        return list.get(index);
    }
}
