package com.kata.foobarquix.utils;


import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class ContainersUtils extends NumberUtils{

    ContainersUtils(){
        super();
        this.conversionData.put(7,"Quix");
    }


    private Integer[] numberToArray(Integer inputNumber) {

        int numberLength = String.valueOf(inputNumber).length();

        String[] numberSplit = inputNumber.toString().split("");

        Integer[] factorizedNumberArr = new Integer[numberLength];

        for (int index = 0; index < numberLength; index++) {

            factorizedNumberArr[index] = Integer.parseInt(numberSplit[index]);
        }

        return factorizedNumberArr;
    }


    public String getStringForInput(Integer inputNumber, Set<Integer> keys) {
        StringBuilder returnValue = new StringBuilder();

        List<Integer> containedNumber =  Arrays.stream(numberToArray(inputNumber)).filter(keys::contains).collect(Collectors.toList());

        for(Integer number : containedNumber){
            returnValue.append(this.conversionData.getOrDefault(number, ""));
        }

        return returnValue.toString();
    }


}
