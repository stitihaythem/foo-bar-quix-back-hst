package com.kata.foobarquix.utils;

import java.util.HashMap;
import java.util.Set;

public abstract class NumberUtils {

    protected final HashMap<Integer, String> conversionData;

    NumberUtils(){
        conversionData = new HashMap<>();

        conversionData.put(3, "Foo");
        conversionData.put(5, "Bar");
    }

    public Set<Integer> getKeys(){
        return this.conversionData.keySet();
    }

    protected abstract String getStringForInput(Integer inputNumber, Set<Integer> keys);
}
