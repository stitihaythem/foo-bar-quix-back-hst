package com.kata.foobarquix.utils;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DivisorsUtilsTest {

    @Autowired
    DivisorsUtils divisorsUtils;

    @Test
    void getStringForInput(){

        Integer inputNumber = 9;

        Assertions.assertEquals("Foo", divisorsUtils.getStringForInput(inputNumber, divisorsUtils.conversionData.keySet()));

    }
}
