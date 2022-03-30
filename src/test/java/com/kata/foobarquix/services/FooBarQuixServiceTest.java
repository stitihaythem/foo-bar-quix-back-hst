package com.kata.foobarquix.services;


import com.kata.foobarquix.utils.ContainersUtils;
import com.kata.foobarquix.utils.DivisorsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FooBarQuixServiceTest {

    FooBarQuixService fooBarQuixService;

    @Mock
    DivisorsUtils divisorsUtils;

    @Mock
    ContainersUtils containersUtils;

    @BeforeEach
    void init(){
        fooBarQuixService = new FooBarQuixService(divisorsUtils, containersUtils);
    }

    @Test
    void convertNumber(){
        Integer inputNumber = 9;

        Mockito.when(divisorsUtils.getStringForInput(inputNumber, divisorsUtils.getKeys())).thenReturn("Foo");
        Mockito.when(containersUtils.getStringForInput(inputNumber, containersUtils.getKeys())).thenReturn("");

        Assertions.assertEquals("Foo",fooBarQuixService.convertNumber(inputNumber));
    }
}
