package com.kata.foobarquix.utils;


import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class DivisorsUtils extends NumberUtils{

    DivisorsUtils(){
        super();
    }

    private boolean isDivisibleByNumber(Integer inputNumber, Integer divisibleBy) {

        return inputNumber % divisibleBy == 0;

    }


    public String getStringForInput(Integer inputNumber, Set<Integer> keys) {
        StringBuilder returnValue = new StringBuilder();

        for (Integer divNumber : keys) {
            if(isDivisibleByNumber(inputNumber, divNumber)) {
                returnValue.append(this.conversionData.getOrDefault(divNumber, ""));
            }
        }

        return returnValue.toString();
    }
}
