package com.kata.foobarquix.services


import com.kata.foobarquix.utils.ContainersUtils
import com.kata.foobarquix.utils.DivisorsUtils
import org.springframework.stereotype.Component

@Component
class FooBarQuixService(private val divisorsUtils: DivisorsUtils,
                        private val containersUtils: ContainersUtils) {



    fun convertNumber(inputNumber: Int): String {

        var returnedNumber  = ""

        val divisorsString =  divisorsUtils.getStringForInput(inputNumber,divisorsUtils.keys)

        val containedString = containersUtils.getStringForInput(inputNumber, containersUtils.keys)

        returnedNumber = if(divisorsString.isNotBlank() || containedString.isNotBlank()){
            divisorsString + containedString
        } else{
            inputNumber.toString()
        }

        return returnedNumber
    }

}
