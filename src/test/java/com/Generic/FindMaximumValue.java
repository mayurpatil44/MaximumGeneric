package com.Generic;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumValue {

    @Test
    public void givenThreeStrings_WhenFirstPositionIsMax_ShouldReturnSameNumber()
    {
        FindMaximum findMaximum = new FindMaximum();
        String maxValue = findMaximum.MaximumString("Sandip","Mayur","Patil");
        Assert.assertEquals("Sandip",maxValue);
    }
    @Test
    public void givenThreeStrings_WhenSecondPositionIsMax_ShouldReturnSameNumber()
    {
        FindMaximum findMaximum = new FindMaximum();
        String maxValue = findMaximum.MaximumString("Mayur","Sandip","Patil");
        Assert.assertEquals("Sandip",maxValue);
    }
    @Test
    public void givenThreeStrings_WhenThirdPositionIsMax_ShouldReturnSameNumber()
    {
        FindMaximum findMaximum = new FindMaximum();
        String maxValue = findMaximum.MaximumString("Mayur","Patil","Sandip");
        Assert.assertEquals("Sandip",maxValue);
    }
}