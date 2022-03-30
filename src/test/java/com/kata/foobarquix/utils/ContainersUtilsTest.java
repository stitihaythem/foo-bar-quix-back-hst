package com.kata.foobarquix.utils;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ContainersUtilsTest {

    @Autowired
    ContainersUtils containersUtils;

    @Test
    void getStringForInput(){

        Integer inputNumber = 9;

        Assertions.assertEquals("", containersUtils.getStringForInput(inputNumber, containersUtils.conversionData.keySet()));

    }
}
