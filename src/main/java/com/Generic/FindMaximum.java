package com.Generic;

public class FindMaximum {

    public String firstString;
    public String secondString;
    public String thirdString;

    public String MaximumString(String firstString,String secondString,String thirdString) {
        if(firstString.compareTo(secondString) > 0){
            return firstString;
        }
        else if(secondString.compareTo(thirdString) > 0){
            return secondString;
        }
        else{
            return thirdString;
        }

    }
}
