package com.Generic;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumValue {

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
    @Test
    public void givenThreeFloats_WhenThirdPositionIsMax_ShouldReturnSameNumber()
    {
        FindMaximum findMaximum = new FindMaximum();
        Double maxValue =  findMaximum.MaximumFloatNum(1.1,2.2, 3.3);
        Assert.assertEquals((Double) 3.3,maxValue);
    }
}