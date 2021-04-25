package com.Generic;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumValue {

    @Test
    public void givenThreeIntegers_WhenFirstPositionIsMax_ShouldReturnFirstNumber() {
        FindMaximum findMaximum = new FindMaximum();
        Integer maxValue = findMaximum.MaximumNumber(9, 6, 3);
        Assert.assertSame(9, maxValue);
    }

    @Test
    public void givenThreeIntegers_WhenSecondPositionIsMax_ShouldReturnSameNumber() {
        FindMaximum findMaximum = new FindMaximum();
        Integer maxValue = findMaximum.MaximumNumber(44, 77, 50);
        Assert.assertSame(77, maxValue);
    }

    @Test
    public void givenThreeIntegers_WhenThirdPositionIsMax_ShouldReturnSameNumber() {
        FindMaximum findMaximum = new FindMaximum();
        Integer maxValue = findMaximum.MaximumNumber(50, 44, 77);
        Assert.assertSame(77, maxValue);
    }

    @Test
    public void givenThreeFloats_WhenFirstPositionIsMax_ShouldReturnSameNumber() {
        FindMaximum findMaximum = new FindMaximum();
        Double maxValue = findMaximum.MaximumFloatNum(3.3, 2.2, 1.1);
        Assert.assertEquals((Double) 3.3, maxValue);
    }
    @Test
    public void givenThreeFloats_WhenSecondPositionIsMax_ShouldReturnSameNumber()
    {
        FindMaximum findMaximum = new FindMaximum();
        Double maxValue = findMaximum.MaximumFloatNum(2.2,3.3, 1.1);
        Assert.assertEquals((Double) 3.3,maxValue);
    }

}