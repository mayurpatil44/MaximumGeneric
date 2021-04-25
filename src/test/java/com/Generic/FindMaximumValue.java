package com.Generic;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumValue {

    @Test
    public void givenThreeIntegers_WhenFirstPositionIsMax_ShouldReturnFirstNumber(){
        FindMaximum findMaximum = new FindMaximum();
        Integer maxValue = findMaximum.MaximumNumber(9,6,3);
        Assert.assertSame(9,maxValue);
    }
    @Test
    public void givenThreeIntegers_WhenSecondPositionIsMax_ShouldReturnSameNumber(){
        FindMaximum findMaximum = new FindMaximum();
        Integer maxValue = findMaximum.MaximumNumber(44,77,50);
        Assert.assertSame(77,maxValue);
    }
    @Test
    public void givenThreeIntegers_WhenThirdPositionIsMax_ShouldReturnSameNumber(){
        FindMaximum findMaximum = new FindMaximum();
        Integer maxValue = findMaximum.MaximumNumber(50,44 ,77);
        Assert.assertSame(77,maxValue);
    }
}